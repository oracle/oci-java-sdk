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
public interface KmsManagementAsync extends AutoCloseable {

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
     * Backs up an encrypted file that contains all key versions and metadata of the specified key so that you can restore
     * the key later. The file also contains the metadata of the vault that the key belonged to.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<BackupKeyResponse> backupKey(
            BackupKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<BackupKeyRequest, BackupKeyResponse> handler);

    /**
     * Cancels the scheduled deletion of the specified key. Canceling
     * a scheduled deletion restores the key's lifecycle state to what
     * it was before its scheduled deletion.
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
    java.util.concurrent.Future<CancelKeyDeletionResponse> cancelKeyDeletion(
            CancelKeyDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelKeyDeletionRequest, CancelKeyDeletionResponse>
                    handler);

    /**
     * Cancels the scheduled deletion of the specified key version. Canceling
     * a scheduled deletion restores the key version to its lifecycle state from
     * before its scheduled deletion.
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
    java.util.concurrent.Future<CancelKeyVersionDeletionResponse> cancelKeyVersionDeletion(
            CancelKeyVersionDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelKeyVersionDeletionRequest, CancelKeyVersionDeletionResponse>
                    handler);

    /**
     * Moves a key into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * When provided, if-match is checked against the ETag values of the key.
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
    java.util.concurrent.Future<ChangeKeyCompartmentResponse> changeKeyCompartment(
            ChangeKeyCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeKeyCompartmentRequest, ChangeKeyCompartmentResponse>
                    handler);

    /**
     * Creates a new master encryption key.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total
     * number of requests across all management write operations. Key Management might throttle this call
     * to reject an otherwise valid request when the total rate of management write operations exceeds 10
     * requests per second for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateKeyResponse> createKey(
            CreateKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateKeyRequest, CreateKeyResponse> handler);

    /**
     * Generates a new [KeyVersion](https://docs.cloud.oracle.com/api/#/en/key/latest/KeyVersion/) resource that provides new cryptographic
     * material for a master encryption key. The key must be in an `ENABLED` state to be rotated.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all  management write operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management write operations exceeds 10 requests per second
     * for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateKeyVersionResponse> createKeyVersion(
            CreateKeyVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateKeyVersionRequest, CreateKeyVersionResponse>
                    handler);

    /**
     * Disables a master encryption key so it can no longer be used for encryption, decryption, or
     * generating new data encryption keys.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management write operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management write operations exceeds 10 requests per second
     * for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableKeyResponse> disableKey(
            DisableKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<DisableKeyRequest, DisableKeyResponse> handler);

    /**
     * Enables a master encryption key so it can be used for encryption, decryption, or
     * generating new data encryption keys.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management write operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management write operations exceeds 10 requests per second
     * for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableKeyResponse> enableKey(
            EnableKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<EnableKeyRequest, EnableKeyResponse> handler);

    /**
     * Gets information about the specified master encryption key.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management read operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management read operations exceeds 10 requests per second for
     * a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetKeyResponse> getKey(
            GetKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetKeyRequest, GetKeyResponse> handler);

    /**
     * Gets information about the specified key version.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management read operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management read operations exceeds 10 requests per second
     * for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetKeyVersionResponse> getKeyVersion(
            GetKeyVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetKeyVersionRequest, GetKeyVersionResponse>
                    handler);

    /**
     * When a vault has a replica, each operation on the vault or its resources, such as
     * keys, is replicated and has an associated replicationId. Replication status provides
     * details about whether the operation associated with the given replicationId has been
     * successfully applied across replicas.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetReplicationStatusResponse> getReplicationStatus(
            GetReplicationStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetReplicationStatusRequest, GetReplicationStatusResponse>
                    handler);

    /**
     * Gets details about the public RSA wrapping key associated with the vault in the endpoint. Each vault has an RSA key-pair that wraps and
     * unwraps AES key material for import into Key Management.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWrappingKeyResponse> getWrappingKey(
            GetWrappingKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWrappingKeyRequest, GetWrappingKeyResponse>
                    handler);

    /**
     * Imports AES key material to create a new key with. The key material must be base64-encoded and
     * wrapped by the vault's public RSA wrapping key before you can import it. Key Management supports AES symmetric keys
     * that are exactly 16, 24, or 32 bytes. Furthermore, the key length must match what you specify at the time of import.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ImportKeyResponse> importKey(
            ImportKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<ImportKeyRequest, ImportKeyResponse> handler);

    /**
     * Imports AES key material to create a new key version with, and then rotates the key to begin using the new
     * key version. The key material must be base64-encoded and wrapped by the vault's public RSA wrapping key
     * before you can import it. Key Management supports AES symmetric keys that are exactly 16, 24, or 32 bytes.
     * Furthermore, the key length must match the length of the specified key and what you specify as the length
     * at the time of import.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ImportKeyVersionResponse> importKeyVersion(
            ImportKeyVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<ImportKeyVersionRequest, ImportKeyVersionResponse>
                    handler);

    /**
     * Lists all [KeyVersion](https://docs.cloud.oracle.com/api/#/en/key/latest/KeyVersion/) resources for the specified
     * master encryption key.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management read operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management read operations exceeds 10 requests per second
     * for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListKeyVersionsResponse> listKeyVersions(
            ListKeyVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListKeyVersionsRequest, ListKeyVersionsResponse>
                    handler);

    /**
     * Lists the master encryption keys in the specified vault and compartment.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management read operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management read operations exceeds 10 requests per second
     * for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListKeysResponse> listKeys(
            ListKeysRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListKeysRequest, ListKeysResponse> handler);

    /**
     * Restores the specified key to the specified vault, based on information in the backup file provided.
     * If the vault doesn't exist, the operation returns a response with a 404 HTTP status error code. You
     * need to first restore the vault associated with the key.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestoreKeyFromFileResponse> restoreKeyFromFile(
            RestoreKeyFromFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RestoreKeyFromFileRequest, RestoreKeyFromFileResponse>
                    handler);

    /**
     * Restores the specified key to the specified vault from an Oracle Cloud Infrastructure
     * Object Storage location. If the vault doesn't exist, the operation returns a response with a
     * 404 HTTP status error code. You need to first restore the vault associated with the key.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestoreKeyFromObjectStoreResponse> restoreKeyFromObjectStore(
            RestoreKeyFromObjectStoreRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RestoreKeyFromObjectStoreRequest, RestoreKeyFromObjectStoreResponse>
                    handler);

    /**
     * Schedules the deletion of the specified key. This sets the lifecycle state of the key
     * to `PENDING_DELETION` and then deletes it after the specified retention period ends.
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
    java.util.concurrent.Future<ScheduleKeyDeletionResponse> scheduleKeyDeletion(
            ScheduleKeyDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ScheduleKeyDeletionRequest, ScheduleKeyDeletionResponse>
                    handler);

    /**
     * Schedules the deletion of the specified key version. This sets the lifecycle state of the key version
     * to `PENDING_DELETION` and then deletes it after the specified retention period ends.
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
    java.util.concurrent.Future<ScheduleKeyVersionDeletionResponse> scheduleKeyVersionDeletion(
            ScheduleKeyVersionDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ScheduleKeyVersionDeletionRequest, ScheduleKeyVersionDeletionResponse>
                    handler);

    /**
     * Updates the properties of a master encryption key. Specifically, you can update the
     * `displayName`, `freeformTags`, and `definedTags` properties. Furthermore,
     * the key must be in an `ENABLED` or `CREATING` state to be updated.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management write operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management write operations exceeds 10 requests per second
     * for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateKeyResponse> updateKey(
            UpdateKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateKeyRequest, UpdateKeyResponse> handler);
}
