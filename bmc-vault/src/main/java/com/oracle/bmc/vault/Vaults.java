/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault;

import com.oracle.bmc.vault.requests.*;
import com.oracle.bmc.vault.responses.*;

/**
 * API for managing secrets.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
public interface Vaults extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

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
     * Cancels the pending deletion of the specified secret. Canceling
     * a scheduled deletion restores the secret's lifecycle state to what
     * it was before you scheduled the secret for deletion.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CancelSecretDeletionResponse cancelSecretDeletion(CancelSecretDeletionRequest request);

    /**
     * Cancels the scheduled deletion of a secret version.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CancelSecretVersionDeletionResponse cancelSecretVersionDeletion(
            CancelSecretVersionDeletionRequest request);

    /**
     * Moves a secret into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * When provided, if-match is checked against the ETag values of the secret.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeSecretCompartmentResponse changeSecretCompartment(ChangeSecretCompartmentRequest request);

    /**
     * Creates a new secret according to the details of the request.
     * <p>
     * This operation is not supported by the Oracle Cloud Infrastructure Terraform Provider.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateSecretResponse createSecret(CreateSecretRequest request);

    /**
     * Gets information about the specified secret.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSecretResponse getSecret(GetSecretRequest request);

    /**
     * Gets information about the specified version of a secret.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSecretVersionResponse getSecretVersion(GetSecretVersionRequest request);

    /**
     * Lists all secret versions for the specified secret.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSecretVersionsResponse listSecretVersions(ListSecretVersionsRequest request);

    /**
     * Lists all secrets in the specified vault and compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSecretsResponse listSecrets(ListSecretsRequest request);

    /**
     * Schedules the deletion of the specified secret. This sets the lifecycle state of the secret
     * to `PENDING_DELETION` and then deletes it after the specified retention period ends.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ScheduleSecretDeletionResponse scheduleSecretDeletion(ScheduleSecretDeletionRequest request);

    /**
     * Schedules the deletion of the specified secret version. This deletes it after the specified retention period ends. You can only
     * delete a secret version if the secret version rotation state is marked as `DEPRECATED`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ScheduleSecretVersionDeletionResponse scheduleSecretVersionDeletion(
            ScheduleSecretVersionDeletionRequest request);

    /**
     * Updates the properties of a secret. Specifically, you can update the version number of the secret to make
     * that version number the current version. You can also update a secret's description, its free-form or defined tags, rules
     * and the secret contents. Updating the secret content automatically creates a new secret version. You cannot, however, update the current secret version number and the secret contents and the rules at the
     * same time. Furthermore, the secret must in an `ACTIVE` lifecycle state to be updated.
     * <p>
     * This operation is not supported by the Oracle Cloud Infrastructure Terraform Provider.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateSecretResponse updateSecret(UpdateSecretRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    VaultsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    VaultsPaginators getPaginators();
}
