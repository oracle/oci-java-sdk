/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault;

import com.oracle.bmc.vault.requests.*;
import com.oracle.bmc.vault.responses.*;

/**
 * Use the Secret Management API to manage secrets and secret versions. For more information, see
 * [Managing
 * Secrets](https://docs.cloud.oracle.com/Content/KeyManagement/Tasks/managingsecrets.htm).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
public interface VaultsAsync extends AutoCloseable {

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
     * Cancels the pending deletion of the specified secret. Canceling a scheduled deletion restores
     * the secret's lifecycle state to what it was before you scheduled the secret for deletion.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelSecretDeletionResponse> cancelSecretDeletion(
            CancelSecretDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelSecretDeletionRequest, CancelSecretDeletionResponse>
                    handler);

    /**
     * Cancels the scheduled deletion of a secret version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelSecretVersionDeletionResponse> cancelSecretVersionDeletion(
            CancelSecretVersionDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelSecretVersionDeletionRequest, CancelSecretVersionDeletionResponse>
                    handler);

    /**
     * Moves a secret into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * <p>When provided, if-match is checked against the ETag values of the secret.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSecretCompartmentResponse> changeSecretCompartment(
            ChangeSecretCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeSecretCompartmentRequest, ChangeSecretCompartmentResponse>
                    handler);

    /**
     * Creates a new secret according to the details of the request.
     *
     * <p>This operation is not supported by the Oracle Cloud Infrastructure Terraform Provider.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSecretResponse> createSecret(
            CreateSecretRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateSecretRequest, CreateSecretResponse>
                    handler);

    /**
     * Gets information about the specified secret.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSecretResponse> getSecret(
            GetSecretRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSecretRequest, GetSecretResponse> handler);

    /**
     * Gets information about the specified version of a secret.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSecretVersionResponse> getSecretVersion(
            GetSecretVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSecretVersionRequest, GetSecretVersionResponse>
                    handler);

    /**
     * Lists all secret versions for the specified secret.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSecretVersionsResponse> listSecretVersions(
            ListSecretVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSecretVersionsRequest, ListSecretVersionsResponse>
                    handler);

    /**
     * Lists all secrets in the specified vault and compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSecretsResponse> listSecrets(
            ListSecretsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSecretsRequest, ListSecretsResponse> handler);

    /**
     * Schedules the deletion of the specified secret. This sets the lifecycle state of the secret
     * to `PENDING_DELETION` and then deletes it after the specified retention period ends.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScheduleSecretDeletionResponse> scheduleSecretDeletion(
            ScheduleSecretDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ScheduleSecretDeletionRequest, ScheduleSecretDeletionResponse>
                    handler);

    /**
     * Schedules the deletion of the specified secret version. This deletes it after the specified
     * retention period ends. You can only delete a secret version if the secret version rotation
     * state is marked as `DEPRECATED`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScheduleSecretVersionDeletionResponse>
            scheduleSecretVersionDeletion(
                    ScheduleSecretVersionDeletionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleSecretVersionDeletionRequest,
                                    ScheduleSecretVersionDeletionResponse>
                            handler);

    /**
     * Updates the properties of a secret. Specifically, you can update the version number of the
     * secret to make that version number the current version. You can also update a secret's
     * description, its free-form or defined tags, rules and the secret contents. Updating the
     * secret content automatically creates a new secret version. You cannot, however, update the
     * current secret version number, secret contents, and secret rules at the same time.
     * Furthermore, the secret must in an `ACTIVE` lifecycle state to be updated.
     *
     * <p>This operation is not supported by the Oracle Cloud Infrastructure Terraform Provider.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSecretResponse> updateSecret(
            UpdateSecretRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateSecretRequest, UpdateSecretResponse>
                    handler);
}
