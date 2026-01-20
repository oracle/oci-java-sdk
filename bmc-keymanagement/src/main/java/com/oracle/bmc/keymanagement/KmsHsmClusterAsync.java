/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

/**
 * Use the Key Management API to manage vaults and keys. For more information, see [Managing
 * Vaults](https://docs.oracle.com/iaas/Content/KeyManagement/Tasks/managingvaults.htm) and
 * [Managing Keys](https://docs.oracle.com/iaas/Content/KeyManagement/Tasks/managingkeys.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public interface KmsHsmClusterAsync extends AutoCloseable {

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
     * Cancels deletion of specified HSM Cluster, restores it and associated HSM partitions to
     * pre-deletion states.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelHsmClusterDeletionResponse> cancelHsmClusterDeletion(
            CancelHsmClusterDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelHsmClusterDeletionRequest, CancelHsmClusterDeletionResponse>
                    handler);

    /**
     * Moves a HSM Cluster resource to a different compartment within the same tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeHsmClusterCompartmentResponse> changeHsmClusterCompartment(
            ChangeHsmClusterCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeHsmClusterCompartmentRequest, ChangeHsmClusterCompartmentResponse>
                    handler);

    /**
     * Creates a new HSM cluster resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateHsmClusterResponse> createHsmCluster(
            CreateHsmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateHsmClusterRequest, CreateHsmClusterResponse>
                    handler);

    /**
     * Retrieves the certificate signing request for the designated HSM Cluster resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DownloadCertificateSigningRequestResponse>
            downloadCertificateSigningRequest(
                    DownloadCertificateSigningRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DownloadCertificateSigningRequestRequest,
                                    DownloadCertificateSigningRequestResponse>
                            handler);

    /**
     * Retrieves configuration details for the specified HSM Cluster resource.
     *
     * <p>As a provisioning operation, this call is subject to a Key Management limit that applies
     * to the total number of requests across all provisioning read operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * read operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetHsmClusterResponse> getHsmCluster(
            GetHsmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetHsmClusterRequest, GetHsmClusterResponse>
                    handler);

    /**
     * Retrieves HSM partition details for the specified HSM cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetHsmPartitionResponse> getHsmPartition(
            GetHsmPartitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetHsmPartitionRequest, GetHsmPartitionResponse>
                    handler);

    /**
     * Retrieves Pre Crypto Officer user credentials for the specified HSM cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPreCoUserCredentialsResponse> getPreCoUserCredentials(
            GetPreCoUserCredentialsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPreCoUserCredentialsRequest, GetPreCoUserCredentialsResponse>
                    handler);

    /**
     * Lists all HSM cluster resources contained within the specified compartment.
     *
     * <p>As a provisioning operation, this call is subject to a Key Management limit that applies
     * to the total number of requests across all provisioning read operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of provisioning
     * read operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListHsmClustersResponse> listHsmClusters(
            ListHsmClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListHsmClustersRequest, ListHsmClustersResponse>
                    handler);

    /**
     * Lists all HSM partitions within the specified HSM Cluster resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListHsmPartitionsResponse> listHsmPartitions(
            ListHsmPartitionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListHsmPartitionsRequest, ListHsmPartitionsResponse>
                    handler);

    /**
     * Schedules HSM cluster for deletion, update its lifecycle state to 'PENDING_DELETION' and
     * deletes it after the retention period.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScheduleHsmClusterDeletionResponse> scheduleHsmClusterDeletion(
            ScheduleHsmClusterDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ScheduleHsmClusterDeletionRequest, ScheduleHsmClusterDeletionResponse>
                    handler);

    /**
     * Modifies properties of an HSM cluster resource, including `displayName`, `freeformTags` and
     * `definedTags`.
     *
     * <p>As a provisioning operation, this call is subject to a Key Management limit that applies
     * to the total number of requests across all provisioning write operations. Key Management
     * might throttle this call to reject an otherwise valid request when the total rate of
     * provisioning write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateHsmClusterResponse> updateHsmCluster(
            UpdateHsmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateHsmClusterRequest, UpdateHsmClusterResponse>
                    handler);

    /**
     * Uploads the partition owner certificates to the HSM Cluster resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UploadPartitionCertificatesResponse> uploadPartitionCertificates(
            UploadPartitionCertificatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UploadPartitionCertificatesRequest, UploadPartitionCertificatesResponse>
                    handler);
}
