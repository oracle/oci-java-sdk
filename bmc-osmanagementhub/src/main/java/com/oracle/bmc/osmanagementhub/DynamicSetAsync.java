/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Use the OS Management Hub API to manage and monitor updates and patches for instances in OCI,
 * your private data center, or 3rd-party clouds. For more information, see [Overview of OS
 * Management Hub](https://docs.oracle.com/iaas/osmh/doc/overview.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public interface DynamicSetAsync extends AutoCloseable {

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
     * Move the specified Dynamic Set to a different compartment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDynamicSetCompartmentResponse> changeDynamicSetCompartment(
            ChangeDynamicSetCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeDynamicSetCompartmentRequest, ChangeDynamicSetCompartmentResponse>
                    handler);

    /**
     * Creates a new dynamic set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDynamicSetResponse> createDynamicSet(
            CreateDynamicSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDynamicSetRequest, CreateDynamicSetResponse>
                    handler);

    /**
     * Deletes the specific dynamic set
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDynamicSetResponse> deleteDynamicSet(
            DeleteDynamicSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDynamicSetRequest, DeleteDynamicSetResponse>
                    handler);

    /**
     * Gets information about the specified dynamic set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDynamicSetResponse> getDynamicSet(
            GetDynamicSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDynamicSetRequest, GetDynamicSetResponse>
                    handler);

    /**
     * Installs specified software packages on all managed instances in the dynamic set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallPackagesOnDynamicSetResponse> installPackagesOnDynamicSet(
            InstallPackagesOnDynamicSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            InstallPackagesOnDynamicSetRequest, InstallPackagesOnDynamicSetResponse>
                    handler);

    /**
     * Lists dynamic sets that match the specified compartment or dynamic set OCID. Filter the list
     * against a variety of criteria including but not limited to its name, status, architecture,
     * and OS version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDynamicSetsResponse> listDynamicSets(
            ListDynamicSetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDynamicSetsRequest, ListDynamicSetsResponse>
                    handler);

    /**
     * Retrieves a list of managed instances associated with a specified dynamic set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstancesInDynamicSetResponse>
            listManagedInstancesInDynamicSet(
                    ListManagedInstancesInDynamicSetRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstancesInDynamicSetRequest,
                                    ListManagedInstancesInDynamicSetResponse>
                            handler);

    /**
     * Preview a dynamic set
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PreviewManagedInstancesResponse> previewManagedInstances(
            PreviewManagedInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PreviewManagedInstancesRequest, PreviewManagedInstancesResponse>
                    handler);

    /**
     * Initiates a reboot of all managed instances within the specified dynamic set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RebootDynamicSetResponse> rebootDynamicSet(
            RebootDynamicSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<RebootDynamicSetRequest, RebootDynamicSetResponse>
                    handler);

    /**
     * Removes specified software packages from all managed instances in the dynamic set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemovePackagesFromDynamicSetResponse> removePackagesFromDynamicSet(
            RemovePackagesFromDynamicSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemovePackagesFromDynamicSetRequest,
                            RemovePackagesFromDynamicSetResponse>
                    handler);

    /**
     * Updates the specified dynamic set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDynamicSetResponse> updateDynamicSet(
            UpdateDynamicSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDynamicSetRequest, UpdateDynamicSetResponse>
                    handler);

    /**
     * Updates all installed software packages on managed instances in the dynamic set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePackagesOnDynamicSetResponse> updatePackagesOnDynamicSet(
            UpdatePackagesOnDynamicSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePackagesOnDynamicSetRequest, UpdatePackagesOnDynamicSetResponse>
                    handler);
}
