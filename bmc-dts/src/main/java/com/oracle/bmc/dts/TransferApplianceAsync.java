/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts;

import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;

/**
 * Data Transfer Service API Specification
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
public interface TransferApplianceAsync extends AutoCloseable {

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
     * Create a new Transfer Appliance
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTransferApplianceResponse> createTransferAppliance(
            CreateTransferApplianceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTransferApplianceRequest, CreateTransferApplianceResponse>
                    handler);

    /**
     * Creates an X.509 certificate from a public key
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTransferApplianceAdminCredentialsResponse>
            createTransferApplianceAdminCredentials(
                    CreateTransferApplianceAdminCredentialsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateTransferApplianceAdminCredentialsRequest,
                                    CreateTransferApplianceAdminCredentialsResponse>
                            handler);

    /**
     * deletes a transfer Appliance
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTransferApplianceResponse> deleteTransferAppliance(
            DeleteTransferApplianceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteTransferApplianceRequest, DeleteTransferApplianceResponse>
                    handler);

    /**
     * Describes a transfer appliance in detail
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTransferApplianceResponse> getTransferAppliance(
            GetTransferApplianceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTransferApplianceRequest, GetTransferApplianceResponse>
                    handler);

    /**
     * Gets the x.509 certificate for the Transfer Appliance's dedicated Certificate Authority (CA)
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTransferApplianceCertificateAuthorityCertificateResponse>
            getTransferApplianceCertificateAuthorityCertificate(
                    GetTransferApplianceCertificateAuthorityCertificateRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetTransferApplianceCertificateAuthorityCertificateRequest,
                                    GetTransferApplianceCertificateAuthorityCertificateResponse>
                            handler);

    /**
     * Describes a transfer appliance encryptionPassphrase in detail
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTransferApplianceEncryptionPassphraseResponse>
            getTransferApplianceEncryptionPassphrase(
                    GetTransferApplianceEncryptionPassphraseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetTransferApplianceEncryptionPassphraseRequest,
                                    GetTransferApplianceEncryptionPassphraseResponse>
                            handler);

    /**
     * Lists Transfer Appliances associated with a transferJob
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTransferAppliancesResponse> listTransferAppliances(
            ListTransferAppliancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTransferAppliancesRequest, ListTransferAppliancesResponse>
                    handler);

    /**
     * Updates a Transfer Appliance
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTransferApplianceResponse> updateTransferAppliance(
            UpdateTransferApplianceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTransferApplianceRequest, UpdateTransferApplianceResponse>
                    handler);
}
