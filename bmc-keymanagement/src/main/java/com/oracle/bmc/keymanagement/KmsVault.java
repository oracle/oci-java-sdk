/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
public interface KmsVault extends AutoCloseable {

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
     * default endpoint format ({@link Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Cancels the scheduled deletion of the specified Vault, which must be in PendingDeletion
     * state. The Vault and all Keys in it will be moved back to their previous states before
     * the deletion was scheduled.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CancelVaultDeletionResponse cancelVaultDeletion(CancelVaultDeletionRequest request);

    /**
     * Creates a new vault. The type of vault you create determines key
     * placement, pricing, and available options. Options include storage
     * isolation, a dedicated service endpoint instead of a shared service
     * endpoint for API calls, and a dedicated HSM or a multitenant HSM.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVaultResponse createVault(CreateVaultRequest request);

    /**
     * Gets the specified vault's configuration information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVaultResponse getVault(GetVaultRequest request);

    /**
     * Lists vaults in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVaultsResponse listVaults(ListVaultsRequest request);

    /**
     * Schedules the deletion of the specified Vault. The Vault and all Keys in it
     * will be moved to PendingDeletion state and deleted after the retention period.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ScheduleVaultDeletionResponse scheduleVaultDeletion(ScheduleVaultDeletionRequest request);

    /**
     * Updates the properties of a vault. Specifically, you can
     * only update the `displayName` property. Furthermore, the vault
     * must be in an `ACTIVE` or `CREATING` state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVaultResponse updateVault(UpdateVaultRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    KmsVaultWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    KmsVaultPaginators getPaginators();
}
