/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public interface KmsManagement extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CancelKeyVersionDeletionResponse cancelKeyVersionDeletion(
            CancelKeyVersionDeletionRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeKeyCompartmentResponse changeKeyCompartment(ChangeKeyCompartmentRequest request);

    /**
     * Creates a new master encryption key.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total
     * number of requests across all management write operations. Key Management might throttle this call
     * to reject an otherwise valid request when the total rate of management write operations exceeds 10
     * requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateKeyResponse createKey(CreateKeyRequest request);

    /**
     * Generates a new [KeyVersion](https://docs.cloud.oracle.com/api/#/en/key/release/KeyVersion/) resource that provides new cryptographic
     * material for a master encryption key. The key must be in an ENABLED state to be rotated.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all  management write operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management write operations exceeds 10 requests per second
     * for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateKeyVersionResponse createKeyVersion(CreateKeyVersionRequest request);

    /**
     * Disables a master encryption key so it can no longer be used for encryption, decryption, or
     * generating new data encryption keys.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management write operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management write operations exceeds 10 requests per second
     * for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DisableKeyResponse disableKey(DisableKeyRequest request);

    /**
     * Enables a master encryption key so it can be used for encryption, decryption, or
     * generating new data encryption keys.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management write operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management write operations exceeds 10 requests per second
     * for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    EnableKeyResponse enableKey(EnableKeyRequest request);

    /**
     * Gets information about the specified master encryption key.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management read operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management read operations exceeds 10 requests per second for
     * a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetKeyResponse getKey(GetKeyRequest request);

    /**
     * Gets information about the specified key version.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management read operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management read operations exceeds 10 requests per second
     * for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetKeyVersionResponse getKeyVersion(GetKeyVersionRequest request);

    /**
     * Returns the RSA wrapping key associated with the vault in the endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWrappingKeyResponse getWrappingKey(GetWrappingKeyRequest request);

    /**
     * Imports the given wrapped/encrypted AES key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ImportKeyResponse importKey(ImportKeyRequest request);

    /**
     * Imports the given key version.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ImportKeyVersionResponse importKeyVersion(ImportKeyVersionRequest request);

    /**
     * Lists all [KeyVersion](https://docs.cloud.oracle.com/api/#/en/key/release/KeyVersion/) resources for the specified
     * master encryption key.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management read operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management read operations exceeds 10 requests per second
     * for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListKeyVersionsResponse listKeyVersions(ListKeyVersionsRequest request);

    /**
     * Lists the master encryption keys in the specified vault and compartment.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management read operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management read operations exceeds 10 requests per second
     * for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListKeysResponse listKeys(ListKeysRequest request);

    /**
     * Schedules the deletion of the specified key. This sets the lifecycle state of the key
     * to `PENDING_DELETION` and then deletes it after the specified retention period ends.
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
    ScheduleKeyDeletionResponse scheduleKeyDeletion(ScheduleKeyDeletionRequest request);

    /**
     * Schedules the deletion of the specified key version. This sets the lifecycle state of the key version
     * to `PENDING_DELETION` and then deletes it after the specified retention period ends.
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
    ScheduleKeyVersionDeletionResponse scheduleKeyVersionDeletion(
            ScheduleKeyVersionDeletionRequest request);

    /**
     * Updates the properties of a master encryption key. Specifically, you can update the
     * `displayName`, `freeformTags`, and `definedTags` properties. Furthermore,
     * the key must in an ENABLED or CREATING state to be updated.
     * <p>
     * As a management operation, this call is subject to a Key Management limit that applies to the total number
     * of requests across all management write operations. Key Management might throttle this call to reject an
     * otherwise valid request when the total rate of management write operations exceeds 10 requests per second
     * for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateKeyResponse updateKey(UpdateKeyRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    KmsManagementWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    KmsManagementPaginators getPaginators();
}
