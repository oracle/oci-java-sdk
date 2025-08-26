/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managedkafka;

import com.oracle.bmc.managedkafka.requests.*;
import com.oracle.bmc.managedkafka.responses.*;

/**
 * Use Oracle Streaming with Apache Kafka Control Plane API to create/update/delete managed Kafka
 * clusters.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240901")
public interface KafkaClusterAsync extends AutoCloseable {

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
     * Cancels a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Moves a KafkaCluster into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeKafkaClusterCompartmentResponse>
            changeKafkaClusterCompartment(
                    ChangeKafkaClusterCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeKafkaClusterCompartmentRequest,
                                    ChangeKafkaClusterCompartmentResponse>
                            handler);

    /**
     * Moves a KafkaClusterConfig into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeKafkaClusterConfigCompartmentResponse>
            changeKafkaClusterConfigCompartment(
                    ChangeKafkaClusterConfigCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeKafkaClusterConfigCompartmentRequest,
                                    ChangeKafkaClusterConfigCompartmentResponse>
                            handler);

    /**
     * Creates a KafkaCluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateKafkaClusterResponse> createKafkaCluster(
            CreateKafkaClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateKafkaClusterRequest, CreateKafkaClusterResponse>
                    handler);

    /**
     * Creates a KafkaClusterConfig.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateKafkaClusterConfigResponse> createKafkaClusterConfig(
            CreateKafkaClusterConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateKafkaClusterConfigRequest, CreateKafkaClusterConfigResponse>
                    handler);

    /**
     * Deletes a KafkaCluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteKafkaClusterResponse> deleteKafkaCluster(
            DeleteKafkaClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteKafkaClusterRequest, DeleteKafkaClusterResponse>
                    handler);

    /**
     * Deletes a KafkaClusterConfig.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteKafkaClusterConfigResponse> deleteKafkaClusterConfig(
            DeleteKafkaClusterConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteKafkaClusterConfigRequest, DeleteKafkaClusterConfigResponse>
                    handler);

    /**
     * Deletes a KafkaClusterConfig version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteKafkaClusterConfigVersionResponse>
            deleteKafkaClusterConfigVersion(
                    DeleteKafkaClusterConfigVersionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteKafkaClusterConfigVersionRequest,
                                    DeleteKafkaClusterConfigVersionResponse>
                            handler);

    /**
     * Removes the SASL superuser to the Kafka cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableSuperuserResponse> disableSuperuser(
            DisableSuperuserRequest request,
            com.oracle.bmc.responses.AsyncHandler<DisableSuperuserRequest, DisableSuperuserResponse>
                    handler);

    /**
     * Adds a SASL superuser to the Kafka cluster. A generated password will be updated to the
     * specified vault.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableSuperuserResponse> enableSuperuser(
            EnableSuperuserRequest request,
            com.oracle.bmc.responses.AsyncHandler<EnableSuperuserRequest, EnableSuperuserResponse>
                    handler);

    /**
     * Gets information about a KafkaCluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetKafkaClusterResponse> getKafkaCluster(
            GetKafkaClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetKafkaClusterRequest, GetKafkaClusterResponse>
                    handler);

    /**
     * Gets information about a KafkaClusterConfig.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetKafkaClusterConfigResponse> getKafkaClusterConfig(
            GetKafkaClusterConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetKafkaClusterConfigRequest, GetKafkaClusterConfigResponse>
                    handler);

    /**
     * Gets information about a KafkaClusterConfig version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetKafkaClusterConfigVersionResponse> getKafkaClusterConfigVersion(
            GetKafkaClusterConfigVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetKafkaClusterConfigVersionRequest,
                            GetKafkaClusterConfigVersionResponse>
                    handler);

    /**
     * Gets the details of a work request.
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
     * Gets a list of KafkaClusterConfig Versions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListKafkaClusterConfigVersionsResponse>
            listKafkaClusterConfigVersions(
                    ListKafkaClusterConfigVersionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListKafkaClusterConfigVersionsRequest,
                                    ListKafkaClusterConfigVersionsResponse>
                            handler);

    /**
     * Gets a list of KafkaClusterConfigs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListKafkaClusterConfigsResponse> listKafkaClusterConfigs(
            ListKafkaClusterConfigsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListKafkaClusterConfigsRequest, ListKafkaClusterConfigsResponse>
                    handler);

    /**
     * Gets a list of KafkaClusters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListKafkaClustersResponse> listKafkaClusters(
            ListKafkaClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListKafkaClustersRequest, ListKafkaClustersResponse>
                    handler);

    /**
     * Lists the errors for a work request.
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
     * Lists the logs for a work request.
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
     * Updates a KafkaCluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateKafkaClusterResponse> updateKafkaCluster(
            UpdateKafkaClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateKafkaClusterRequest, UpdateKafkaClusterResponse>
                    handler);

    /**
     * Updates a KafkaClusterConfig.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateKafkaClusterConfigResponse> updateKafkaClusterConfig(
            UpdateKafkaClusterConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateKafkaClusterConfigRequest, UpdateKafkaClusterConfigResponse>
                    handler);
}
