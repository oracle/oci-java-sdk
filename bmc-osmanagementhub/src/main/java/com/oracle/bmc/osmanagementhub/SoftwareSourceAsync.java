/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Use the OS Management Hub API to manage and monitor updates and patches for instances in OCI,
 * your private data center, or 3rd-party clouds. For more information, see [Overview of OS
 * Management Hub](https://docs.cloud.oracle.com/iaas/osmh/doc/overview.htm).
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
     * Adds packages to a software source. This operation can only be done for custom and versioned
     * custom software sources that are not created using filters. For a versioned custom software
     * source, you can only add packages when the source is created. Once content is added to a
     * versioned custom software source, it is immutable. Packages can be of the format: * name (for
     * example: git). If isLatestContentOnly is true, only the latest version of the package will be
     * added, otherwise all versions of the package will be added. *
     * name-version-release.architecture (for example: git-2.43.5-1.el8_10.x86_64) *
     * name-epoch:version-release.architecture (for example: git-0:2.43.5-1.el8_10.x86_64)
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddPackagesToSoftwareSourceResponse> addPackagesToSoftwareSource(
            AddPackagesToSoftwareSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddPackagesToSoftwareSourceRequest, AddPackagesToSoftwareSourceResponse>
                    handler);

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
     * Moves the specified software sources to a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSoftwareSourceCompartmentResponse>
            changeSoftwareSourceCompartment(
                    ChangeSoftwareSourceCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSoftwareSourceCompartmentRequest,
                                    ChangeSoftwareSourceCompartmentResponse>
                            handler);

    /**
     * Registers the necessary entitlement credentials for OS vendor software sources for a tenancy.
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
     * Creates a new software source.
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
     * Returns information about the specified erratum based on its advisory name.
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
     * Returns information about the specified module stream in a software source.
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
     * Returns information about the specified module stream profile in a software source.
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
     * Returns information about the specified package group from a software source.
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
     * Returns information about the specified software package.
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
     * Returns information about the specified software package based on its fully qualified name
     * (NVRA or NEVRA).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSoftwarePackageByNameResponse> getSoftwarePackageByName(
            GetSoftwarePackageByNameRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwarePackageByNameRequest, GetSoftwarePackageByNameResponse>
                    handler);

    /**
     * Returns information about the specified software source.
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
     * Returns an archive containing the list of packages in the software source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSoftwareSourceManifestResponse> getSoftwareSourceManifest(
            GetSoftwareSourceManifestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwareSourceManifestRequest, GetSoftwareSourceManifestResponse>
                    handler);

    /**
     * Lists software packages available through the OS Management Hub service. Filter the list
     * against a variety of criteria including but not limited to its name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAllSoftwarePackagesResponse> listAllSoftwarePackages(
            ListAllSoftwarePackagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAllSoftwarePackagesRequest, ListAllSoftwarePackagesResponse>
                    handler);

    /**
     * Lists software packages that are available to be added to a custom software source of type
     * MANIFEST. Filter the list against a variety of criteria including but not limited to its
     * name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAvailableSoftwarePackagesResponse>
            listAvailableSoftwarePackages(
                    ListAvailableSoftwarePackagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailableSoftwarePackagesRequest,
                                    ListAvailableSoftwarePackagesResponse>
                            handler);

    /**
     * Lists entitlements in the specified tenancy
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Filter
     * the list against a variety of criteria including but not limited to its Customer Support
     * Identifier (CSI), and vendor name.
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
     * Lists module stream profiles from the specified software source
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Filter
     * the list against a variety of criteria including but not limited to its module name, stream
     * name, and profile name.
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
     * Lists module streams from the specified software source
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Filter
     * the list against a variety of criteria including but not limited to its module name and
     * (stream) name.
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
     * Lists package groups that are associated with the specified software source
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Filter
     * the list against a variety of criteria including but not limited to its name, and package
     * group type.
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
     * Lists the software sources in the tenancy that contain the software package. Filter the list
     * against a variety of criteria including but not limited to its name, type, architecture, and
     * OS family.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSoftwarePackageSoftwareSourcesResponse>
            listSoftwarePackageSoftwareSources(
                    ListSoftwarePackageSoftwareSourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListSoftwarePackageSoftwareSourcesRequest,
                                    ListSoftwarePackageSoftwareSourcesResponse>
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
     * Lists software sources that match the specified tenancy or software source
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Filter
     * the list against a variety of criteria including but not limited to its name, status,
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
     * Removes packages from a software source. This operation can only be done for custom software
     * sources that are not created using filters. Packages can be of the format: * name (for
     * example: git). This removes all versions of the package. * name-version-release.architecture
     * (for example: git-2.43.5-1.el8_10.x86_64) * name-epoch:version-release.architecture (for
     * example: git-0:2.43.5-1.el8_10.x86_64)
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemovePackagesFromSoftwareSourceResponse>
            removePackagesFromSoftwareSource(
                    RemovePackagesFromSoftwareSourceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemovePackagesFromSoftwareSourceRequest,
                                    RemovePackagesFromSoftwareSourceResponse>
                            handler);

    /**
     * Replaces packages in a software source with the provided list of packages. This operation can
     * only be done for custom software sources that are not created using filters. Packages can be
     * of the format: * name (for example: git). If isLatestContentOnly is true, only the latest
     * version of the package will be added, otherwise all versions of the package will be added. *
     * name-version-release.architecture (for example: git-2.43.5-1.el8_10.x86_64) *
     * name-epoch:version-release.architecture (for example: git-0:2.43.5-1.el8_10.x86_64)
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ReplacePackagesInSoftwareSourceResponse>
            replacePackagesInSoftwareSource(
                    ReplacePackagesInSoftwareSourceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ReplacePackagesInSoftwareSourceRequest,
                                    ReplacePackagesInSoftwareSourceResponse>
                            handler);

    /**
     * Returns a list of module streams from the specified software sources. Filter the list against
     * a variety of criteria including the module name.
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
     * including the module name.
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
     * Regenerates metadata for the specified custom software source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SoftwareSourceGenerateMetadataResponse>
            softwareSourceGenerateMetadata(
                    SoftwareSourceGenerateMetadataRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SoftwareSourceGenerateMetadataRequest,
                                    SoftwareSourceGenerateMetadataResponse>
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

    /**
     * Updates the package list document for the software source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSoftwareSourceManifestResponse> updateSoftwareSourceManifest(
            UpdateSoftwareSourceManifestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSoftwareSourceManifestRequest,
                            UpdateSoftwareSourceManifestResponse>
                    handler);
}
