/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase;

import com.oracle.bmc.globallydistributeddatabase.requests.*;
import com.oracle.bmc.globallydistributeddatabase.responses.*;

/**
 * Use the Globally Distributed Database service APIs to create and manage distributed databases.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public interface ShardedDatabaseServiceAsync extends AutoCloseable {

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
     * Move the private endpoint to the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePrivateEndpointCompartmentResponse>
            changePrivateEndpointCompartment(
                    ChangePrivateEndpointCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangePrivateEndpointCompartmentRequest,
                                    ChangePrivateEndpointCompartmentResponse>
                            handler);

    /**
     * Move the sharded database database and its dependent resources to the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeShardedDatabaseCompartmentResponse>
            changeShardedDatabaseCompartment(
                    ChangeShardedDatabaseCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeShardedDatabaseCompartmentRequest,
                                    ChangeShardedDatabaseCompartmentResponse>
                            handler);

    /**
     * Configure new Global Service Manager(GSM aka shard manager) instances for the sharded
     * database. Specify the names of old GSM instances that need to be replaced via parameter
     * oldGsmNames in the request payload. Also specify whether rotated GSM instances shall be
     * provisioned with latest image of GSM software or the image used by existing GSM instances
     * shall be used.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureShardedDatabaseGsmsResponse> configureShardedDatabaseGsms(
            ConfigureShardedDatabaseGsmsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ConfigureShardedDatabaseGsmsRequest,
                            ConfigureShardedDatabaseGsmsResponse>
                    handler);

    /**
     * Once all components of sharded database are provisioned, and signed GSM certificates are
     * successfully uploaded, this api shall be invoked to configure sharding on the sharded
     * database. Note that this 'ConfigureSharding' API also needs to be invoked after successfully
     * adding a new shard to the sharded database using PATCH api. If this API is not invoked after
     * successfully adding a new shard, then that new shard will not be a participant in sharding
     * topology of the sharded database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureShardingResponse> configureSharding(
            ConfigureShardingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ConfigureShardingRequest, ConfigureShardingResponse>
                    handler);

    /**
     * Creates a PrivateEndpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePrivateEndpointResponse> createPrivateEndpoint(
            CreatePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePrivateEndpointRequest, CreatePrivateEndpointResponse>
                    handler);

    /**
     * Creates a Sharded Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateShardedDatabaseResponse> createShardedDatabase(
            CreateShardedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateShardedDatabaseRequest, CreateShardedDatabaseResponse>
                    handler);

    /**
     * Delete the given private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePrivateEndpointResponse> deletePrivateEndpoint(
            DeletePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePrivateEndpointRequest, DeletePrivateEndpointResponse>
                    handler);

    /**
     * Terminate the given sharded databases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteShardedDatabaseResponse> deleteShardedDatabase(
            DeleteShardedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteShardedDatabaseRequest, DeleteShardedDatabaseResponse>
                    handler);

    /**
     * Generate the common certificate signing request for GSMs. Download the <sdb-prefix>.csr file
     * from API response. Users can use this .csr file to generate the CA signed certificate, and as
     * a next step use 'uploadSignedCertificateAndGenerateWallet' API to upload the CA signed
     * certificate to GSM, and generate wallets for the GSM instances of the sharded database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DownloadGsmCertificateSigningRequestResponse>
            downloadGsmCertificateSigningRequest(
                    DownloadGsmCertificateSigningRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DownloadGsmCertificateSigningRequestRequest,
                                    DownloadGsmCertificateSigningRequestResponse>
                            handler);

    /**
     * Gets the Sharded Database Connection Strings.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<FetchConnectionStringResponse> fetchConnectionString(
            FetchConnectionStringRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            FetchConnectionStringRequest, FetchConnectionStringResponse>
                    handler);

    /**
     * List of cloudAutonomousVMClusters for the given tenancy, that can be sharded.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<FetchShardableCloudAutonomousVmClustersResponse>
            fetchShardableCloudAutonomousVmClusters(
                    FetchShardableCloudAutonomousVmClustersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    FetchShardableCloudAutonomousVmClustersRequest,
                                    FetchShardableCloudAutonomousVmClustersResponse>
                            handler);

    /**
     * Generate the certificate signing request for GSM instances of the sharded database. Once
     * certificate signing request is generated, then customers can download the certificate signing
     * request using 'downloadGsmCertificateSigningRequest' api call.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateGsmCertificateSigningRequestResponse>
            generateGsmCertificateSigningRequest(
                    GenerateGsmCertificateSigningRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateGsmCertificateSigningRequestRequest,
                                    GenerateGsmCertificateSigningRequestResponse>
                            handler);

    /**
     * Generate the wallet associated with sharded database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateWalletResponse> generateWallet(
            GenerateWalletRequest request,
            com.oracle.bmc.responses.AsyncHandler<GenerateWalletRequest, GenerateWalletResponse>
                    handler);

    /**
     * Get the PrivateEndpoint resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPrivateEndpointResponse> getPrivateEndpoint(
            GetPrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPrivateEndpointRequest, GetPrivateEndpointResponse>
                    handler);

    /**
     * Gets the details of the Sharded database identified by given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetShardedDatabaseResponse> getShardedDatabase(
            GetShardedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetShardedDatabaseRequest, GetShardedDatabaseResponse>
                    handler);

    /**
     * Gets details of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * List of PrivateEndpoints.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPrivateEndpointsResponse> listPrivateEndpoints(
            ListPrivateEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPrivateEndpointsRequest, ListPrivateEndpointsResponse>
                    handler);

    /**
     * List of Sharded databases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListShardedDatabasesResponse> listShardedDatabases(
            ListShardedDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListShardedDatabasesRequest, ListShardedDatabasesResponse>
                    handler);

    /**
     * Returns a (paginated) list of errors for the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Returns a (paginated) list of logs for the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Patch operation to add, remove or update shards to the sharded database topology. In single
     * patch operation, multiple shards can be either added, or removed or updated. Combination of
     * inserts, update and remove in single operation is not allowed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchShardedDatabaseResponse> patchShardedDatabase(
            PatchShardedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PatchShardedDatabaseRequest, PatchShardedDatabaseResponse>
                    handler);

    /**
     * Sharded database pre-validation request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PrevalidateShardedDatabaseResponse> prevalidateShardedDatabase(
            PrevalidateShardedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PrevalidateShardedDatabaseRequest, PrevalidateShardedDatabaseResponse>
                    handler);

    /**
     * API to reinstate the proxy instances associated with the private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ReinstateProxyInstanceResponse> reinstateProxyInstance(
            ReinstateProxyInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ReinstateProxyInstanceRequest, ReinstateProxyInstanceResponse>
                    handler);

    /**
     * Start the shards, catalog and GSMs of Sharded Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartShardedDatabaseResponse> startShardedDatabase(
            StartShardedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartShardedDatabaseRequest, StartShardedDatabaseResponse>
                    handler);

    /**
     * Stop the shards, catalog and GSM instances for the sharded database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopShardedDatabaseResponse> stopShardedDatabase(
            StopShardedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StopShardedDatabaseRequest, StopShardedDatabaseResponse>
                    handler);

    /**
     * Updates the configuration of privateendpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePrivateEndpointResponse> updatePrivateEndpoint(
            UpdatePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePrivateEndpointRequest, UpdatePrivateEndpointResponse>
                    handler);

    /**
     * Updates the configuration of sharded database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateShardedDatabaseResponse> updateShardedDatabase(
            UpdateShardedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateShardedDatabaseRequest, UpdateShardedDatabaseResponse>
                    handler);

    /**
     * Upload the CA signed certificate to the GSM instances and generate wallets for GSM instances
     * of the sharded database. Customer shall provide the CA signed certificate key details by
     * adding the certificate in request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UploadSignedCertificateAndGenerateWalletResponse>
            uploadSignedCertificateAndGenerateWallet(
                    UploadSignedCertificateAndGenerateWalletRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UploadSignedCertificateAndGenerateWalletRequest,
                                    UploadSignedCertificateAndGenerateWalletResponse>
                            handler);

    /**
     * Validate the network connectivity between components of sharded database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ValidateNetworkResponse> validateNetwork(
            ValidateNetworkRequest request,
            com.oracle.bmc.responses.AsyncHandler<ValidateNetworkRequest, ValidateNetworkResponse>
                    handler);
}
