/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

/**
 * API for managing and performing operations with keys and vaults. (For the API for managing secrets, see the Vault Service
 * Secret Management API. For the API for retrieving secrets, see the Vault Service Secret Retrieval API.)
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public interface KmsVaultAsync extends AutoCloseable {

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
     * Backs up an encrypted file that contains all the metadata of a vault so that you can restore the vault later.
     * You can backup a vault whether or not it contains keys. This operation only backs up the
     * metadata of the vault, and does not include key metadata.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<BackupVaultResponse> backupVault(
            BackupVaultRequest request,
            com.oracle.bmc.responses.AsyncHandler<BackupVaultRequest, BackupVaultResponse> handler);

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
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeVaultCompartmentResponse> changeVaultCompartment(
            ChangeVaultCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeVaultCompartmentRequest, ChangeVaultCompartmentResponse>
                    handler);

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
     * Creates a replica for the vault in another region in the same realm
     * <p>
     * The API is a no-op if called for same region that a vault is already replicated to.
     * 409 if called on a vault that is already replicated to a different region. Users need to delete
     * existing replica first before calling it with a different region.
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * write operations exceeds 10 requests per second for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVaultReplicaResponse> createVaultReplica(
            CreateVaultReplicaRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateVaultReplicaRequest, CreateVaultReplicaResponse>
                    handler);

    /**
     * Deletes a vault replica
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * write operations exceeds 10 requests per second for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVaultReplicaResponse> deleteVaultReplica(
            DeleteVaultReplicaRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVaultReplicaRequest, DeleteVaultReplicaResponse>
                    handler);

    /**
     * Gets the specified vault's configuration information.
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning read operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * read operations exceeds 10 requests per second for a given tenancy.
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
     * Gets the count of keys and key versions in the specified vault to calculate usage against service limits.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVaultUsageResponse> getVaultUsage(
            GetVaultUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVaultUsageRequest, GetVaultUsageResponse>
                    handler);

    /**
     * Lists the replicas for a vault
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * write operations exceeds 10 requests per second for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVaultReplicasResponse> listVaultReplicas(
            ListVaultReplicasRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVaultReplicasRequest, ListVaultReplicasResponse>
                    handler);

    /**
     * Lists the vaults in the specified compartment.
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning read operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * read operations exceeds 10 requests per second for a given tenancy.
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
     * Restores a vault from an encrypted backup file. If a vault
     * with the same OCID already exists, this operation returns a response with a
     * 409 HTTP status error code.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestoreVaultFromFileResponse> restoreVaultFromFile(
            RestoreVaultFromFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RestoreVaultFromFileRequest, RestoreVaultFromFileResponse>
                    handler);

    /**
     * Restores a vault from an encrypted backup file stored in Oracle Cloud Infrastructure Object
     * Storage. If a vault with the same OCID already exists, this operation returns
     * a response with a 409 HTTP status error code.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestoreVaultFromObjectStoreResponse> restoreVaultFromObjectStore(
            RestoreVaultFromObjectStoreRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RestoreVaultFromObjectStoreRequest, RestoreVaultFromObjectStoreResponse>
                    handler);

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
     * the vault must be in an ACTIVE or CREATING state to be updated.
     * <p>
     * As a provisioning operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all provisioning write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * write operations exceeds 10 requests per second for a given tenancy.
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
