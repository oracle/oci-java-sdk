/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;

/**
 * The Organizations API allows you to consolidate multiple OCI tenancies into an organization, and
 * centrally manage your tenancies and its resources.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public interface OrganizationAsync extends AutoCloseable {

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
     * Approve an organization's child tenancy for transfer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ApproveOrganizationTenancyForTransferResponse>
            approveOrganizationTenancyForTransfer(
                    ApproveOrganizationTenancyForTransferRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ApproveOrganizationTenancyForTransferRequest,
                                    ApproveOrganizationTenancyForTransferResponse>
                            handler);

    /**
     * Creates a child tenancy asynchronously.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateChildTenancyResponse> createChildTenancy(
            CreateChildTenancyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateChildTenancyRequest, CreateChildTenancyResponse>
                    handler);

    /**
     * If certain validations are successful, initiate tenancy termination.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOrganizationTenancyResponse> deleteOrganizationTenancy(
            DeleteOrganizationTenancyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOrganizationTenancyRequest, DeleteOrganizationTenancyResponse>
                    handler);

    /**
     * Gets information about the organization.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOrganizationResponse> getOrganization(
            GetOrganizationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetOrganizationRequest, GetOrganizationResponse>
                    handler);

    /**
     * Gets information about the organization's tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOrganizationTenancyResponse> getOrganizationTenancy(
            GetOrganizationTenancyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOrganizationTenancyRequest, GetOrganizationTenancyResponse>
                    handler);

    /**
     * Gets a list of tenancies in the organization.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOrganizationTenanciesResponse> listOrganizationTenancies(
            ListOrganizationTenanciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOrganizationTenanciesRequest, ListOrganizationTenanciesResponse>
                    handler);

    /**
     * Lists organizations associated with the caller.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOrganizationsResponse> listOrganizations(
            ListOrganizationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOrganizationsRequest, ListOrganizationsResponse>
                    handler);

    /**
     * An asynchronous API to restore tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RestoreOrganizationTenancyResponse> restoreOrganizationTenancy(
            RestoreOrganizationTenancyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RestoreOrganizationTenancyRequest, RestoreOrganizationTenancyResponse>
                    handler);

    /**
     * Cancel an organization's child tenancy for transfer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UnapproveOrganizationTenancyForTransferResponse>
            unapproveOrganizationTenancyForTransfer(
                    UnapproveOrganizationTenancyForTransferRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UnapproveOrganizationTenancyForTransferRequest,
                                    UnapproveOrganizationTenancyForTransferResponse>
                            handler);

    /**
     * Assign the default subscription to the organization.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOrganizationResponse> updateOrganization(
            UpdateOrganizationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOrganizationRequest, UpdateOrganizationResponse>
                    handler);
}
