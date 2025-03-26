/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Use the Core Services API to manage resources such as virtual cloud networks (VCNs),
 * compute instances, and block storage volumes. For more information, see the console
 * documentation for the [Networking](https://docs.oracle.com/iaas/Content/Network/Concepts/overview.htm),
 * [Compute](https://docs.oracle.com/iaas/Content/Compute/Concepts/computeoverview.htm), and
 * [Block Volume](https://docs.oracle.com/iaas/Content/Block/Concepts/overview.htm) services.
 * The required permissions are documented in the
 * [Details for the Core Services](https://docs.oracle.com/iaas/Content/Identity/Reference/corepolicyreference.htm) article.
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface Blockstorage extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Moves a boot volume backup into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeBootVolumeBackupCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeBootVolumeBackupCompartment API.
     */
    ChangeBootVolumeBackupCompartmentResponse changeBootVolumeBackupCompartment(
            ChangeBootVolumeBackupCompartmentRequest request);

    /**
     * Moves a boot volume into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeBootVolumeCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeBootVolumeCompartment API.
     */
    ChangeBootVolumeCompartmentResponse changeBootVolumeCompartment(
            ChangeBootVolumeCompartmentRequest request);

    /**
     * Moves a volume backup into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeVolumeBackupCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeVolumeBackupCompartment API.
     */
    ChangeVolumeBackupCompartmentResponse changeVolumeBackupCompartment(
            ChangeVolumeBackupCompartmentRequest request);

    /**
     * Moves a volume into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeVolumeCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeVolumeCompartment API.
     */
    ChangeVolumeCompartmentResponse changeVolumeCompartment(ChangeVolumeCompartmentRequest request);

    /**
     * Moves a volume group backup into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeVolumeGroupBackupCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeVolumeGroupBackupCompartment API.
     */
    ChangeVolumeGroupBackupCompartmentResponse changeVolumeGroupBackupCompartment(
            ChangeVolumeGroupBackupCompartmentRequest request);

    /**
     * Moves a volume group into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeVolumeGroupCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeVolumeGroupCompartment API.
     */
    ChangeVolumeGroupCompartmentResponse changeVolumeGroupCompartment(
            ChangeVolumeGroupCompartmentRequest request);

    /**
     * Creates a boot volume backup copy in specified region. For general information about volume backups,
     * see [Overview of Boot Volume Backups](https://docs.oracle.com/iaas/Content/Block/Concepts/bootvolumebackups.htm)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CopyBootVolumeBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CopyBootVolumeBackup API.
     */
    CopyBootVolumeBackupResponse copyBootVolumeBackup(CopyBootVolumeBackupRequest request);

    /**
     * Creates a volume backup copy in specified region. For general information about volume backups,
     * see [Overview of Block Volume Service Backups](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumebackups.htm)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CopyVolumeBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CopyVolumeBackup API.
     */
    CopyVolumeBackupResponse copyVolumeBackup(CopyVolumeBackupRequest request);

    /**
     * Creates a volume group backup copy in specified region. For general information about volume group backups,
     * see [Overview of Block Volume Backups](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumebackups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CopyVolumeGroupBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CopyVolumeGroupBackup API.
     */
    CopyVolumeGroupBackupResponse copyVolumeGroupBackup(CopyVolumeGroupBackupRequest request);

    /**
     * Creates a new boot volume in the specified compartment from an existing boot volume or a boot volume backup.
     * For general information about boot volumes, see [Boot Volumes](https://docs.oracle.com/iaas/Content/Block/Concepts/bootvolumes.htm).
     * You may optionally specify a *display name* for the volume, which is simply a friendly name or
     * description. It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateBootVolumeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateBootVolume API.
     */
    CreateBootVolumeResponse createBootVolume(CreateBootVolumeRequest request);

    /**
     * Creates a new boot volume backup of the specified boot volume. For general information about boot volume backups,
     * see [Overview of Boot Volume Backups](https://docs.oracle.com/iaas/Content/Block/Concepts/bootvolumebackups.htm)
     * <p>
     * When the request is received, the backup object is in a REQUEST_RECEIVED state.
     * When the data is imaged, it goes into a CREATING state.
     * After the backup is fully uploaded to the cloud, it goes into an AVAILABLE state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateBootVolumeBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateBootVolumeBackup API.
     */
    CreateBootVolumeBackupResponse createBootVolumeBackup(CreateBootVolumeBackupRequest request);

    /**
     * Creates a new volume in the specified compartment. Volumes can be created in sizes ranging from
     * 50 GB (51200 MB) to 32 TB (33554432 MB), in 1 GB (1024 MB) increments. By default, volumes are 1 TB (1048576 MB).
     * For general information about block volumes, see
     * [Overview of Block Volume Service](https://docs.oracle.com/iaas/Content/Block/Concepts/overview.htm).
     * <p>
     * A volume and instance can be in separate compartments but must be in the same availability domain.
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For information about
     * availability domains, see [Regions and Availability Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm).
     * To get a list of availability domains, use the `ListAvailabilityDomains` operation
     * in the Identity and Access Management Service API.
     * <p>
     * You may optionally specify a *display name* for the volume, which is simply a friendly name or
     * description. It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateVolumeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVolume API.
     */
    CreateVolumeResponse createVolume(CreateVolumeRequest request);

    /**
     * Creates a new backup of the specified volume. For general information about volume backups,
     * see [Overview of Block Volume Service Backups](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumebackups.htm)
     * <p>
     * When the request is received, the backup object is in a REQUEST_RECEIVED state.
     * When the data is imaged, it goes into a CREATING state.
     * After the backup is fully uploaded to the cloud, it goes into an AVAILABLE state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateVolumeBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVolumeBackup API.
     */
    CreateVolumeBackupResponse createVolumeBackup(CreateVolumeBackupRequest request);

    /**
     * Creates a new user defined backup policy.
     * <p>
     * For more information about Oracle defined backup policies and user defined backup policies,
     * see [Policy-Based Backups](https://docs.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateVolumeBackupPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVolumeBackupPolicy API.
     */
    CreateVolumeBackupPolicyResponse createVolumeBackupPolicy(
            CreateVolumeBackupPolicyRequest request);

    /**
     * Assigns a volume backup policy to the specified volume. Note that a given volume can
     * only have one backup policy assigned to it. If this operation is used for a volume that already
     * has a different backup policy assigned, the prior backup policy will be silently unassigned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateVolumeBackupPolicyAssignmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVolumeBackupPolicyAssignment API.
     */
    CreateVolumeBackupPolicyAssignmentResponse createVolumeBackupPolicyAssignment(
            CreateVolumeBackupPolicyAssignmentRequest request);

    /**
     * Creates a new volume group in the specified compartment.
     * A volume group is a collection of volumes and may be created from a list of volumes, cloning an existing
     * volume group, or by restoring a volume group backup.
     * You may optionally specify a *display name* for the volume group, which is simply a friendly name or
     * description. It does not have to be unique, and you can change it. Avoid entering confidential information.
     * <p>
     * For more information, see [Volume Groups](https://docs.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateVolumeGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVolumeGroup API.
     */
    CreateVolumeGroupResponse createVolumeGroup(CreateVolumeGroupRequest request);

    /**
     * Creates a new backup volume group of the specified volume group.
     * For more information, see [Volume Groups](https://docs.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateVolumeGroupBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVolumeGroupBackup API.
     */
    CreateVolumeGroupBackupResponse createVolumeGroupBackup(CreateVolumeGroupBackupRequest request);

    /**
     * Deletes the specified boot volume. The volume cannot have an active connection to an instance.
     * To disconnect the boot volume from a connected instance, see
     * [Disconnecting From a Boot Volume](https://docs.oracle.com/iaas/Content/Block/Tasks/deletingbootvolume.htm).
     * **Warning:** All data on the boot volume will be permanently lost when the boot volume is deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteBootVolumeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteBootVolume API.
     */
    DeleteBootVolumeResponse deleteBootVolume(DeleteBootVolumeRequest request);

    /**
     * Deletes a boot volume backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteBootVolumeBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteBootVolumeBackup API.
     */
    DeleteBootVolumeBackupResponse deleteBootVolumeBackup(DeleteBootVolumeBackupRequest request);

    /**
     * Removes the specified boot volume's assigned Vault Service encryption key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteBootVolumeKmsKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteBootVolumeKmsKey API.
     */
    DeleteBootVolumeKmsKeyResponse deleteBootVolumeKmsKey(DeleteBootVolumeKmsKeyRequest request);

    /**
     * Deletes the specified volume. The volume cannot have an active connection to an instance.
     * To disconnect the volume from a connected instance, see
     * [Disconnecting From a Volume](https://docs.oracle.com/iaas/Content/Block/Tasks/disconnectingfromavolume.htm).
     * **Warning:** All data on the volume will be permanently lost when the volume is deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteVolumeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVolume API.
     */
    DeleteVolumeResponse deleteVolume(DeleteVolumeRequest request);

    /**
     * Deletes a volume backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteVolumeBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVolumeBackup API.
     */
    DeleteVolumeBackupResponse deleteVolumeBackup(DeleteVolumeBackupRequest request);

    /**
     * Deletes a user defined backup policy.
     *  For more information about user defined backup policies,
     *  see [Policy-Based Backups](https://docs.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm#UserDefinedBackupPolicies).
     * <p>
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteVolumeBackupPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVolumeBackupPolicy API.
     */
    DeleteVolumeBackupPolicyResponse deleteVolumeBackupPolicy(
            DeleteVolumeBackupPolicyRequest request);

    /**
     * Deletes a volume backup policy assignment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteVolumeBackupPolicyAssignmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVolumeBackupPolicyAssignment API.
     */
    DeleteVolumeBackupPolicyAssignmentResponse deleteVolumeBackupPolicyAssignment(
            DeleteVolumeBackupPolicyAssignmentRequest request);

    /**
     * Deletes the specified volume group. Individual volumes are not deleted, only the volume group is deleted.
     * For more information, see [Volume Groups](https://docs.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteVolumeGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVolumeGroup API.
     */
    DeleteVolumeGroupResponse deleteVolumeGroup(DeleteVolumeGroupRequest request);

    /**
     * Deletes a volume group backup. This operation deletes all the backups in
     * the volume group. For more information, see [Volume Groups](https://docs.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteVolumeGroupBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVolumeGroupBackup API.
     */
    DeleteVolumeGroupBackupResponse deleteVolumeGroupBackup(DeleteVolumeGroupBackupRequest request);

    /**
     * Removes the specified volume's assigned Vault service encryption key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteVolumeKmsKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVolumeKmsKey API.
     */
    DeleteVolumeKmsKeyResponse deleteVolumeKmsKey(DeleteVolumeKmsKeyRequest request);

    /**
     * Gets information for the specified block volume replica.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetBlockVolumeReplicaExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBlockVolumeReplica API.
     */
    GetBlockVolumeReplicaResponse getBlockVolumeReplica(GetBlockVolumeReplicaRequest request);

    /**
     * Gets information for the specified boot volume.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetBootVolumeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBootVolume API.
     */
    GetBootVolumeResponse getBootVolume(GetBootVolumeRequest request);

    /**
     * Gets information for the specified boot volume backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetBootVolumeBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBootVolumeBackup API.
     */
    GetBootVolumeBackupResponse getBootVolumeBackup(GetBootVolumeBackupRequest request);

    /**
     * Gets the Vault service encryption key assigned to the specified boot volume.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetBootVolumeKmsKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBootVolumeKmsKey API.
     */
    GetBootVolumeKmsKeyResponse getBootVolumeKmsKey(GetBootVolumeKmsKeyRequest request);

    /**
     * Gets information for the specified boot volume replica.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetBootVolumeReplicaExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBootVolumeReplica API.
     */
    GetBootVolumeReplicaResponse getBootVolumeReplica(GetBootVolumeReplicaRequest request);

    /**
     * Gets information for the specified volume.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVolumeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVolume API.
     */
    GetVolumeResponse getVolume(GetVolumeRequest request);

    /**
     * Gets information for the specified volume backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVolumeBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVolumeBackup API.
     */
    GetVolumeBackupResponse getVolumeBackup(GetVolumeBackupRequest request);

    /**
     * Gets information for the specified volume backup policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVolumeBackupPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVolumeBackupPolicy API.
     */
    GetVolumeBackupPolicyResponse getVolumeBackupPolicy(GetVolumeBackupPolicyRequest request);

    /**
     * Gets the volume backup policy assignment for the specified volume. The
     * `assetId` query parameter is required, and the returned list will contain at most
     * one item, since volume can only have one volume backup policy assigned at a time.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVolumeBackupPolicyAssetAssignmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVolumeBackupPolicyAssetAssignment API.
     */
    GetVolumeBackupPolicyAssetAssignmentResponse getVolumeBackupPolicyAssetAssignment(
            GetVolumeBackupPolicyAssetAssignmentRequest request);

    /**
     * Gets information for the specified volume backup policy assignment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVolumeBackupPolicyAssignmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVolumeBackupPolicyAssignment API.
     */
    GetVolumeBackupPolicyAssignmentResponse getVolumeBackupPolicyAssignment(
            GetVolumeBackupPolicyAssignmentRequest request);

    /**
     * Gets information for the specified volume group. For more information, see [Volume Groups](https://docs.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVolumeGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVolumeGroup API.
     */
    GetVolumeGroupResponse getVolumeGroup(GetVolumeGroupRequest request);

    /**
     * Gets information for the specified volume group backup. For more information, see [Volume Groups](https://docs.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVolumeGroupBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVolumeGroupBackup API.
     */
    GetVolumeGroupBackupResponse getVolumeGroupBackup(GetVolumeGroupBackupRequest request);

    /**
     * Gets information for the specified volume group replica.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVolumeGroupReplicaExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVolumeGroupReplica API.
     */
    GetVolumeGroupReplicaResponse getVolumeGroupReplica(GetVolumeGroupReplicaRequest request);

    /**
     * Gets the Vault service encryption key assigned to the specified volume.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVolumeKmsKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVolumeKmsKey API.
     */
    GetVolumeKmsKeyResponse getVolumeKmsKey(GetVolumeKmsKeyRequest request);

    /**
     * Lists the block volume replicas in the specified compartment and availability domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListBlockVolumeReplicasExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBlockVolumeReplicas API.
     */
    ListBlockVolumeReplicasResponse listBlockVolumeReplicas(ListBlockVolumeReplicasRequest request);

    /**
     * Lists the boot volume backups in the specified compartment. You can filter the results by boot volume.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListBootVolumeBackupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBootVolumeBackups API.
     */
    ListBootVolumeBackupsResponse listBootVolumeBackups(ListBootVolumeBackupsRequest request);

    /**
     * Lists the boot volume replicas in the specified compartment and availability domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListBootVolumeReplicasExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBootVolumeReplicas API.
     */
    ListBootVolumeReplicasResponse listBootVolumeReplicas(ListBootVolumeReplicasRequest request);

    /**
     * Lists the boot volumes in the specified compartment and availability domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListBootVolumesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBootVolumes API.
     */
    ListBootVolumesResponse listBootVolumes(ListBootVolumesRequest request);

    /**
     * Lists all the volume backup policies available in the specified compartment.
     * <p>
     * For more information about Oracle defined backup policies and user defined backup policies,
     * see [Policy-Based Backups](https://docs.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVolumeBackupPoliciesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVolumeBackupPolicies API.
     */
    ListVolumeBackupPoliciesResponse listVolumeBackupPolicies(
            ListVolumeBackupPoliciesRequest request);

    /**
     * Lists the volume backups in the specified compartment. You can filter the results by volume.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVolumeBackupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVolumeBackups API.
     */
    ListVolumeBackupsResponse listVolumeBackups(ListVolumeBackupsRequest request);

    /**
     * Lists the volume group backups in the specified compartment. You can filter the results by volume group.
     * For more information, see [Volume Groups](https://docs.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVolumeGroupBackupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVolumeGroupBackups API.
     */
    ListVolumeGroupBackupsResponse listVolumeGroupBackups(ListVolumeGroupBackupsRequest request);

    /**
     * Lists the volume group replicas in the specified compartment. You can filter the results by volume group.
     * For more information, see [Volume Group Replication](https://docs.oracle.com/iaas/Content/Block/Concepts/volumegroupreplication.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVolumeGroupReplicasExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVolumeGroupReplicas API.
     */
    ListVolumeGroupReplicasResponse listVolumeGroupReplicas(ListVolumeGroupReplicasRequest request);

    /**
     * Lists the volume groups in the specified compartment and availability domain.
     * For more information, see [Volume Groups](https://docs.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVolumeGroupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVolumeGroups API.
     */
    ListVolumeGroupsResponse listVolumeGroups(ListVolumeGroupsRequest request);

    /**
     * Lists the volumes in the specified compartment and availability domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVolumesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVolumes API.
     */
    ListVolumesResponse listVolumes(ListVolumesRequest request);

    /**
     * Updates the specified boot volume's display name, defined tags, and free-form tags.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateBootVolumeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBootVolume API.
     */
    UpdateBootVolumeResponse updateBootVolume(UpdateBootVolumeRequest request);

    /**
     * Updates the display name for the specified boot volume backup.
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateBootVolumeBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBootVolumeBackup API.
     */
    UpdateBootVolumeBackupResponse updateBootVolumeBackup(UpdateBootVolumeBackupRequest request);

    /**
     * Updates the specified volume with a new Vault service master encryption key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateBootVolumeKmsKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBootVolumeKmsKey API.
     */
    UpdateBootVolumeKmsKeyResponse updateBootVolumeKmsKey(UpdateBootVolumeKmsKeyRequest request);

    /**
     * Updates the specified volume's display name.
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVolumeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVolume API.
     */
    UpdateVolumeResponse updateVolume(UpdateVolumeRequest request);

    /**
     * Updates the display name for the specified volume backup.
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVolumeBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVolumeBackup API.
     */
    UpdateVolumeBackupResponse updateVolumeBackup(UpdateVolumeBackupRequest request);

    /**
     * Updates a user defined backup policy.
     *  For more information about user defined backup policies,
     *  see [Policy-Based Backups](https://docs.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm#UserDefinedBackupPolicies).
     * <p>
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVolumeBackupPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVolumeBackupPolicy API.
     */
    UpdateVolumeBackupPolicyResponse updateVolumeBackupPolicy(
            UpdateVolumeBackupPolicyRequest request);

    /**
     * Updates the set of volumes in a volume group along with the display name. Use this operation
     * to add or remove volumes in a volume group. Specify the full list of volume IDs to include in the
     * volume group. If the volume ID is not specified in the call, it will be removed from the volume group.
     * Avoid entering confidential information.
     * <p>
     * For more information, see [Volume Groups](https://docs.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVolumeGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVolumeGroup API.
     */
    UpdateVolumeGroupResponse updateVolumeGroup(UpdateVolumeGroupRequest request);

    /**
     * Updates the display name for the specified volume group backup. For more information, see [Volume Groups](https://docs.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVolumeGroupBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVolumeGroupBackup API.
     */
    UpdateVolumeGroupBackupResponse updateVolumeGroupBackup(UpdateVolumeGroupBackupRequest request);

    /**
     * Updates the specified volume with a new Key Management master encryption key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVolumeKmsKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVolumeKmsKey API.
     */
    UpdateVolumeKmsKeyResponse updateVolumeKmsKey(UpdateVolumeKmsKeyRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     * @deprecated use {@link #newWaiters(WorkRequest)} instead.  Otherwise, a default one will be provided
     *   that does not support operations that rely on the {@code WorkRequestClient} for polling.  An
     *   {@code IllegalStateException} will be thrown for such operations.
     */
    @Deprecated
    BlockstorageWaiters getWaiters();

    /**
     * Creates a new {@code BlockstorageWaiters} for resources for this service.
     *
     * @param workRequestClient The work request service client used to query for work request status
     * @return The service waiters.
     */
    BlockstorageWaiters newWaiters(com.oracle.bmc.workrequests.WorkRequest workRequestClient);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    BlockstoragePaginators getPaginators();
}
