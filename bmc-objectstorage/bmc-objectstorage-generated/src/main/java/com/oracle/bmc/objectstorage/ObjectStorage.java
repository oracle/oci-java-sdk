/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage;

import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

/**
 * Use Object Storage and Archive Storage APIs to manage buckets, objects, and related resources.
 * For more information, see [Overview of Object
 * Storage](https://docs.oracle.com/iaas/Content/Object/Concepts/objectstorageoverview.htm) and
 * [Overview of Archive
 * Storage](https://docs.oracle.com/iaas/Content/Archive/Concepts/archivestorageoverview.htm).
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface ObjectStorage extends AutoCloseable {

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
     * Aborts an in-progress multipart upload and deletes all parts that have been uploaded.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/AbortMultipartUploadExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AbortMultipartUpload API.
     */
    AbortMultipartUploadResponse abortMultipartUpload(AbortMultipartUploadRequest request);

    /**
     * Cancels a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CancelWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelWorkRequest
     *     API.
     */
    CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request);

    /**
     * Commits a multipart upload, which involves checking part numbers and entity tags (ETags) of
     * the parts, to create an aggregate object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CommitMultipartUploadExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CommitMultipartUpload API.
     */
    CommitMultipartUploadResponse commitMultipartUpload(CommitMultipartUploadRequest request);

    /**
     * Creates a request to copy an object within a region or to another region.
     *
     * <p>See [Object
     * Names](https://docs.oracle.com/iaas/Content/Object/Tasks/managingobjects.htm#namerequirements)
     * for object naming requirements.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CopyObjectExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CopyObject API.
     */
    CopyObjectResponse copyObject(CopyObjectRequest request);

    /**
     * Creates a bucket in the given namespace with a bucket name and optional user-defined
     * metadata. Avoid entering confidential information in bucket names.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CreateBucketExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateBucket API.
     */
    CreateBucketResponse createBucket(CreateBucketRequest request);

    /**
     * Starts a new multipart upload to a specific object in the given bucket in the given
     * namespace.
     *
     * <p>See [Object
     * Names](https://docs.oracle.com/iaas/Content/Object/Tasks/managingobjects.htm#namerequirements)
     * for object naming requirements.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CreateMultipartUploadExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateMultipartUpload API.
     */
    CreateMultipartUploadResponse createMultipartUpload(CreateMultipartUploadRequest request);

    /**
     * Creates a pre-authenticated request specific to the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CreatePreauthenticatedRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreatePreauthenticatedRequest API.
     */
    CreatePreauthenticatedRequestResponse createPreauthenticatedRequest(
            CreatePreauthenticatedRequestRequest request);

    /**
     * Create a PrivateEndpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CreatePrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreatePrivateEndpoint API.
     */
    CreatePrivateEndpointResponse createPrivateEndpoint(CreatePrivateEndpointRequest request);

    /**
     * Creates a replication policy for the specified bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CreateReplicationPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateReplicationPolicy API.
     */
    CreateReplicationPolicyResponse createReplicationPolicy(CreateReplicationPolicyRequest request);

    /**
     * Creates a new retention rule in the specified bucket. The new rule will take effect typically
     * within 30 seconds. Note that a maximum of 100 rules are supported on a bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CreateRetentionRuleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateRetentionRule
     *     API.
     */
    CreateRetentionRuleResponse createRetentionRule(CreateRetentionRuleRequest request);

    /**
     * Deletes a bucket if the bucket is already empty. If the bucket is not empty, use {@link
     * #deleteObject(DeleteObjectRequest) deleteObject} first. In addition, you cannot delete a
     * bucket that has a multipart upload in progress or a pre-authenticated request associated with
     * that bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/DeleteBucketExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteBucket API.
     */
    DeleteBucketResponse deleteBucket(DeleteBucketRequest request);

    /**
     * Deletes an object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/DeleteObjectExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteObject API.
     */
    DeleteObjectResponse deleteObject(DeleteObjectRequest request);

    /**
     * Deletes the object lifecycle policy for the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/DeleteObjectLifecyclePolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteObjectLifecyclePolicy API.
     */
    DeleteObjectLifecyclePolicyResponse deleteObjectLifecyclePolicy(
            DeleteObjectLifecyclePolicyRequest request);

    /**
     * Deletes the pre-authenticated request for the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/DeletePreauthenticatedRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeletePreauthenticatedRequest API.
     */
    DeletePreauthenticatedRequestResponse deletePreauthenticatedRequest(
            DeletePreauthenticatedRequestRequest request);

    /**
     * Deletes a Private Endpoint if it exists in the given namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/DeletePrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeletePrivateEndpoint API.
     */
    DeletePrivateEndpointResponse deletePrivateEndpoint(DeletePrivateEndpointRequest request);

    /**
     * Deletes the replication policy associated with the source bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/DeleteReplicationPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteReplicationPolicy API.
     */
    DeleteReplicationPolicyResponse deleteReplicationPolicy(DeleteReplicationPolicyRequest request);

    /**
     * Deletes the specified rule. The deletion takes effect typically within 30 seconds.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/DeleteRetentionRuleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteRetentionRule
     *     API.
     */
    DeleteRetentionRuleResponse deleteRetentionRule(DeleteRetentionRuleRequest request);

    /**
     * Gets the current representation of the given bucket in the given Object Storage namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetBucketExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBucket API.
     */
    GetBucketResponse getBucket(GetBucketRequest request);

    /**
     * Each Oracle Cloud Infrastructure tenant is assigned one unique and uneditable Object Storage
     * namespace. The namespace is a system-generated string assigned during account creation. For
     * some older tenancies, the namespace string may be the tenancy name in all lower-case letters.
     * You cannot edit a namespace.
     *
     * <p>GetNamespace returns the name of the Object Storage namespace for the user making the
     * request. If an optional compartmentId query parameter is provided, GetNamespace returns the
     * namespace name of the corresponding tenancy, provided the user has access to it.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetNamespaceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetNamespace API.
     */
    GetNamespaceResponse getNamespace(GetNamespaceRequest request);

    /**
     * Gets the metadata for the Object Storage namespace, which contains defaultS3CompartmentId and
     * defaultSwiftCompartmentId.
     *
     * <p>Any user with the OBJECTSTORAGE_NAMESPACE_READ permission will be able to see the current
     * metadata. If you are not authorized, talk to an administrator. If you are an administrator
     * who needs to write policies to give users access, see [Getting Started with
     * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetNamespaceMetadataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetNamespaceMetadata API.
     */
    GetNamespaceMetadataResponse getNamespaceMetadata(GetNamespaceMetadataRequest request);

    /**
     * Gets the metadata and body of an object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetObjectExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetObject API.
     */
    GetObjectResponse getObject(GetObjectRequest request);

    /**
     * Gets the object lifecycle policy for the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetObjectLifecyclePolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetObjectLifecyclePolicy API.
     */
    GetObjectLifecyclePolicyResponse getObjectLifecyclePolicy(
            GetObjectLifecyclePolicyRequest request);

    /**
     * Gets the pre-authenticated request for the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetPreauthenticatedRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetPreauthenticatedRequest API.
     */
    GetPreauthenticatedRequestResponse getPreauthenticatedRequest(
            GetPreauthenticatedRequestRequest request);

    /**
     * Gets the current representation of the given Private Endpoint in the given Object Storage
     * namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetPrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPrivateEndpoint
     *     API.
     */
    GetPrivateEndpointResponse getPrivateEndpoint(GetPrivateEndpointRequest request);

    /**
     * Get the replication policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetReplicationPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetReplicationPolicy API.
     */
    GetReplicationPolicyResponse getReplicationPolicy(GetReplicationPolicyRequest request);

    /**
     * Get the specified retention rule.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetRetentionRuleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetRetentionRule
     *     API.
     */
    GetRetentionRuleResponse getRetentionRule(GetRetentionRuleRequest request);

    /**
     * Gets the status of the work request for the given ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Efficiently checks to see if a bucket exists and gets the current entity tag (ETag) for the
     * bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/HeadBucketExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use HeadBucket API.
     */
    HeadBucketResponse headBucket(HeadBucketRequest request);

    /**
     * Gets the user-defined metadata and entity tag (ETag) for an object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/HeadObjectExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use HeadObject API.
     */
    HeadObjectResponse headObject(HeadObjectRequest request);

    /**
     * Gets a list of all BucketSummary items in a compartment. A BucketSummary contains only
     * summary fields for the bucket and does not contain fields like the user-defined metadata.
     *
     * <p>ListBuckets returns a BucketSummary containing at most 1000 buckets. To paginate through
     * more buckets, use the returned `opc-next-page` value with the `page` request parameter.
     *
     * <p>To use this and other API operations, you must be authorized in an IAM policy. If you are
     * not authorized, talk to an administrator. If you are an administrator who needs to write
     * policies to give users access, see [Getting Started with
     * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListBucketsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBuckets API.
     */
    ListBucketsResponse listBuckets(ListBucketsRequest request);

    /**
     * Lists the parts of an in-progress multipart upload.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListMultipartUploadPartsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListMultipartUploadParts API.
     */
    ListMultipartUploadPartsResponse listMultipartUploadParts(
            ListMultipartUploadPartsRequest request);

    /**
     * Lists all of the in-progress multipart uploads for the given bucket in the given Object
     * Storage namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListMultipartUploadsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListMultipartUploads API.
     */
    ListMultipartUploadsResponse listMultipartUploads(ListMultipartUploadsRequest request);

    /**
     * Lists the object versions in a bucket.
     *
     * <p>ListObjectVersions returns an ObjectVersionCollection containing at most 1000 object
     * versions. To paginate through more object versions, use the returned `opc-next-page` value
     * with the `page` request parameter.
     *
     * <p>To use this and other API operations, you must be authorized in an IAM policy. If you are
     * not authorized, talk to an administrator. If you are an administrator who needs to write
     * policies to give users access, see [Getting Started with
     * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListObjectVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListObjectVersions
     *     API.
     */
    ListObjectVersionsResponse listObjectVersions(ListObjectVersionsRequest request);

    /**
     * Lists the objects in a bucket. By default, ListObjects returns object names only. See the
     * `fields` parameter for other fields that you can optionally include in ListObjects response.
     *
     * <p>ListObjects returns at most 1000 objects. To paginate through more objects, use the
     * returned 'nextStartWith' value with the 'start' parameter. To filter which objects
     * ListObjects returns, use the 'start' and 'end' parameters.
     *
     * <p>To use this and other API operations, you must be authorized in an IAM policy. If you are
     * not authorized, talk to an administrator. If you are an administrator who needs to write
     * policies to give users access, see [Getting Started with
     * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListObjectsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListObjects API.
     */
    ListObjectsResponse listObjects(ListObjectsRequest request);

    /**
     * Lists pre-authenticated requests for the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListPreauthenticatedRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListPreauthenticatedRequests API.
     */
    ListPreauthenticatedRequestsResponse listPreauthenticatedRequests(
            ListPreauthenticatedRequestsRequest request);

    /**
     * Gets a list of all PrivateEndpointSummary in a compartment associated with a namespace. To
     * use this and other API operations, you must be authorized in an IAM policy. If you are not
     * authorized, talk to an administrator. If you are an administrator who needs to write policies
     * to give users access, see [Getting Started with
     * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListPrivateEndpointsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListPrivateEndpoints API.
     */
    ListPrivateEndpointsResponse listPrivateEndpoints(ListPrivateEndpointsRequest request);

    /**
     * List the replication policies associated with a bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListReplicationPoliciesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListReplicationPolicies API.
     */
    ListReplicationPoliciesResponse listReplicationPolicies(ListReplicationPoliciesRequest request);

    /**
     * List the replication sources of a destination bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListReplicationSourcesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListReplicationSources API.
     */
    ListReplicationSourcesResponse listReplicationSources(ListReplicationSourcesRequest request);

    /**
     * List the retention rules for a bucket. The retention rules are sorted based on creation time,
     * with the most recently created retention rule returned first.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListRetentionRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRetentionRules
     *     API.
     */
    ListRetentionRulesResponse listRetentionRules(ListRetentionRulesRequest request);

    /**
     * Lists the errors of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListWorkRequestErrorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Lists the logs of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListWorkRequestLogsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs
     *     API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListWorkRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests
     *     API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Stops replication to the destination bucket and removes the replication policy. When the
     * replication policy was created, this destination bucket became read-only except for new and
     * changed objects replicated automatically from the source bucket. MakeBucketWritable removes
     * the replication policy. This bucket is no longer the target for replication and is now
     * writable, allowing users to make changes to bucket contents.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/MakeBucketWritableExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use MakeBucketWritable
     *     API.
     */
    MakeBucketWritableResponse makeBucketWritable(MakeBucketWritableRequest request);

    /**
     * Creates a new object or overwrites an existing object with the same name. The maximum object
     * size allowed by PutObject is 50 GiB.
     *
     * <p>See [Object
     * Names](https://docs.oracle.com/iaas/Content/Object/Tasks/managingobjects.htm#namerequirements)
     * for object naming requirements.
     *
     * <p>See [Special Instructions for Object Storage
     * PUT](https://docs.oracle.com/iaas/Content/API/Concepts/signingrequests.htm#ObjectStoragePut)
     * for request signature requirements.
     *
     * <p>Note: This operation consumes a stream.
     *
     * <p>If the stream supports {@link java.io.InputStream#mark(int)} and {@link
     * java.io.InputStream#reset()}, when a retry is necessary, the stream is reset so it starts at
     * the beginning (or whatever the stream's position was at the time this operation is called}.
     *
     * <p>Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before,
     * then the mark will not be the same anymore after this operation, and a subsequent call to
     * {@link java.io.InputStream#reset()} by the caller will reset the stream not to the caller's
     * mark, but to the position the stream was in when this operation was called.
     *
     * <p>If the stream is a {@link java.io.FileInputStream}, and the stream's {@link
     * java.nio.channels.FileChannel} position can be changed (like for a regular file), the stream
     * will be wrapped in such a way that it does provide support for {@link
     * java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same
     * procedure as above is followed. If the stream's {@link java.nio.channels.FileChannel}
     * position cannot be changed (like for a named pipe), then the stream's contents will be
     * buffered in memory, as described below.
     *
     * <p>If the stream does not support {@link java.io.InputStream#mark(int)} and {@link
     * java.io.InputStream#reset()}, then the stream is wrapped in a {@link
     * java.io.BufferedInputStream}, which means the entire contents may be buffered in memory. Then
     * the same procedure as above is followed.
     *
     * <p>The contents of the stream, except when the stream is a {@link java.io.FileInputStream}
     * whose {@link java.nio.channels.FileChannel} position can be changed, should be less than 2
     * GiB in size if retries are used. This is because streams 2 GiB in size or larger do no
     * guarantee that mark-and-reset can be performed. If the stream is larger, do not use built-in
     * retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/PutObjectExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PutObject API.
     */
    PutObjectResponse putObject(PutObjectRequest request);

    /**
     * Creates or replaces the object lifecycle policy for the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/PutObjectLifecyclePolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PutObjectLifecyclePolicy API.
     */
    PutObjectLifecyclePolicyResponse putObjectLifecyclePolicy(
            PutObjectLifecyclePolicyRequest request);

    /**
     * Re-encrypts the unique data encryption key that encrypts each object written to the bucket by
     * using the most recent version of the master encryption key assigned to the bucket. (All data
     * encryption keys are encrypted by a master encryption key. Master encryption keys are assigned
     * to buckets and managed by Oracle by default, but you can assign a key that you created and
     * control through the Oracle Cloud Infrastructure Key Management service.) The kmsKeyId
     * property of the bucket determines which master encryption key is assigned to the bucket. If
     * you assigned a different Key Management master encryption key to the bucket, you can call
     * this API to re-encrypt all data encryption keys with the newly assigned key. Similarly, you
     * might want to re-encrypt all data encryption keys if the assigned key has been rotated to a
     * new key version since objects were last added to the bucket. If you call this API and there
     * is no kmsKeyId associated with the bucket, the call will fail.
     *
     * <p>Calling this API starts a work request task to re-encrypt the data encryption key of all
     * objects in the bucket. Only objects created before the time of the API call will be
     * re-encrypted. The call can take a long time, depending on how many objects are in the bucket
     * and how big they are. This API returns a work request ID that you can use to retrieve the
     * status of the work request task. All the versions of objects will be re-encrypted whether
     * versioning is enabled or suspended at the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ReencryptBucketExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ReencryptBucket
     *     API.
     */
    ReencryptBucketResponse reencryptBucket(ReencryptBucketRequest request);

    /**
     * Re-encrypts the data encryption keys that encrypt the object and its chunks. By default, when
     * you create a bucket, the Object Storage service manages the master encryption key used to
     * encrypt each object's data encryption keys. The encryption mechanism that you specify for the
     * bucket applies to the objects it contains.
     *
     * <p>You can alternatively employ one of these encryption strategies for an object:
     *
     * <p>- You can assign a key that you created and control through the Oracle Cloud
     * Infrastructure Vault service.
     *
     * <p>- You can encrypt an object using your own encryption key. The key you supply is known as
     * a customer-provided encryption key (SSE-C).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ReencryptObjectExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ReencryptObject
     *     API.
     */
    ReencryptObjectResponse reencryptObject(ReencryptObjectRequest request);

    /**
     * Rename an object in the given Object Storage namespace.
     *
     * <p>See [Object
     * Names](https://docs.oracle.com/iaas/Content/Object/Tasks/managingobjects.htm#namerequirements)
     * for object naming requirements.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/RenameObjectExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RenameObject API.
     */
    RenameObjectResponse renameObject(RenameObjectRequest request);

    /**
     * Restores the object specified by the objectName parameter. By default object will be restored
     * for 24 hours. Duration can be configured using the hours parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/RestoreObjectsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RestoreObjects API.
     */
    RestoreObjectsResponse restoreObjects(RestoreObjectsRequest request);

    /**
     * Performs a partial or full update of a bucket's user-defined metadata.
     *
     * <p>Use UpdateBucket to move a bucket from one compartment to another within the same tenancy.
     * Supply the compartmentID of the compartment that you want to move the bucket to. For more
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/UpdateBucketExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBucket API.
     */
    UpdateBucketResponse updateBucket(UpdateBucketRequest request);

    /**
     * By default, buckets created using the Amazon S3 Compatibility API or the Swift API are
     * created in the root compartment of the Oracle Cloud Infrastructure tenancy.
     *
     * <p>You can change the default Swift/Amazon S3 compartmentId designation to a different
     * compartmentId. All subsequent bucket creations will use the new default compartment, but no
     * previously created buckets will be modified. A user must have OBJECTSTORAGE_NAMESPACE_UPDATE
     * permission to make changes to the default compartments for Amazon S3 and Swift.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/UpdateNamespaceMetadataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateNamespaceMetadata API.
     */
    UpdateNamespaceMetadataResponse updateNamespaceMetadata(UpdateNamespaceMetadataRequest request);

    /**
     * Changes the storage tier of the object specified by the objectName parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/UpdateObjectStorageTierExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateObjectStorageTier API.
     */
    UpdateObjectStorageTierResponse updateObjectStorageTier(UpdateObjectStorageTierRequest request);

    /**
     * Performs a partial or full update of a user-defined data associated with the Private
     * Endpoint.
     *
     * <p>Use UpdatePrivateEndpoint to move a Private Endpoint from one compartment to another
     * within the same tenancy. Supply the compartmentID of the compartment that you want to move
     * the Private Endpoint to. Or use it to update the name, subnetId, endpointFqdn or
     * privateEndpointIp or accessTargets of the Private Endpoint. For more information about moving
     * resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * <p>This API follows replace semantics (rather than merge semantics). That means if the body
     * provides values for parameters and the resource has exisiting ones, this operation will
     * replace those existing values.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/UpdatePrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdatePrivateEndpoint API.
     */
    UpdatePrivateEndpointResponse updatePrivateEndpoint(UpdatePrivateEndpointRequest request);

    /**
     * Updates the specified retention rule. Rule changes take effect typically within 30 seconds.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/UpdateRetentionRuleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateRetentionRule
     *     API.
     */
    UpdateRetentionRuleResponse updateRetentionRule(UpdateRetentionRuleRequest request);

    /**
     * Uploads a single part of a multipart upload.
     *
     * <p>Note: This operation consumes a stream.
     *
     * <p>If the stream supports {@link java.io.InputStream#mark(int)} and {@link
     * java.io.InputStream#reset()}, when a retry is necessary, the stream is reset so it starts at
     * the beginning (or whatever the stream's position was at the time this operation is called}.
     *
     * <p>Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before,
     * then the mark will not be the same anymore after this operation, and a subsequent call to
     * {@link java.io.InputStream#reset()} by the caller will reset the stream not to the caller's
     * mark, but to the position the stream was in when this operation was called.
     *
     * <p>If the stream is a {@link java.io.FileInputStream}, and the stream's {@link
     * java.nio.channels.FileChannel} position can be changed (like for a regular file), the stream
     * will be wrapped in such a way that it does provide support for {@link
     * java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same
     * procedure as above is followed. If the stream's {@link java.nio.channels.FileChannel}
     * position cannot be changed (like for a named pipe), then the stream's contents will be
     * buffered in memory, as described below.
     *
     * <p>If the stream does not support {@link java.io.InputStream#mark(int)} and {@link
     * java.io.InputStream#reset()}, then the stream is wrapped in a {@link
     * java.io.BufferedInputStream}, which means the entire contents may be buffered in memory. Then
     * the same procedure as above is followed.
     *
     * <p>The contents of the stream, except when the stream is a {@link java.io.FileInputStream}
     * whose {@link java.nio.channels.FileChannel} position can be changed, should be less than 2
     * GiB in size if retries are used. This is because streams 2 GiB in size or larger do no
     * guarantee that mark-and-reset can be performed. If the stream is larger, do not use built-in
     * retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/UploadPartExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UploadPart API.
     */
    UploadPartResponse uploadPart(UploadPartRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ObjectStorageWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ObjectStoragePaginators getPaginators();
}
