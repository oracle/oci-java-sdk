/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh;

import com.oracle.bmc.servicemesh.requests.*;
import com.oracle.bmc.servicemesh.responses.*;

/**
 * Use the Service Mesh API to manage mesh, virtual service, access policy and other mesh related
 * items.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
public interface ServiceMeshAsync extends AutoCloseable {

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
     * Cancels the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Moves an AccessPolicy resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAccessPolicyCompartmentResponse>
            changeAccessPolicyCompartment(
                    ChangeAccessPolicyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAccessPolicyCompartmentRequest,
                                    ChangeAccessPolicyCompartmentResponse>
                            handler);

    /**
     * Moves a IngressGateway resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeIngressGatewayCompartmentResponse>
            changeIngressGatewayCompartment(
                    ChangeIngressGatewayCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIngressGatewayCompartmentRequest,
                                    ChangeIngressGatewayCompartmentResponse>
                            handler);

    /**
     * Moves a IngressGatewayRouteTable resource from one compartment identifier to another. When
     * provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeIngressGatewayRouteTableCompartmentResponse>
            changeIngressGatewayRouteTableCompartment(
                    ChangeIngressGatewayRouteTableCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIngressGatewayRouteTableCompartmentRequest,
                                    ChangeIngressGatewayRouteTableCompartmentResponse>
                            handler);

    /**
     * Moves a Mesh resource from one compartment identifier to another. When provided, If-Match is
     * checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMeshCompartmentResponse> changeMeshCompartment(
            ChangeMeshCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeMeshCompartmentRequest, ChangeMeshCompartmentResponse>
                    handler);

    /**
     * Moves a VirtualDeployment resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeVirtualDeploymentCompartmentResponse>
            changeVirtualDeploymentCompartment(
                    ChangeVirtualDeploymentCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVirtualDeploymentCompartmentRequest,
                                    ChangeVirtualDeploymentCompartmentResponse>
                            handler);

    /**
     * Moves a VirtualService resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeVirtualServiceCompartmentResponse>
            changeVirtualServiceCompartment(
                    ChangeVirtualServiceCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVirtualServiceCompartmentRequest,
                                    ChangeVirtualServiceCompartmentResponse>
                            handler);

    /**
     * Moves a VirtualServiceRouteTable resource from one compartment identifier to another. When
     * provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeVirtualServiceRouteTableCompartmentResponse>
            changeVirtualServiceRouteTableCompartment(
                    ChangeVirtualServiceRouteTableCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVirtualServiceRouteTableCompartmentRequest,
                                    ChangeVirtualServiceRouteTableCompartmentResponse>
                            handler);

    /**
     * Creates a new AccessPolicy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateAccessPolicyResponse> createAccessPolicy(
            CreateAccessPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAccessPolicyRequest, CreateAccessPolicyResponse>
                    handler);

    /**
     * Creates a new IngressGateway.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateIngressGatewayResponse> createIngressGateway(
            CreateIngressGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateIngressGatewayRequest, CreateIngressGatewayResponse>
                    handler);

    /**
     * Creates a new IngressGatewayRouteTable.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateIngressGatewayRouteTableResponse>
            createIngressGatewayRouteTable(
                    CreateIngressGatewayRouteTableRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateIngressGatewayRouteTableRequest,
                                    CreateIngressGatewayRouteTableResponse>
                            handler);

    /**
     * Creates a new Mesh.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMeshResponse> createMesh(
            CreateMeshRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateMeshRequest, CreateMeshResponse> handler);

    /**
     * Creates a new VirtualDeployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateVirtualDeploymentResponse> createVirtualDeployment(
            CreateVirtualDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateVirtualDeploymentRequest, CreateVirtualDeploymentResponse>
                    handler);

    /**
     * Creates a new VirtualService.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateVirtualServiceResponse> createVirtualService(
            CreateVirtualServiceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateVirtualServiceRequest, CreateVirtualServiceResponse>
                    handler);

    /**
     * Creates a new VirtualServiceRouteTable.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateVirtualServiceRouteTableResponse>
            createVirtualServiceRouteTable(
                    CreateVirtualServiceRouteTableRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateVirtualServiceRouteTableRequest,
                                    CreateVirtualServiceRouteTableResponse>
                            handler);

    /**
     * Deletes an AccessPolicy resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAccessPolicyResponse> deleteAccessPolicy(
            DeleteAccessPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAccessPolicyRequest, DeleteAccessPolicyResponse>
                    handler);

    /**
     * Deletes an IngressGateway resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteIngressGatewayResponse> deleteIngressGateway(
            DeleteIngressGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteIngressGatewayRequest, DeleteIngressGatewayResponse>
                    handler);

    /**
     * Deletes a IngressGatewayRouteTable resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteIngressGatewayRouteTableResponse>
            deleteIngressGatewayRouteTable(
                    DeleteIngressGatewayRouteTableRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteIngressGatewayRouteTableRequest,
                                    DeleteIngressGatewayRouteTableResponse>
                            handler);

    /**
     * Deletes a Mesh resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMeshResponse> deleteMesh(
            DeleteMeshRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteMeshRequest, DeleteMeshResponse> handler);

    /**
     * Deletes a VirtualDeployment resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVirtualDeploymentResponse> deleteVirtualDeployment(
            DeleteVirtualDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVirtualDeploymentRequest, DeleteVirtualDeploymentResponse>
                    handler);

    /**
     * Deletes a VirtualService resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVirtualServiceResponse> deleteVirtualService(
            DeleteVirtualServiceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVirtualServiceRequest, DeleteVirtualServiceResponse>
                    handler);

    /**
     * Deletes a VirtualServiceRouteTable resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVirtualServiceRouteTableResponse>
            deleteVirtualServiceRouteTable(
                    DeleteVirtualServiceRouteTableRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteVirtualServiceRouteTableRequest,
                                    DeleteVirtualServiceRouteTableResponse>
                            handler);

    /**
     * Get an AccessPolicy by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAccessPolicyResponse> getAccessPolicy(
            GetAccessPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAccessPolicyRequest, GetAccessPolicyResponse>
                    handler);

    /**
     * Gets an IngressGateway by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetIngressGatewayResponse> getIngressGateway(
            GetIngressGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIngressGatewayRequest, GetIngressGatewayResponse>
                    handler);

    /**
     * Gets a IngressGatewayRouteTable by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetIngressGatewayRouteTableResponse> getIngressGatewayRouteTable(
            GetIngressGatewayRouteTableRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIngressGatewayRouteTableRequest, GetIngressGatewayRouteTableResponse>
                    handler);

    /**
     * Gets a Mesh by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMeshResponse> getMesh(
            GetMeshRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMeshRequest, GetMeshResponse> handler);

    /**
     * Returns the attributes of the Proxy such as proxy image version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetProxyDetailsResponse> getProxyDetails(
            GetProxyDetailsRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetProxyDetailsRequest, GetProxyDetailsResponse>
                    handler);

    /**
     * Gets a VirtualDeployment by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetVirtualDeploymentResponse> getVirtualDeployment(
            GetVirtualDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVirtualDeploymentRequest, GetVirtualDeploymentResponse>
                    handler);

    /**
     * Gets a VirtualService by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetVirtualServiceResponse> getVirtualService(
            GetVirtualServiceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVirtualServiceRequest, GetVirtualServiceResponse>
                    handler);

    /**
     * Gets a VirtualServiceRouteTable by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetVirtualServiceRouteTableResponse> getVirtualServiceRouteTable(
            GetVirtualServiceRouteTableRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVirtualServiceRouteTableRequest, GetVirtualServiceRouteTableResponse>
                    handler);

    /**
     * Gets the status of the work request with the given ID.
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
     * Returns a list of AccessPolicy objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAccessPoliciesResponse> listAccessPolicies(
            ListAccessPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAccessPoliciesRequest, ListAccessPoliciesResponse>
                    handler);

    /**
     * Returns a list of IngressGatewayRouteTable objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIngressGatewayRouteTablesResponse>
            listIngressGatewayRouteTables(
                    ListIngressGatewayRouteTablesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListIngressGatewayRouteTablesRequest,
                                    ListIngressGatewayRouteTablesResponse>
                            handler);

    /**
     * Returns a list of IngressGateway objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIngressGatewaysResponse> listIngressGateways(
            ListIngressGatewaysRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIngressGatewaysRequest, ListIngressGatewaysResponse>
                    handler);

    /**
     * Returns a list of Mesh objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMeshesResponse> listMeshes(
            ListMeshesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListMeshesRequest, ListMeshesResponse> handler);

    /**
     * Returns a list of VirtualDeployments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListVirtualDeploymentsResponse> listVirtualDeployments(
            ListVirtualDeploymentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVirtualDeploymentsRequest, ListVirtualDeploymentsResponse>
                    handler);

    /**
     * Returns a list of VirtualServiceRouteTable objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListVirtualServiceRouteTablesResponse>
            listVirtualServiceRouteTables(
                    ListVirtualServiceRouteTablesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListVirtualServiceRouteTablesRequest,
                                    ListVirtualServiceRouteTablesResponse>
                            handler);

    /**
     * Returns a list of VirtualService objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListVirtualServicesResponse> listVirtualServices(
            ListVirtualServicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVirtualServicesRequest, ListVirtualServicesResponse>
                    handler);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
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
     * Updates the AccessPolicy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAccessPolicyResponse> updateAccessPolicy(
            UpdateAccessPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAccessPolicyRequest, UpdateAccessPolicyResponse>
                    handler);

    /**
     * Updates the IngressGateway.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIngressGatewayResponse> updateIngressGateway(
            UpdateIngressGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIngressGatewayRequest, UpdateIngressGatewayResponse>
                    handler);

    /**
     * Updates the IngressGatewayRouteTable.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIngressGatewayRouteTableResponse>
            updateIngressGatewayRouteTable(
                    UpdateIngressGatewayRouteTableRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateIngressGatewayRouteTableRequest,
                                    UpdateIngressGatewayRouteTableResponse>
                            handler);

    /**
     * Updates the Mesh.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMeshResponse> updateMesh(
            UpdateMeshRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateMeshRequest, UpdateMeshResponse> handler);

    /**
     * Updates the VirtualDeployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVirtualDeploymentResponse> updateVirtualDeployment(
            UpdateVirtualDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVirtualDeploymentRequest, UpdateVirtualDeploymentResponse>
                    handler);

    /**
     * Updates the VirtualService.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVirtualServiceResponse> updateVirtualService(
            UpdateVirtualServiceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVirtualServiceRequest, UpdateVirtualServiceResponse>
                    handler);

    /**
     * Updates the VirtualServiceRouteTable.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVirtualServiceRouteTableResponse>
            updateVirtualServiceRouteTable(
                    UpdateVirtualServiceRouteTableRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateVirtualServiceRouteTableRequest,
                                    UpdateVirtualServiceRouteTableResponse>
                            handler);
}
