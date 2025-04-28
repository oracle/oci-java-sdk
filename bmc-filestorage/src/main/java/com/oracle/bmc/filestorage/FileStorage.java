/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage;

import com.oracle.bmc.filestorage.requests.*;
import com.oracle.bmc.filestorage.responses.*;

/**
 * Use the File Storage service API to manage file systems, mount targets, and snapshots. For more
 * information, see [Overview of File
 * Storage](https://docs.oracle.com/iaas/Content/File/Concepts/filestorageoverview.htm).
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public interface FileStorage extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
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
     * Adds a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/AddExportLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddExportLock API.
     */
    AddExportLockResponse addExportLock(AddExportLockRequest request);

    /**
     * Adds a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/AddFileSystemLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddFileSystemLock
     *     API.
     */
    AddFileSystemLockResponse addFileSystemLock(AddFileSystemLockRequest request);

    /**
     * Adds a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/AddFilesystemSnapshotPolicyLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddFilesystemSnapshotPolicyLock API.
     */
    AddFilesystemSnapshotPolicyLockResponse addFilesystemSnapshotPolicyLock(
            AddFilesystemSnapshotPolicyLockRequest request);

    /**
     * Adds a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/AddMountTargetLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddMountTargetLock
     *     API.
     */
    AddMountTargetLockResponse addMountTargetLock(AddMountTargetLockRequest request);

    /**
     * Adds a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/AddOutboundConnectorLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddOutboundConnectorLock API.
     */
    AddOutboundConnectorLockResponse addOutboundConnectorLock(
            AddOutboundConnectorLockRequest request);

    /**
     * Adds a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/AddReplicationLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddReplicationLock
     *     API.
     */
    AddReplicationLockResponse addReplicationLock(AddReplicationLockRequest request);

    /**
     * Adds a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/AddSnapshotLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddSnapshotLock
     *     API.
     */
    AddSnapshotLockResponse addSnapshotLock(AddSnapshotLockRequest request);

    /**
     * Cancel scheduled downgrade shape request for mount target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/CancelDowngradeShapeMountTargetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CancelDowngradeShapeMountTarget API.
     */
    CancelDowngradeShapeMountTargetResponse cancelDowngradeShapeMountTarget(
            CancelDowngradeShapeMountTargetRequest request);

    /**
     * Moves a file system and its associated snapshots into a different compartment within the same
     * tenancy. For information about moving resources between compartments, see [Moving Resources
     * to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ChangeFileSystemCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeFileSystemCompartment API.
     */
    ChangeFileSystemCompartmentResponse changeFileSystemCompartment(
            ChangeFileSystemCompartmentRequest request);

    /**
     * Moves a file system snapshot policy into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ChangeFilesystemSnapshotPolicyCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeFilesystemSnapshotPolicyCompartment API.
     */
    ChangeFilesystemSnapshotPolicyCompartmentResponse changeFilesystemSnapshotPolicyCompartment(
            ChangeFilesystemSnapshotPolicyCompartmentRequest request);

    /**
     * Moves a mount target and its associated export set or share set into a different compartment
     * within the same tenancy. For information about moving resources between compartments, see
     * [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ChangeMountTargetCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeMountTargetCompartment API.
     */
    ChangeMountTargetCompartmentResponse changeMountTargetCompartment(
            ChangeMountTargetCompartmentRequest request);

    /**
     * Moves an outbound connector into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ChangeOutboundConnectorCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeOutboundConnectorCompartment API.
     */
    ChangeOutboundConnectorCompartmentResponse changeOutboundConnectorCompartment(
            ChangeOutboundConnectorCompartmentRequest request);

    /**
     * Moves a replication and its replication target into a different compartment within the same
     * tenancy. For information about moving resources between compartments, see [Moving Resources
     * to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ChangeReplicationCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeReplicationCompartment API.
     */
    ChangeReplicationCompartmentResponse changeReplicationCompartment(
            ChangeReplicationCompartmentRequest request);

    /**
     * Creates a new export in the specified export set, path, and file system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/CreateExportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExport API.
     */
    CreateExportResponse createExport(CreateExportRequest request);

    /**
     * Creates a new file system in the specified compartment and availability domain. Instances can
     * mount file systems in another availability domain, but doing so might increase latency when
     * compared to mounting instances in the same availability domain.
     *
     * <p>After you create a file system, you can associate it with a mount target. Instances can
     * then mount the file system by connecting to the mount target's IP address. You can associate
     * a file system with more than one mount target at a time.
     *
     * <p>For information about access control and compartments, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
     *
     * <p>For information about Network Security Groups access control, see [Network Security
     * Groups](https://docs.oracle.com/iaas/Content/Network/Concepts/networksecuritygroups.htm).
     *
     * <p>For information about availability domains, see [Regions and Availability
     * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm). To get a list of
     * availability domains, use the `ListAvailabilityDomains` operation in the Identity and Access
     * Management Service API.
     *
     * <p>All Oracle Cloud Infrastructure resources, including file systems, get an Oracle-assigned,
     * unique ID called an Oracle Cloud Identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)). When you
     * create a resource, you can find its OCID in the response. You can also retrieve a resource's
     * OCID by using a List API operation on that resource type or by viewing the resource in the
     * Console.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/CreateFileSystemExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateFileSystem
     *     API.
     */
    CreateFileSystemResponse createFileSystem(CreateFileSystemRequest request);

    /**
     * Creates a new file system snapshot policy in the specified compartment and availability
     * domain.
     *
     * <p>After you create a file system snapshot policy, you can associate it with file systems.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/CreateFilesystemSnapshotPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateFilesystemSnapshotPolicy API.
     */
    CreateFilesystemSnapshotPolicyResponse createFilesystemSnapshotPolicy(
            CreateFilesystemSnapshotPolicyRequest request);

    /**
     * Creates a new mount target in the specified compartment and subnet. You can associate a file
     * system with a mount target only when they exist in the same availability domain. Instances
     * can connect to mount targets in another availablity domain, but you might see higher latency
     * than with instances in the same availability domain as the mount target.
     *
     * <p>Mount targets have one or more private IP addresses that you can provide as the host
     * portion of remote target parameters in client mount commands. These private IP addresses are
     * listed in the privateIpIds property of the mount target and are highly available. Mount
     * targets also consume additional IP addresses in their subnet. Do not use /30 or smaller
     * subnets for mount target creation because they do not have sufficient available IP addresses.
     * Allow at least three IP addresses for each mount target.
     *
     * <p>For information about access control and compartments, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
     *
     * <p>For information about availability domains, see [Regions and Availability
     * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm). To get a list of
     * availability domains, use the `ListAvailabilityDomains` operation in the Identity and Access
     * Management Service API.
     *
     * <p>All Oracle Cloud Infrastructure Services resources, including mount targets, get an
     * Oracle-assigned, unique ID called an Oracle Cloud Identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)). When you
     * create a resource, you can find its OCID in the response. You can also retrieve a resource's
     * OCID by using a List API operation on that resource type, or by viewing the resource in the
     * Console.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/CreateMountTargetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMountTarget
     *     API.
     */
    CreateMountTargetResponse createMountTarget(CreateMountTargetRequest request);

    /**
     * Creates a new outbound connector in the specified compartment. You can associate an outbound
     * connector with a mount target only when they exist in the same availability domain.
     *
     * <p>For information about access control and compartments, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
     *
     * <p>For information about availability domains, see [Regions and Availability
     * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm). To get a list of
     * availability domains, use the `ListAvailabilityDomains` operation in the Identity and Access
     * Management Service API.
     *
     * <p>All Oracle Cloud Infrastructure Services resources, including outbound connectors, get an
     * Oracle-assigned, unique ID called an Oracle Cloud Identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)). When you
     * create a resource, you can find its OCID in the response. You can also retrieve a resource's
     * OCID by using a List API operation on that resource type, or by viewing the resource in the
     * Console.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/CreateOutboundConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateOutboundConnector API.
     */
    CreateOutboundConnectorResponse createOutboundConnector(CreateOutboundConnectorRequest request);

    /**
     * Create a file system, user, or group quota rule given the `fileSystemId`, `principalId`,
     * `principalType` and `isHardQuota` parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/CreateQuotaRuleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateQuotaRule
     *     API.
     */
    CreateQuotaRuleResponse createQuotaRule(CreateQuotaRuleRequest request);

    /**
     * Creates a new replication in the specified compartment. Replications are the primary resource
     * that governs the policy of cross-region replication between source and target file systems.
     * Replications are associated with a secondary resource called a {@link ReplicationTarget}
     * located in another availability domain. The associated replication target resource is
     * automatically created along with the replication resource. The replication retrieves the
     * delta of data between two snapshots of a source file system and sends it to the associated
     * `ReplicationTarget`, which retrieves the delta and applies it to the target file system. Only
     * unexported file systems can be used as target file systems. For more information, see [Using
     * Replication](https://docs.oracle.com/iaas/Content/File/Tasks/FSreplication.htm).
     *
     * <p>For information about access control and compartments, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
     *
     * <p>For information about availability domains, see [Regions and Availability
     * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm). To get a list of
     * availability domains, use the `ListAvailabilityDomains` operation in the Identity and Access
     * Management Service API.
     *
     * <p>All Oracle Cloud Infrastructure Services resources, including replications, get an
     * Oracle-assigned, unique ID called an Oracle Cloud Identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)). When you
     * create a resource, you can find its OCID in the response. You can also retrieve a resource's
     * OCID by using a List API operation on that resource type, or by viewing the resource in the
     * Console.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/CreateReplicationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateReplication
     *     API.
     */
    CreateReplicationResponse createReplication(CreateReplicationRequest request);

    /**
     * Creates a new snapshot of the specified file system. You can access the snapshot at
     * `.snapshot/<name>`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/CreateSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSnapshot API.
     */
    CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request);

    /**
     * Deletes the specified export.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/DeleteExportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExport API.
     */
    DeleteExportResponse deleteExport(DeleteExportRequest request);

    /**
     * Deletes the specified file system. Before you delete the file system, verify that no
     * remaining export resources still reference it. Deleting a file system also deletes all of its
     * snapshots.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/DeleteFileSystemExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFileSystem
     *     API.
     */
    DeleteFileSystemResponse deleteFileSystem(DeleteFileSystemRequest request);

    /**
     * Deletes the specified file system snapshot policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/DeleteFilesystemSnapshotPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteFilesystemSnapshotPolicy API.
     */
    DeleteFilesystemSnapshotPolicyResponse deleteFilesystemSnapshotPolicy(
            DeleteFilesystemSnapshotPolicyRequest request);

    /**
     * Deletes the specified mount target. This operation also deletes the mount target's VNICs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/DeleteMountTargetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMountTarget
     *     API.
     */
    DeleteMountTargetResponse deleteMountTarget(DeleteMountTargetRequest request);

    /**
     * Deletes the specified outbound connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/DeleteOutboundConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteOutboundConnector API.
     */
    DeleteOutboundConnectorResponse deleteOutboundConnector(DeleteOutboundConnectorRequest request);

    /**
     * Remove a file system, user, or group quota rule given the `fileSystemId` and `quotaRuleId`
     * parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/DeleteQuotaRuleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteQuotaRule
     *     API.
     */
    DeleteQuotaRuleResponse deleteQuotaRule(DeleteQuotaRuleRequest request);

    /**
     * Deletes the specified replication and the the associated replication target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/DeleteReplicationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteReplication
     *     API.
     */
    DeleteReplicationResponse deleteReplication(DeleteReplicationRequest request);

    /**
     * Deletes the specified replication target. This operation causes the immediate release of the
     * target file system if there are currently no delta application operations. If there is any
     * current delta being applied the delete operation is blocked until the current delta has been
     * completely applied.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/DeleteReplicationTargetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteReplicationTarget API.
     */
    DeleteReplicationTargetResponse deleteReplicationTarget(DeleteReplicationTargetRequest request);

    /**
     * Deletes the specified snapshot.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/DeleteSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSnapshot API.
     */
    DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * Detaches the file system from its parent file system
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/DetachCloneExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetachClone API.
     */
    DetachCloneResponse detachClone(DetachCloneRequest request);

    /**
     * Provides estimates for replication created using specific file system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/EstimateReplicationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use EstimateReplication
     *     API.
     */
    EstimateReplicationResponse estimateReplication(EstimateReplicationRequest request);

    /**
     * Gets the specified export's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/GetExportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExport API.
     */
    GetExportResponse getExport(GetExportRequest request);

    /**
     * Gets the specified export set's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/GetExportSetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExportSet API.
     */
    GetExportSetResponse getExportSet(GetExportSetRequest request);

    /**
     * Gets the specified file system's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/GetFileSystemExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFileSystem API.
     */
    GetFileSystemResponse getFileSystem(GetFileSystemRequest request);

    /**
     * Gets the specified file system snapshot policy's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/GetFilesystemSnapshotPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetFilesystemSnapshotPolicy API.
     */
    GetFilesystemSnapshotPolicyResponse getFilesystemSnapshotPolicy(
            GetFilesystemSnapshotPolicyRequest request);

    /**
     * Gets the specified mount target's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/GetMountTargetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMountTarget API.
     */
    GetMountTargetResponse getMountTarget(GetMountTargetRequest request);

    /**
     * Gets the specified outbound connector's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/GetOutboundConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetOutboundConnector API.
     */
    GetOutboundConnectorResponse getOutboundConnector(GetOutboundConnectorRequest request);

    /**
     * Get a file system, user, or group quota rule given the `fileSystemId` and `quotaRuleId`
     * parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/GetQuotaRuleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetQuotaRule API.
     */
    GetQuotaRuleResponse getQuotaRule(GetQuotaRuleRequest request);

    /**
     * Gets the specified replication's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/GetReplicationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetReplication API.
     */
    GetReplicationResponse getReplication(GetReplicationRequest request);

    /**
     * Gets the specified replication target's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/GetReplicationTargetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetReplicationTarget API.
     */
    GetReplicationTargetResponse getReplicationTarget(GetReplicationTargetRequest request);

    /**
     * Gets the specified snapshot's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/GetSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSnapshot API.
     */
    GetSnapshotResponse getSnapshot(GetSnapshotRequest request);

    /**
     * Lists the export set resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ListExportSetsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExportSets API.
     */
    ListExportSetsResponse listExportSets(ListExportSetsRequest request);

    /**
     * Lists export resources by compartment, file system, or export set. You must specify an export
     * set ID, a file system ID, and / or a compartment ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ListExportsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExports API.
     */
    ListExportsResponse listExports(ListExportsRequest request);

    /**
     * Lists the file system resources in the specified compartment, or by the specified compartment
     * and file system snapshot policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ListFileSystemsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFileSystems
     *     API.
     */
    ListFileSystemsResponse listFileSystems(ListFileSystemsRequest request);

    /**
     * Lists file system snapshot policies in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ListFilesystemSnapshotPoliciesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListFilesystemSnapshotPolicies API.
     */
    ListFilesystemSnapshotPoliciesResponse listFilesystemSnapshotPolicies(
            ListFilesystemSnapshotPoliciesRequest request);

    /**
     * Lists the mount target resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ListMountTargetsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMountTargets
     *     API.
     */
    ListMountTargetsResponse listMountTargets(ListMountTargetsRequest request);

    /**
     * Lists the outbound connector resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ListOutboundConnectorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListOutboundConnectors API.
     */
    ListOutboundConnectorsResponse listOutboundConnectors(ListOutboundConnectorsRequest request);

    /**
     * List user or group usages and their quota rules by certain principal type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ListQuotaRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListQuotaRules API.
     */
    ListQuotaRulesResponse listQuotaRules(ListQuotaRulesRequest request);

    /**
     * Lists the replication target resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ListReplicationTargetsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListReplicationTargets API.
     */
    ListReplicationTargetsResponse listReplicationTargets(ListReplicationTargetsRequest request);

    /**
     * Lists the replication resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ListReplicationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListReplications
     *     API.
     */
    ListReplicationsResponse listReplications(ListReplicationsRequest request);

    /**
     * Lists snapshots of the specified file system, or by file system snapshot policy and
     * compartment, or by file system snapshot policy and file system.
     *
     * <p>If file system ID is not specified, a file system snapshot policy ID and compartment ID
     * must be specified.
     *
     * <p>Users can only sort by time created when listing snapshots by file system snapshot policy
     * ID and compartment ID (sort by name is NOT supported for listing snapshots by policy and
     * compartment).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ListSnapshotsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSnapshots API.
     */
    ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request);

    /**
     * This operation pauses the scheduled snapshot creation and snapshot deletion of the policy and
     * updates the lifecycle state of the file system snapshot policy from ACTIVE to INACTIVE. When
     * a file system snapshot policy is paused, file systems that are associated with the policy
     * will not have scheduled snapshots created or deleted.
     *
     * <p>If the policy is already paused, or in the INACTIVE state, you cannot pause it again. You
     * can't pause a policy that is in a DELETING, DELETED, FAILED, CREATING or INACTIVE state;
     * attempts to pause a policy in these states result in a 409 conflict error.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/PauseFilesystemSnapshotPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PauseFilesystemSnapshotPolicy API.
     */
    PauseFilesystemSnapshotPolicyResponse pauseFilesystemSnapshotPolicy(
            PauseFilesystemSnapshotPolicyRequest request);

    /**
     * Removes a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/RemoveExportLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveExportLock
     *     API.
     */
    RemoveExportLockResponse removeExportLock(RemoveExportLockRequest request);

    /**
     * Removes a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/RemoveFileSystemLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveFileSystemLock API.
     */
    RemoveFileSystemLockResponse removeFileSystemLock(RemoveFileSystemLockRequest request);

    /**
     * Removes a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/RemoveFilesystemSnapshotPolicyLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveFilesystemSnapshotPolicyLock API.
     */
    RemoveFilesystemSnapshotPolicyLockResponse removeFilesystemSnapshotPolicyLock(
            RemoveFilesystemSnapshotPolicyLockRequest request);

    /**
     * Removes a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/RemoveMountTargetLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveMountTargetLock API.
     */
    RemoveMountTargetLockResponse removeMountTargetLock(RemoveMountTargetLockRequest request);

    /**
     * Removes a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/RemoveOutboundConnectorLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveOutboundConnectorLock API.
     */
    RemoveOutboundConnectorLockResponse removeOutboundConnectorLock(
            RemoveOutboundConnectorLockRequest request);

    /**
     * Removes a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/RemoveReplicationLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveReplicationLock API.
     */
    RemoveReplicationLockResponse removeReplicationLock(RemoveReplicationLockRequest request);

    /**
     * Removes a lock to a resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/RemoveSnapshotLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveSnapshotLock
     *     API.
     */
    RemoveSnapshotLockResponse removeSnapshotLock(RemoveSnapshotLockRequest request);

    /**
     * Schedule a downgrade shape of the mount target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ScheduleDowngradeShapeMountTargetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ScheduleDowngradeShapeMountTarget API.
     */
    ScheduleDowngradeShapeMountTargetResponse scheduleDowngradeShapeMountTarget(
            ScheduleDowngradeShapeMountTargetRequest request);

    /**
     * Enable or disable quota enforcement for the file system. If `areQuotaRulesEnabled` = `true`,
     * then the quota enforcement will be enabled. If `areQuotaRulesEnabled` = `false`, then the
     * quota enforcement will be disabled.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ToggleQuotaRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ToggleQuotaRules
     *     API.
     */
    ToggleQuotaRulesResponse toggleQuotaRules(ToggleQuotaRulesRequest request);

    /**
     * This operation unpauses a paused file system snapshot policy and updates the lifecycle state
     * of the file system snapshot policy from INACTIVE to ACTIVE. By default, file system snapshot
     * policies are in the ACTIVE state. When a file system snapshot policy is not paused, or in the
     * ACTIVE state, file systems that are associated with the policy will have snapshots created
     * and deleted according to the schedules defined in the policy.
     *
     * <p>If the policy is already in the ACTIVE state, you cannot unpause it. You can't unpause a
     * policy that is in a DELETING, DELETED, FAILED, CREATING, or ACTIVE state; attempts to unpause
     * a policy in these states result in a 409 conflict error.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UnpauseFilesystemSnapshotPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UnpauseFilesystemSnapshotPolicy API.
     */
    UnpauseFilesystemSnapshotPolicyResponse unpauseFilesystemSnapshotPolicy(
            UnpauseFilesystemSnapshotPolicyRequest request);

    /**
     * Updates the specified export's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UpdateExportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExport API.
     */
    UpdateExportResponse updateExport(UpdateExportRequest request);

    /**
     * Updates the specified export set's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UpdateExportSetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExportSet
     *     API.
     */
    UpdateExportSetResponse updateExportSet(UpdateExportSetRequest request);

    /**
     * Updates the specified file system's information. You can use this operation to rename a file
     * system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UpdateFileSystemExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateFileSystem
     *     API.
     */
    UpdateFileSystemResponse updateFileSystem(UpdateFileSystemRequest request);

    /**
     * Updates the specified file system snapshot policy's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UpdateFilesystemSnapshotPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateFilesystemSnapshotPolicy API.
     */
    UpdateFilesystemSnapshotPolicyResponse updateFilesystemSnapshotPolicy(
            UpdateFilesystemSnapshotPolicyRequest request);

    /**
     * Updates the specified mount target's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UpdateMountTargetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateMountTarget
     *     API.
     */
    UpdateMountTargetResponse updateMountTarget(UpdateMountTargetRequest request);

    /**
     * Updates the specified outbound connector's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UpdateOutboundConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateOutboundConnector API.
     */
    UpdateOutboundConnectorResponse updateOutboundConnector(UpdateOutboundConnectorRequest request);

    /**
     * Edit a file system, user, or group quota rule given the `fileSystemId` and `quotaRuleId`
     * parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UpdateQuotaRuleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateQuotaRule
     *     API.
     */
    UpdateQuotaRuleResponse updateQuotaRule(UpdateQuotaRuleRequest request);

    /**
     * Updates the information for the specified replication and its associated replication target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UpdateReplicationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateReplication
     *     API.
     */
    UpdateReplicationResponse updateReplication(UpdateReplicationRequest request);

    /**
     * Updates the specified snapshot's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UpdateSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSnapshot API.
     */
    UpdateSnapshotResponse updateSnapshot(UpdateSnapshotRequest request);

    /**
     * Upgrade shape request for mount target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UpgradeShapeMountTargetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpgradeShapeMountTarget API.
     */
    UpgradeShapeMountTargetResponse upgradeShapeMountTarget(UpgradeShapeMountTargetRequest request);

    /**
     * Validates keytab contents for the secret details passed on the request or validte keytab
     * contents associated with the mount target passed in the request. The keytabs are
     * deserialized, the contents are validated for compatibility and the principal, key version
     * number and encryption type of each entry is provided as part of the response.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ValidateKeyTabsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ValidateKeyTabs
     *     API.
     */
    ValidateKeyTabsResponse validateKeyTabs(ValidateKeyTabsRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    FileStorageWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    FileStoragePaginators getPaginators();
}
