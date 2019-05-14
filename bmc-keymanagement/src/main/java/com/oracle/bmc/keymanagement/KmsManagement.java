/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
public interface KmsManagement extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Creates a new key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateKeyResponse createKey(CreateKeyRequest request);

    /**
     * Generates new cryptographic material for a key. The key must be in an `ENABLED` state to be
     * rotated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateKeyVersionResponse createKeyVersion(CreateKeyVersionRequest request);

    /**
     * Disables a key to make it unavailable for encryption
     * or decryption.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DisableKeyResponse disableKey(DisableKeyRequest request);

    /**
     * Enables a key to make it available for encryption or
     * decryption.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    EnableKeyResponse enableKey(EnableKeyRequest request);

    /**
     * Gets information about the specified key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetKeyResponse getKey(GetKeyRequest request);

    /**
     * Gets information about the specified key version.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetKeyVersionResponse getKeyVersion(GetKeyVersionRequest request);

    /**
     * Lists all key versions for the specified key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListKeyVersionsResponse listKeyVersions(ListKeyVersionsRequest request);

    /**
     * Lists the keys in the specified vault and compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListKeysResponse listKeys(ListKeysRequest request);

    /**
     * Updates the properties of a key. Specifically, you can update the
     * `displayName`, `freeformTags`, and `definedTags` properties. Furthermore,
     * the key must in an `ACTIVE` or `CREATING` state to be updated.
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
