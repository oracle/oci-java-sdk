/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase;

import com.oracle.bmc.distributeddatabase.requests.*;
import com.oracle.bmc.distributeddatabase.responses.*;

/**
 * Use the Globally Distributed Database service APIs to create and manage the Globally distributed
 * databases.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
public interface DistributedDbServiceAsync extends AutoCloseable {

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
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Add new Global database services control(GDS CTL) node for the Globally distributed database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddDistributedDatabaseGdsControlNodeResponse>
            addDistributedDatabaseGdsControlNode(
                    AddDistributedDatabaseGdsControlNodeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddDistributedDatabaseGdsControlNodeRequest,
                                    AddDistributedDatabaseGdsControlNodeResponse>
                            handler);

    /**
     * Move the Globally distributed database and its dependent resources to the specified
     * compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDistributedDatabaseCompartmentResponse>
            changeDistributedDatabaseCompartment(
                    ChangeDistributedDatabaseCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDistributedDatabaseCompartmentRequest,
                                    ChangeDistributedDatabaseCompartmentResponse>
                            handler);

    /**
     * Change the DbBackupConfig for the Globally distributed database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDistributedDbBackupConfigResponse>
            changeDistributedDbBackupConfig(
                    ChangeDistributedDbBackupConfigRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDistributedDbBackupConfigRequest,
                                    ChangeDistributedDbBackupConfigResponse>
                            handler);

    /**
     * Configure new Global Service Manager(GSM aka shard manager) instances for the Globally
     * distributed database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureDistributedDatabaseGsmsResponse>
            configureDistributedDatabaseGsms(
                    ConfigureDistributedDatabaseGsmsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedDatabaseGsmsRequest,
                                    ConfigureDistributedDatabaseGsmsResponse>
                            handler);

    /**
     * Once all components of Globally distributed database are provisioned, and signed GSM
     * certificates are successfully uploaded, this api shall be invoked to configure sharding on
     * the Globally distributed database. Note that this 'ConfigureSharding' API also needs to be
     * invoked after successfully adding a new shard to the Globally distributed database using
     * PATCH api. If this API is not invoked after successfully adding a new shard, then that new
     * shard will not be a participant in sharding topology of the Globally distributed database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureDistributedDatabaseShardingResponse>
            configureDistributedDatabaseSharding(
                    ConfigureDistributedDatabaseShardingRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedDatabaseShardingRequest,
                                    ConfigureDistributedDatabaseShardingResponse>
                            handler);

    /**
     * Creates a Globally distributed database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDistributedDatabaseResponse> createDistributedDatabase(
            CreateDistributedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDistributedDatabaseRequest, CreateDistributedDatabaseResponse>
                    handler);

    /**
     * Terminate the given Globally distributed databases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDistributedDatabaseResponse> deleteDistributedDatabase(
            DeleteDistributedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDistributedDatabaseRequest, DeleteDistributedDatabaseResponse>
                    handler);

    /**
     * Generate the common certificate signing request for GSMs. Download the <globaldb-prefix>.csr
     * file from API response. Users can use this .csr file to generate the CA signed certificate,
     * and as a next step use 'uploadSignedCertificateAndGenerateWallet' API to upload the CA signed
     * certificate to GSM, and generate wallets for the GSM instances of the Globally distributed
     * database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DownloadDistributedDatabaseGsmCertificateSigningRequestResponse>
            downloadDistributedDatabaseGsmCertificateSigningRequest(
                    DownloadDistributedDatabaseGsmCertificateSigningRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DownloadDistributedDatabaseGsmCertificateSigningRequestRequest,
                                    DownloadDistributedDatabaseGsmCertificateSigningRequestResponse>
                            handler);

    /**
     * Generate the certificate signing request for GSM instances of the Globally distributed
     * database. Once certificate signing request is generated, then customers can download the
     * certificate signing request using 'downloadGsmCertificateSigningRequest' api call.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateDistributedDatabaseGsmCertificateSigningRequestResponse>
            generateDistributedDatabaseGsmCertificateSigningRequest(
                    GenerateDistributedDatabaseGsmCertificateSigningRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDistributedDatabaseGsmCertificateSigningRequestRequest,
                                    GenerateDistributedDatabaseGsmCertificateSigningRequestResponse>
                            handler);

    /**
     * Generate the wallet associated with Globally distributed database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateDistributedDatabaseWalletResponse>
            generateDistributedDatabaseWallet(
                    GenerateDistributedDatabaseWalletRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDistributedDatabaseWalletRequest,
                                    GenerateDistributedDatabaseWalletResponse>
                            handler);

    /**
     * Gets the details of the Globally distributed database identified by given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDistributedDatabaseResponse> getDistributedDatabase(
            GetDistributedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDistributedDatabaseRequest, GetDistributedDatabaseResponse>
                    handler);

    /**
     * List of Globally distributed databases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDistributedDatabasesResponse> listDistributedDatabases(
            ListDistributedDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDistributedDatabasesRequest, ListDistributedDatabasesResponse>
                    handler);

    /**
     * Patch operation to add, remove or update shards to the Globally distributed database
     * topology. In single patch operation, multiple shards can be either added, or removed or
     * updated. Combination of inserts, update and remove in single operation is not allowed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchDistributedDatabaseResponse> patchDistributedDatabase(
            PatchDistributedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PatchDistributedDatabaseRequest, PatchDistributedDatabaseResponse>
                    handler);

    /**
     * Rotate passwords for different components of the Globally distributed database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RotateDistributedDatabasePasswordsResponse>
            rotateDistributedDatabasePasswords(
                    RotateDistributedDatabasePasswordsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RotateDistributedDatabasePasswordsRequest,
                                    RotateDistributedDatabasePasswordsResponse>
                            handler);

    /**
     * Start the shards, catalog and GSMs of Globally distributed database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartDistributedDatabaseResponse> startDistributedDatabase(
            StartDistributedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartDistributedDatabaseRequest, StartDistributedDatabaseResponse>
                    handler);

    /**
     * Stop the shards, catalog and GSM instances for the Globally distributed database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopDistributedDatabaseResponse> stopDistributedDatabase(
            StopDistributedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StopDistributedDatabaseRequest, StopDistributedDatabaseResponse>
                    handler);

    /**
     * Updates the configuration of the Globally distributed database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDistributedDatabaseResponse> updateDistributedDatabase(
            UpdateDistributedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDistributedDatabaseRequest, UpdateDistributedDatabaseResponse>
                    handler);

    /**
     * Upload the CA signed certificate to the GSM instances and generate wallets for GSM instances
     * of the Globally distributed database. Customer shall provide the CA signed certificate key
     * details by adding the certificate in request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse>
            uploadDistributedDatabaseSignedCertificateAndGenerateWallet(
                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletRequest,
                                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse>
                            handler);

    /**
     * Validate the network connectivity between components of the globally distributed database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ValidateDistributedDatabaseNetworkResponse>
            validateDistributedDatabaseNetwork(
                    ValidateDistributedDatabaseNetworkRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDistributedDatabaseNetworkRequest,
                                    ValidateDistributedDatabaseNetworkResponse>
                            handler);
}
