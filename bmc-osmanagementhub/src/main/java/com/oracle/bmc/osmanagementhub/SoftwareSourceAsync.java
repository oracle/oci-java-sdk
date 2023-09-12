/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Use the OS Management Hub API to manage and monitor updates and patches for the operating system
 * environments in your private data centers through a single management console. For more
 * information, see [Overview of OS Management
 * Hub](https://docs.cloud.oracle.com/iaas/osmh/doc/overview.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public interface SoftwareSourceAsync extends AutoCloseable {

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
     * Updates the availability for a list of specified software sources.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAvailabilityOfSoftwareSourcesResponse>
            changeAvailabilityOfSoftwareSources(
                    ChangeAvailabilityOfSoftwareSourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAvailabilityOfSoftwareSourcesRequest,
                                    ChangeAvailabilityOfSoftwareSourcesResponse>
                            handler);

    /**
     * Registers the necessary entitlement credentials for OS vendor software sources.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateEntitlementResponse> createEntitlement(
            CreateEntitlementRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateEntitlementRequest, CreateEntitlementResponse>
                    handler);

    /**
     * Creates a new versioned or custom software source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSoftwareSourceResponse> createSoftwareSource(
            CreateSoftwareSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSoftwareSourceRequest, CreateSoftwareSourceResponse>
                    handler);

    /**
     * Deletes the specified software source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSoftwareSourceResponse> deleteSoftwareSource(
            DeleteSoftwareSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSoftwareSourceRequest, DeleteSoftwareSourceResponse>
                    handler);

    /**
     * Gets information about the specified erratum by its advisory name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetErratumResponse> getErratum(
            GetErratumRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetErratumRequest, GetErratumResponse> handler);

    /**
     * Gets information about the specified module stream in a software source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetModuleStreamResponse> getModuleStream(
            GetModuleStreamRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetModuleStreamRequest, GetModuleStreamResponse>
                    handler);

    /**
     * Gets information about the specified module stream profile in a software source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetModuleStreamProfileResponse> getModuleStreamProfile(
            GetModuleStreamProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetModuleStreamProfileRequest, GetModuleStreamProfileResponse>
                    handler);

    /**
     * Gets information about the specified package group from a software source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPackageGroupResponse> getPackageGroup(
            GetPackageGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPackageGroupRequest, GetPackageGroupResponse>
                    handler);

    /**
     * Gets information about the specified software package.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSoftwarePackageResponse> getSoftwarePackage(
            GetSoftwarePackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwarePackageRequest, GetSoftwarePackageResponse>
                    handler);

    /**
     * Gets information about the specified software source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSoftwareSourceResponse> getSoftwareSource(
            GetSoftwareSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwareSourceRequest, GetSoftwareSourceResponse>
                    handler);

    /**
     * Lists entitlements in the specified tenancy OCID. Filter the list against a variety of
     * criteria including but not limited to its CSI, and vendor name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListEntitlementsResponse> listEntitlements(
            ListEntitlementsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListEntitlementsRequest, ListEntitlementsResponse>
                    handler);

    /**
     * Lists all of the currently available errata. Filter the list against a variety of criteria
     * including but not limited to its name, classification type, advisory severity, and OS family.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListErrataResponse> listErrata(
            ListErrataRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListErrataRequest, ListErrataResponse> handler);

    /**
     * Lists module stream profiles from the specified software source OCID. Filter the list against
     * a variety of criteria including but not limited to its module name, stream name, and
     * (profile) name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListModuleStreamProfilesResponse> listModuleStreamProfiles(
            ListModuleStreamProfilesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>
                    handler);

    /**
     * Lists module streams from the specified software source OCID. Filter the list against a
     * variety of criteria including but not limited to its module name and (stream) name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListModuleStreamsResponse> listModuleStreams(
            ListModuleStreamsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListModuleStreamsRequest, ListModuleStreamsResponse>
                    handler);

    /**
     * Lists package groups that associate with the specified software source OCID. Filter the list
     * against a variety of criteria including but not limited to its name, and package group type.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPackageGroupsResponse> listPackageGroups(
            ListPackageGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPackageGroupsRequest, ListPackageGroupsResponse>
                    handler);

    /**
     * Lists software packages in the specified software source. Filter the list against a variety
     * of criteria including but not limited to its name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSoftwarePackagesResponse> listSoftwarePackages(
            ListSoftwarePackagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwarePackagesRequest, ListSoftwarePackagesResponse>
                    handler);

    /**
     * Lists available software source vendors. Filter the list against a variety of criteria
     * including but not limited to its name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSoftwareSourceVendorsResponse> listSoftwareSourceVendors(
            ListSoftwareSourceVendorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwareSourceVendorsRequest, ListSoftwareSourceVendorsResponse>
                    handler);

    /**
     * Lists software sources that match the specified tenancy or software source OCID. Filter the
     * list against a variety of criteria including but not limited to its name, status,
     * architecture, and OS family.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSoftwareSourcesResponse> listSoftwareSources(
            ListSoftwareSourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>
                    handler);

    /**
     * Lists modules from a list of software sources. Filter the list against a variety of criteria
     * including the module name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SearchSoftwareSourceModuleStreamsResponse>
            searchSoftwareSourceModuleStreams(
                    SearchSoftwareSourceModuleStreamsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SearchSoftwareSourceModuleStreamsRequest,
                                    SearchSoftwareSourceModuleStreamsResponse>
                            handler);

    /**
     * Lists modules from a list of software sources. Filter the list against a variety of criteria
     * including the (module) name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SearchSoftwareSourceModulesResponse> searchSoftwareSourceModules(
            SearchSoftwareSourceModulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SearchSoftwareSourceModulesRequest, SearchSoftwareSourceModulesResponse>
                    handler);

    /**
     * Searches the package groups from the specified list of software sources. Filter the list
     * against a variety of criteria including but not limited to its name, and group type.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SearchSoftwareSourcePackageGroupsResponse>
            searchSoftwareSourcePackageGroups(
                    SearchSoftwareSourcePackageGroupsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SearchSoftwareSourcePackageGroupsRequest,
                                    SearchSoftwareSourcePackageGroupsResponse>
                            handler);

    /**
     * Updates the specified software source's details, including but not limited to name,
     * description, and tags.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSoftwareSourceResponse> updateSoftwareSource(
            UpdateSoftwareSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSoftwareSourceRequest, UpdateSoftwareSourceResponse>
                    handler);
}
