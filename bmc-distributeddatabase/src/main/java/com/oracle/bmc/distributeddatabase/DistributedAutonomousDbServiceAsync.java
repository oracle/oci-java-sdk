/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
public interface DistributedAutonomousDbServiceAsync extends AutoCloseable {

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
     * Add new Global database services control(GDS CTL) node for the Globally distributed
     * autonomous database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddDistributedAutonomousDatabaseGdsControlNodeResponse>
            addDistributedAutonomousDatabaseGdsControlNode(
                    AddDistributedAutonomousDatabaseGdsControlNodeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddDistributedAutonomousDatabaseGdsControlNodeRequest,
                                    AddDistributedAutonomousDatabaseGdsControlNodeResponse>
                            handler);

    /**
     * Move the Globally distributed autonomous database and its dependent resources to the
     * specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDistributedAutonomousDatabaseCompartmentResponse>
            changeDistributedAutonomousDatabaseCompartment(
                    ChangeDistributedAutonomousDatabaseCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDistributedAutonomousDatabaseCompartmentRequest,
                                    ChangeDistributedAutonomousDatabaseCompartmentResponse>
                            handler);

    /**
     * Change the DbBackupConfig for the Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDistributedAutonomousDbBackupConfigResponse>
            changeDistributedAutonomousDbBackupConfig(
                    ChangeDistributedAutonomousDbBackupConfigRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDistributedAutonomousDbBackupConfigRequest,
                                    ChangeDistributedAutonomousDbBackupConfigResponse>
                            handler);

    /**
     * Configure new Global Service Manager(GSM aka shard manager) instances for the Globally
     * distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureDistributedAutonomousDatabaseGsmsResponse>
            configureDistributedAutonomousDatabaseGsms(
                    ConfigureDistributedAutonomousDatabaseGsmsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedAutonomousDatabaseGsmsRequest,
                                    ConfigureDistributedAutonomousDatabaseGsmsResponse>
                            handler);

    /**
     * Once all components of Globally distributed autonomous database are provisioned, and signed
     * GSM certificates are successfully uploaded, this api shall be invoked to configure sharding
     * on the Globally distributed autonomous database. Note that this 'ConfigureSharding' API also
     * needs to be invoked after successfully adding a new shard to the Globally distributed
     * autonomous database using PATCH api. If this API is not invoked after successfully adding a
     * new shard, then that new shard will not be a participant in sharding topology of the Globally
     * distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureDistributedAutonomousDatabaseShardingResponse>
            configureDistributedAutonomousDatabaseSharding(
                    ConfigureDistributedAutonomousDatabaseShardingRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedAutonomousDatabaseShardingRequest,
                                    ConfigureDistributedAutonomousDatabaseShardingResponse>
                            handler);

    /**
     * Creates a Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDistributedAutonomousDatabaseResponse>
            createDistributedAutonomousDatabase(
                    CreateDistributedAutonomousDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDistributedAutonomousDatabaseRequest,
                                    CreateDistributedAutonomousDatabaseResponse>
                            handler);

    /**
     * Terminate the given Globally distributed autonomous databases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDistributedAutonomousDatabaseResponse>
            deleteDistributedAutonomousDatabase(
                    DeleteDistributedAutonomousDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDistributedAutonomousDatabaseRequest,
                                    DeleteDistributedAutonomousDatabaseResponse>
                            handler);

    /**
     * Generate the common certificate signing request for GSMs. Download the
     * <globalautonomousdb-prefix>.csr file from API response. Users can use this .csr file to
     * generate the CA signed certificate, and as a next step use
     * 'uploadSignedCertificateAndGenerateWallet' API to upload the CA signed certificate to GSM,
     * and generate wallets for the GSM instances of the Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<
                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
            downloadDistributedAutonomousDatabaseGsmCertificateSigningRequest(
                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest
                            request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest,
                                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
                            handler);

    /**
     * Generate the certificate signing request for GSM instances of the Globally distributed
     * autonomous database. Once certificate signing request is generated, then customers can
     * download the certificate signing request using 'downloadGsmCertificateSigningRequest' api
     * call.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<
                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
            generateDistributedAutonomousDatabaseGsmCertificateSigningRequest(
                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest
                            request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest,
                                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
                            handler);

    /**
     * Generate the wallet associated with Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateDistributedAutonomousDatabaseWalletResponse>
            generateDistributedAutonomousDatabaseWallet(
                    GenerateDistributedAutonomousDatabaseWalletRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDistributedAutonomousDatabaseWalletRequest,
                                    GenerateDistributedAutonomousDatabaseWalletResponse>
                            handler);

    /**
     * Gets the details of the Globally distributed autonomous database identified by given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDistributedAutonomousDatabaseResponse>
            getDistributedAutonomousDatabase(
                    GetDistributedAutonomousDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDistributedAutonomousDatabaseRequest,
                                    GetDistributedAutonomousDatabaseResponse>
                            handler);

    /**
     * List of Globally distributed autonomous databases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDistributedAutonomousDatabasesResponse>
            listDistributedAutonomousDatabases(
                    ListDistributedAutonomousDatabasesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDistributedAutonomousDatabasesRequest,
                                    ListDistributedAutonomousDatabasesResponse>
                            handler);

    /**
     * Patch operation to add, remove or update shards to the Globally distributed autonomous
     * database topology. In single patch operation, multiple shards can be either added, or removed
     * or updated. Combination of inserts, update and remove in single operation is not allowed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchDistributedAutonomousDatabaseResponse>
            patchDistributedAutonomousDatabase(
                    PatchDistributedAutonomousDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    PatchDistributedAutonomousDatabaseRequest,
                                    PatchDistributedAutonomousDatabaseResponse>
                            handler);

    /**
     * Rotate the gsmuser and gsmcatuser passwords for shards and catalog of the Globally
     * distributed autonomous database. This operation will also remove GdsCtlNodes if present.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RotateDistributedAutonomousDatabasePasswordsResponse>
            rotateDistributedAutonomousDatabasePasswords(
                    RotateDistributedAutonomousDatabasePasswordsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RotateDistributedAutonomousDatabasePasswordsRequest,
                                    RotateDistributedAutonomousDatabasePasswordsResponse>
                            handler);

    /**
     * Start the shards, catalog and GSMs of Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartDistributedAutonomousDatabaseResponse>
            startDistributedAutonomousDatabase(
                    StartDistributedAutonomousDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    StartDistributedAutonomousDatabaseRequest,
                                    StartDistributedAutonomousDatabaseResponse>
                            handler);

    /**
     * Stop the shards, catalog and GSM instances for the Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopDistributedAutonomousDatabaseResponse>
            stopDistributedAutonomousDatabase(
                    StopDistributedAutonomousDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    StopDistributedAutonomousDatabaseRequest,
                                    StopDistributedAutonomousDatabaseResponse>
                            handler);

    /**
     * Updates the configuration of the Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDistributedAutonomousDatabaseResponse>
            updateDistributedAutonomousDatabase(
                    UpdateDistributedAutonomousDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDistributedAutonomousDatabaseRequest,
                                    UpdateDistributedAutonomousDatabaseResponse>
                            handler);

    /**
     * Upload the CA signed certificate to the GSM instances and generate wallets for GSM instances
     * of the Globally distributed autonomous database. Customer shall provide the CA signed
     * certificate key details by adding the certificate in request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<
                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse>
            uploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWallet(
                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletRequest
                            request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletRequest,
                                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse>
                            handler);

    /**
     * Validate the network connectivity between components of the globally distributed autonomous
     * database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ValidateDistributedAutonomousDatabaseNetworkResponse>
            validateDistributedAutonomousDatabaseNetwork(
                    ValidateDistributedAutonomousDatabaseNetworkRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDistributedAutonomousDatabaseNetworkRequest,
                                    ValidateDistributedAutonomousDatabaseNetworkResponse>
                            handler);
}
