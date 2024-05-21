/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf;

import com.oracle.bmc.waf.requests.*;
import com.oracle.bmc.waf.responses.*;

/**
 * API for the Web Application Firewall service.
 * Use this API to manage regional Web App Firewalls and corresponding policies for protecting HTTP services.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public interface WafAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

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
     * Moves a NetworkAddressList resource from one compartment to another.
     * When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeNetworkAddressListCompartmentResponse>
            changeNetworkAddressListCompartment(
                    ChangeNetworkAddressListCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNetworkAddressListCompartmentRequest,
                                    ChangeNetworkAddressListCompartmentResponse>
                            handler);

    /**
     * Moves a Web App Firewall resource from one compartment to another.
     * When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeWebAppFirewallCompartmentResponse>
            changeWebAppFirewallCompartment(
                    ChangeWebAppFirewallCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeWebAppFirewallCompartmentRequest,
                                    ChangeWebAppFirewallCompartmentResponse>
                            handler);

    /**
     * Moves a WebAppFirewallfPolicy resource from one compartment to another.
     * When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeWebAppFirewallPolicyCompartmentResponse>
            changeWebAppFirewallPolicyCompartment(
                    ChangeWebAppFirewallPolicyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeWebAppFirewallPolicyCompartmentRequest,
                                    ChangeWebAppFirewallPolicyCompartmentResponse>
                            handler);

    /**
     * Creates a new NetworkAddressList.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateNetworkAddressListResponse> createNetworkAddressList(
            CreateNetworkAddressListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateNetworkAddressListRequest, CreateNetworkAddressListResponse>
                    handler);

    /**
     * Creates a new WebAppFirewall.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateWebAppFirewallResponse> createWebAppFirewall(
            CreateWebAppFirewallRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateWebAppFirewallRequest, CreateWebAppFirewallResponse>
                    handler);

    /**
     * Creates a new WebAppFirewallPolicy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateWebAppFirewallPolicyResponse> createWebAppFirewallPolicy(
            CreateWebAppFirewallPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateWebAppFirewallPolicyRequest, CreateWebAppFirewallPolicyResponse>
                    handler);

    /**
     * Deletes a NetworkAddressList resource identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNetworkAddressListResponse> deleteNetworkAddressList(
            DeleteNetworkAddressListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteNetworkAddressListRequest, DeleteNetworkAddressListResponse>
                    handler);

    /**
     * Deletes a WebAppFirewall resource identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWebAppFirewallResponse> deleteWebAppFirewall(
            DeleteWebAppFirewallRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteWebAppFirewallRequest, DeleteWebAppFirewallResponse>
                    handler);

    /**
     * Deletes a WebAppFirewallPolicy resource identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWebAppFirewallPolicyResponse> deleteWebAppFirewallPolicy(
            DeleteWebAppFirewallPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteWebAppFirewallPolicyRequest, DeleteWebAppFirewallPolicyResponse>
                    handler);

    /**
     * Gets a NetworkAddressList by OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetNetworkAddressListResponse> getNetworkAddressList(
            GetNetworkAddressListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkAddressListRequest, GetNetworkAddressListResponse>
                    handler);

    /**
     * Gets a WebAppFirewall by OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWebAppFirewallResponse> getWebAppFirewall(
            GetWebAppFirewallRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetWebAppFirewallRequest, GetWebAppFirewallResponse>
                    handler);

    /**
     * Gets a WebAppFirewallPolicy with the given OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWebAppFirewallPolicyResponse> getWebAppFirewallPolicy(
            GetWebAppFirewallPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetWebAppFirewallPolicyRequest, GetWebAppFirewallPolicyResponse>
                    handler);

    /**
     * Gets the status of the WorkRequest with the given OCID.
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
     * Gets a list of all NetworkAddressLists in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListNetworkAddressListsResponse> listNetworkAddressLists(
            ListNetworkAddressListsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkAddressListsRequest, ListNetworkAddressListsResponse>
                    handler);

    /**
     * Lists of protection capabilities filtered by query parameters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListProtectionCapabilitiesResponse> listProtectionCapabilities(
            ListProtectionCapabilitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListProtectionCapabilitiesRequest, ListProtectionCapabilitiesResponse>
                    handler);

    /**
     * Lists of available group tags filtered by query parameters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListProtectionCapabilityGroupTagsResponse>
            listProtectionCapabilityGroupTags(
                    ListProtectionCapabilityGroupTagsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListProtectionCapabilityGroupTagsRequest,
                                    ListProtectionCapabilityGroupTagsResponse>
                            handler);

    /**
     * Gets a list of all WebAppFirewallPolicies in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWebAppFirewallPoliciesResponse> listWebAppFirewallPolicies(
            ListWebAppFirewallPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWebAppFirewallPoliciesRequest, ListWebAppFirewallPoliciesResponse>
                    handler);

    /**
     * Gets a list of all WebAppFirewalls in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWebAppFirewallsResponse> listWebAppFirewalls(
            ListWebAppFirewallsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWebAppFirewallsRequest, ListWebAppFirewallsResponse>
                    handler);

    /**
     * Return a (paginated) list of errors for a given WorkRequest.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Return a (paginated) list of logs for a given WorkRequest.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the WorkRequests in a compartment.
     *
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
     * Update the NetworkAddressList identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNetworkAddressListResponse> updateNetworkAddressList(
            UpdateNetworkAddressListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateNetworkAddressListRequest, UpdateNetworkAddressListResponse>
                    handler);

    /**
     * Updates the WebAppFirewall identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateWebAppFirewallResponse> updateWebAppFirewall(
            UpdateWebAppFirewallRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateWebAppFirewallRequest, UpdateWebAppFirewallResponse>
                    handler);

    /**
     * Update the WebAppFirewallPolicy identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateWebAppFirewallPolicyResponse> updateWebAppFirewallPolicy(
            UpdateWebAppFirewallPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateWebAppFirewallPolicyRequest, UpdateWebAppFirewallPolicyResponse>
                    handler);
}
