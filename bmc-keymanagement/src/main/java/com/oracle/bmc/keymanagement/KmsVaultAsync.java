/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public interface KmsVaultAsync extends AutoCloseable {

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
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Cancels the scheduled deletion of the specified vault. Canceling a scheduled deletion
     * restores the vault and all keys in it to the respective states they were in before
     * the deletion was scheduled. All the keys that have already been scheduled deletion before the
     * scheduled deletion of the vault will also remain in their state and timeOfDeletion.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelVaultDeletionResponse> cancelVaultDeletion(
            CancelVaultDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelVaultDeletionRequest, CancelVaultDeletionResponse>
                    handler);

    /**
     * Creates a new vault. The type of vault you create determines key
     * placement, pricing, and available options. Options include storage
     * isolation, a dedicated service endpoint instead of a shared service
     * endpoint for API calls, and a dedicated hardware security module (HSM) or a multitenant HSM.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVaultResponse> createVault(
            CreateVaultRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateVaultRequest, CreateVaultResponse> handler);

    /**
     * Gets the specified vault's configuration information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVaultResponse> getVault(
            GetVaultRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVaultRequest, GetVaultResponse> handler);

    /**
     * Lists the vaults in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVaultsResponse> listVaults(
            ListVaultsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListVaultsRequest, ListVaultsResponse> handler);

    /**
     * Schedules the deletion of the specified vault. This sets the state of the vault and
     * keys that are not scheduled deletion in it to `PENDING_DELETION` and then deletes them
     * after the retention period ends.
     * The state and the timeOfDeletion of the keys that have already been scheduled for deletion
     * will not change. If any keys in it are scheduled for deletion after the specified timeOfDeletion
     * for the vault, the call will be rejected with status code 409.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ScheduleVaultDeletionResponse> scheduleVaultDeletion(
            ScheduleVaultDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ScheduleVaultDeletionRequest, ScheduleVaultDeletionResponse>
                    handler);

    /**
     * Updates the properties of a vault. Specifically, you can update the
     * `displayName`, `freeformTags`, and `definedTags` properties. Furthermore,
     * the vault must be in an `ACTIVE` or `CREATING` state to be updated.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVaultResponse> updateVault(
            UpdateVaultRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateVaultRequest, UpdateVaultResponse> handler);
}
