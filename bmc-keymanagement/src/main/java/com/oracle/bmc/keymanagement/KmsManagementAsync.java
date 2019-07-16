/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public interface KmsManagementAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Cancels the scheduled deletion of the specified key. Canceling
     * a scheduled deletion restores the key to the respective
     * states they were in before the deletion was scheduled.
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
     * Moves a key into a different compartment. When provided, If-Match is checked against ETag values of the key.
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
     * Creates a new key.
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
     * Generates new cryptographic material for a key. The key must be in an `ENABLED` state to be
     * rotated.
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
     * Disables a key to make it unavailable for encryption
     * or decryption.
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
     * Enables a key to make it available for encryption or
     * decryption.
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
     * Gets information about the specified key.
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
     * Lists all key versions for the specified key.
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
     * Lists the keys in the specified vault and compartment.
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
     * Schedules the deletion of the specified key. This sets the state of the key
     * to `PENDING_DELETION` and then deletes it after the retention period ends.
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
     * Updates the properties of a key. Specifically, you can update the
     * `displayName`, `freeformTags`, and `definedTags` properties. Furthermore,
     * the key must in an `ACTIVE` or `CREATING` state to be updated.
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
