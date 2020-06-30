/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

/**
 * API for managing and performing operations with keys and vaults.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
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
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Backs up an encrypted file that contains all the metadata of a vault so that you can restore the vault later.
     * You can backup a vault whether or not it contains keys. This operation only backs up the
     * metadata of the vault, and does not include key metadata.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    BackupVaultResponse backupVault(BackupVaultRequest request);

    /**
     * Cancels the scheduled deletion of the specified vault. Canceling a scheduled deletion
     * restores the vault and all keys in it to their respective states from before their
     * scheduled deletion. All keys that were scheduled for deletion prior to vault
     * deletion retain their lifecycle state and time of deletion.
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CancelVaultDeletionResponse cancelVaultDeletion(CancelVaultDeletionRequest request);

    /**
     * Moves a vault into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * When provided, if-match is checked against the ETag values of the resource.
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeVaultCompartmentResponse changeVaultCompartment(ChangeVaultCompartmentRequest request);

    /**
     * Creates a new vault. The type of vault you create determines key placement, pricing, and
     * available options. Options include storage isolation, a dedicated service endpoint instead
     * of a shared service endpoint for API calls, and either a dedicated hardware security module
     * (HSM) or a multitenant HSM.
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVaultResponse createVault(CreateVaultRequest request);

    /**
     * Gets the specified vault's configuration information.
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning read operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * read operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVaultResponse getVault(GetVaultRequest request);

    /**
     * Gets the count of keys and key versions in the specified vault to calculate usage against service limits.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVaultUsageResponse getVaultUsage(GetVaultUsageRequest request);

    /**
     * Lists the vaults in the specified compartment.
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning read operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * read operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVaultsResponse listVaults(ListVaultsRequest request);

    /**
     * Restores a vault from an encrypted backup file. If a vault
     * with the same OCID already exists, this operation returns a response with a
     * 409 HTTP status error code.
     *
     *
     * Note: This operation consumes a stream.
     *
     * If the stream supports {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, when a retry is
     * necessary, the stream is reset so it starts at the beginning (or whatever the stream's position was at the time this
     * operation is called}.
     *
     * Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before, then the mark
     * will not be the same anymore after this operation, and a subsequent call to {@link java.io.InputStream#reset()} by
     * the caller will reset the stream not to the caller's mark, but to the position the stream was in when this operation
     * was called.
     *
     * If the stream is a {@link java.io.FileInputStream}, and the stream's {@link java.nio.channels.FileChannel} position
     * can be changed (like for a regular file), the stream will be wrapped in such a way that it does provide
     * support for {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same procedure as
     * above is followed. If the stream's {@link java.nio.channels.FileChannel} position cannot be changed (like for a
     * named pipe), then the stream's contents will be buffered in memory, as described below.
     *
     * If the stream does not support {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, then
     * the stream is wrapped in a {@link java.io.BufferedInputStream}, which means the entire contents may
     * be buffered in memory. Then the same procedure as above is followed.
     *
     * The contents of the stream, except when the stream is a {@link java.io.FileInputStream} whose
     * {@link java.nio.channels.FileChannel} position can be changed, should be less than 2 GiB in size if retries are used.
     * This is because streams 2 GiB in size or larger do no guarantee that mark-and-reset can be performed. If the stream
     * is larger, do not use built-in retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RestoreVaultFromFileResponse restoreVaultFromFile(RestoreVaultFromFileRequest request);

    /**
     * Restores a vault from an encrypted backup file stored in Oracle Cloud Infrastructure Object
     * Storage. If a vault with the same OCID already exists, this operation returns
     * a response with a 409 HTTP status error code.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RestoreVaultFromObjectStoreResponse restoreVaultFromObjectStore(
            RestoreVaultFromObjectStoreRequest request);

    /**
     * Schedules the deletion of the specified vault. This sets the lifecycle state of the vault and all keys in it
     * that are not already scheduled for deletion to `PENDING_DELETION` and then deletes them after the
     * retention period ends. The lifecycle state and time of deletion for keys already scheduled for deletion won't
     * change. If any keys in the vault are scheduled to be deleted after the specified time of
     * deletion for the vault, the call is rejected with the error code 409.
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ScheduleVaultDeletionResponse scheduleVaultDeletion(ScheduleVaultDeletionRequest request);

    /**
     * Updates the properties of a vault. Specifically, you can update the
     * `displayName`, `freeformTags`, and `definedTags` properties. Furthermore,
     * the vault must be in an ACTIVE or CREATING state to be updated.
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * write operations exceeds 10 requests per second for a given tenancy.
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
