/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage;

import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

/**
 * Common set of Object Storage and Archive Storage APIs for managing buckets, objects, and related resources.
 * For more information, see [Overview of Object Storage](https://docs.cloud.oracle.com/Content/Object/Concepts/objectstorageoverview.htm) and
 * [Overview of Archive Storage](https://docs.cloud.oracle.com/Content/Archive/Concepts/archivestorageoverview.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface ObjectStorage extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

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
     * Aborts an in-progress multipart upload and deletes all parts that have been uploaded.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    AbortMultipartUploadResponse abortMultipartUpload(AbortMultipartUploadRequest request);

    /**
     * Cancels a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request);

    /**
     * Commits a multipart upload, which involves checking part numbers and entity tags (ETags) of the parts, to create an aggregate object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CommitMultipartUploadResponse commitMultipartUpload(CommitMultipartUploadRequest request);

    /**
     * Creates a request to copy an object within a region or to another region.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CopyObjectResponse copyObject(CopyObjectRequest request);

    /**
     * Creates a bucket in the given namespace with a bucket name and optional user-defined metadata. Avoid entering
     * confidential information in bucket names.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateBucketResponse createBucket(CreateBucketRequest request);

    /**
     * Starts a new multipart upload to a specific object in the given bucket in the given namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateMultipartUploadResponse createMultipartUpload(CreateMultipartUploadRequest request);

    /**
     * Creates a pre-authenticated request specific to the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreatePreauthenticatedRequestResponse createPreauthenticatedRequest(
            CreatePreauthenticatedRequestRequest request);

    /**
     * Creates a replication policy for the specified bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateReplicationPolicyResponse createReplicationPolicy(CreateReplicationPolicyRequest request);

    /**
     * Creates a new retention rule in the specified bucket. The new rule will take effect typically within 30 seconds.
     * Note that a maximum of 100 rules are supported on a bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateRetentionRuleResponse createRetentionRule(CreateRetentionRuleRequest request);

    /**
     * Deletes a bucket if the bucket is already empty. If the bucket is not empty, use
     * {@link #deleteObject(DeleteObjectRequest) deleteObject} first. In addition,
     * you cannot delete a bucket that has a multipart upload in progress or a pre-authenticated
     * request associated with that bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteBucketResponse deleteBucket(DeleteBucketRequest request);

    /**
     * Deletes an object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteObjectResponse deleteObject(DeleteObjectRequest request);

    /**
     * Deletes the object lifecycle policy for the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteObjectLifecyclePolicyResponse deleteObjectLifecyclePolicy(
            DeleteObjectLifecyclePolicyRequest request);

    /**
     * Deletes the pre-authenticated request for the bucket.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeletePreauthenticatedRequestResponse deletePreauthenticatedRequest(
            DeletePreauthenticatedRequestRequest request);

    /**
     * Deletes the replication policy associated with the source bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteReplicationPolicyResponse deleteReplicationPolicy(DeleteReplicationPolicyRequest request);

    /**
     * Deletes the specified rule. The deletion takes effect typically within 30 seconds.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteRetentionRuleResponse deleteRetentionRule(DeleteRetentionRuleRequest request);

    /**
     * Gets the current representation of the given bucket in the given Object Storage namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBucketResponse getBucket(GetBucketRequest request);

    /**
     * Each Oracle Cloud Infrastructure tenant is assigned one unique and uneditable Object Storage namespace. The namespace
     * is a system-generated string assigned during account creation. For some older tenancies, the namespace string may be
     * the tenancy name in all lower-case letters. You cannot edit a namespace.
     * <p>
     * GetNamespace returns the name of the Object Storage namespace for the user making the request.
     * If an optional compartmentId query parameter is provided, GetNamespace returns the namespace name of the corresponding
     * tenancy, provided the user has access to it.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetNamespaceResponse getNamespace(GetNamespaceRequest request);

    /**
     * Gets the metadata for the Object Storage namespace, which contains defaultS3CompartmentId and
     * defaultSwiftCompartmentId.
     * <p>
     * Any user with the OBJECTSTORAGE_NAMESPACE_READ permission will be able to see the current metadata. If you are
     * not authorized, talk to an administrator. If you are an administrator who needs to write policies
     * to give users access, see
     * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetNamespaceMetadataResponse getNamespaceMetadata(GetNamespaceMetadataRequest request);

    /**
     * Gets the metadata and body of an object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetObjectResponse getObject(GetObjectRequest request);

    /**
     * Gets the object lifecycle policy for the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetObjectLifecyclePolicyResponse getObjectLifecyclePolicy(
            GetObjectLifecyclePolicyRequest request);

    /**
     * Gets the pre-authenticated request for the bucket.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPreauthenticatedRequestResponse getPreauthenticatedRequest(
            GetPreauthenticatedRequestRequest request);

    /**
     * Get the replication policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetReplicationPolicyResponse getReplicationPolicy(GetReplicationPolicyRequest request);

    /**
     * Get the specified retention rule.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetRetentionRuleResponse getRetentionRule(GetRetentionRuleRequest request);

    /**
     * Gets the status of the work request for the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Efficiently checks to see if a bucket exists and gets the current entity tag (ETag) for the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    HeadBucketResponse headBucket(HeadBucketRequest request);

    /**
     * Gets the user-defined metadata and entity tag (ETag) for an object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    HeadObjectResponse headObject(HeadObjectRequest request);

    /**
     * Gets a list of all BucketSummary items in a compartment. A BucketSummary contains only summary fields for the bucket
     * and does not contain fields like the user-defined metadata.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you are not authorized,
     * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListBucketsResponse listBuckets(ListBucketsRequest request);

    /**
     * Lists the parts of an in-progress multipart upload.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListMultipartUploadPartsResponse listMultipartUploadParts(
            ListMultipartUploadPartsRequest request);

    /**
     * Lists all of the in-progress multipart uploads for the given bucket in the given Object Storage namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListMultipartUploadsResponse listMultipartUploads(ListMultipartUploadsRequest request);

    /**
     * Lists the object versions in a bucket.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you are not authorized,
     * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListObjectVersionsResponse listObjectVersions(ListObjectVersionsRequest request);

    /**
     * Lists the objects in a bucket.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you are not authorized,
     * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListObjectsResponse listObjects(ListObjectsRequest request);

    /**
     * Lists pre-authenticated requests for the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPreauthenticatedRequestsResponse listPreauthenticatedRequests(
            ListPreauthenticatedRequestsRequest request);

    /**
     * List the replication policies associated with a bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListReplicationPoliciesResponse listReplicationPolicies(ListReplicationPoliciesRequest request);

    /**
     * List the replication sources of a destination bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListReplicationSourcesResponse listReplicationSources(ListReplicationSourcesRequest request);

    /**
     * List the retention rules for a bucket. The retention rules are sorted based on creation time,
     * with the most recently created retention rule returned first.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListRetentionRulesResponse listRetentionRules(ListRetentionRulesRequest request);

    /**
     * Lists the errors of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Lists the logs of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Stops replication to the destination bucket and removes the replication policy. When the replication
     * policy was created, this destination bucket became read-only except for new and changed objects replicated
     * automatically from the source bucket. MakeBucketWritable removes the replication policy. This bucket is no
     * longer the target for replication and is now writable, allowing users to make changes to bucket contents.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    MakeBucketWritableResponse makeBucketWritable(MakeBucketWritableRequest request);

    /**
     * Creates a new object or overwrites an existing object with the same name. The maximum object size allowed by
     * PutObject is 50 GiB.
     * <p>
     * See [Object Names](https://docs.cloud.oracle.com/Content/Object/Tasks/managingobjects.htm#namerequirements)
     * for object naming requirements.
     * <p>
     * See [Special Instructions for Object Storage PUT](https://docs.cloud.oracle.com/Content/API/Concepts/signingrequests.htm#ObjectStoragePut)
     * for request signature requirements.
     *
     *
     * Note: This operation consumes a stream.
     *
     * If the stream supports {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, when a retry is
     * necessary, the stream is reset so it starts at the beginning (or whatever the stream's position was at the time this
     * operation is called}.
     *
     * Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before, then the mark
     * will not be the same anymore after this operation, and a subsequent call to {@link java.io.InputStream#reset()} by
     * the caller will reset the stream not to the caller's mark, but to the position the stream was in when this operation
     * was called.
     *
     * If the stream is a {@link java.io.FileInputStream}, and the stream's {@link java.nio.channels.FileChannel} position
     * can be changed (like for a regular file), the stream will be wrapped in such a way that it does provide
     * support for {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same procedure as
     * above is followed. If the stream's {@link java.nio.channels.FileChannel} position cannot be changed (like for a
     * named pipe), then the stream's contents will be buffered in memory, as described below.
     *
     * If the stream does not support {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, then
     * the stream is wrapped in a {@link java.io.BufferedInputStream}, which means the entire contents may
     * be buffered in memory. Then the same procedure as above is followed.
     *
     * The contents of the stream, except when the stream is a {@link java.io.FileInputStream} whose
     * {@link java.nio.channels.FileChannel} position can be changed, should be less than 2 GiB in size if retries are used.
     * This is because streams 2 GiB in size or larger do no guarantee that mark-and-reset can be performed. If the stream
     * is larger, do not use built-in retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    PutObjectResponse putObject(PutObjectRequest request);

    /**
     * Creates or replaces the object lifecycle policy for the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    PutObjectLifecyclePolicyResponse putObjectLifecyclePolicy(
            PutObjectLifecyclePolicyRequest request);

    /**
     * Re-encrypts the unique data encryption key that encrypts each object written to the bucket by using the most recent
     * version of the master encryption key assigned to the bucket. (All data encryption keys are encrypted by a master
     * encryption key. Master encryption keys are assigned to buckets and managed by Oracle by default, but you can assign
     * a key that you created and control through the Oracle Cloud Infrastructure Key Management service.) The kmsKeyId property
     * of the bucket determines which master encryption key is assigned to the bucket. If you assigned a different Key Management
     * master encryption key to the bucket, you can call this API to re-encrypt all data encryption keys with the newly
     * assigned key. Similarly, you might want to re-encrypt all data encryption keys if the assigned key has been rotated to
     * a new key version since objects were last added to the bucket. If you call this API and there is no kmsKeyId associated
     * with the bucket, the call will fail.
     * <p>
     * Calling this API starts a work request task to re-encrypt the data encryption key of all objects in the bucket. Only
     * objects created before the time of the API call will be re-encrypted. The call can take a long time, depending on how many
     * objects are in the bucket and how big they are. This API returns a work request ID that you can use to retrieve the status
     * of the work request task.
     * All the versions of objects will be re-encrypted whether versioning is enabled or suspended at the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ReencryptBucketResponse reencryptBucket(ReencryptBucketRequest request);

    /**
     * Re-encrypts the data encryption keys that encrypt the object and its chunks. By default, when you create a bucket, the Object Storage
     * service manages the master encryption key used to encrypt each object's data encryption keys. The encryption mechanism that you specify for
     * the bucket applies to the objects it contains.
     * <p>
     * You can alternatively employ one of these encryption strategies for an object:
     * <p>
     * - You can assign a key that you created and control through the Oracle Cloud Infrastructure Vault service.
     * <p>
     * - You can encrypt an object using your own encryption key. The key you supply is known as a customer-provided encryption key (SSE-C).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ReencryptObjectResponse reencryptObject(ReencryptObjectRequest request);

    /**
     * Rename an object in the given Object Storage namespace.
     * <p>
     * See [Object Names](https://docs.cloud.oracle.com/Content/Object/Tasks/managingobjects.htm#namerequirements)
     * for object naming requirements.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RenameObjectResponse renameObject(RenameObjectRequest request);

    /**
     * Restores one or more objects specified by the objectName parameter.
     * By default objects will be restored for 24 hours. Duration can be configured using the hours parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RestoreObjectsResponse restoreObjects(RestoreObjectsRequest request);

    /**
     * Performs a partial or full update of a bucket's user-defined metadata.
     * <p>
     * Use UpdateBucket to move a bucket from one compartment to another within the same tenancy. Supply the compartmentID
     * of the compartment that you want to move the bucket to. For more information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateBucketResponse updateBucket(UpdateBucketRequest request);

    /**
     * By default, buckets created using the Amazon S3 Compatibility API or the Swift API are created in the root
     * compartment of the Oracle Cloud Infrastructure tenancy.
     * <p>
     * You can change the default Swift/Amazon S3 compartmentId designation to a different compartmentId. All
     * subsequent bucket creations will use the new default compartment, but no previously created
     * buckets will be modified. A user must have OBJECTSTORAGE_NAMESPACE_UPDATE permission to make changes to the default
     * compartments for Amazon S3 and Swift.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateNamespaceMetadataResponse updateNamespaceMetadata(UpdateNamespaceMetadataRequest request);

    /**
     * Updates the specified retention rule. Rule changes take effect typically within 30 seconds.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateRetentionRuleResponse updateRetentionRule(UpdateRetentionRuleRequest request);

    /**
     * Uploads a single part of a multipart upload.
     *
     *
     * Note: This operation consumes a stream.
     *
     * If the stream supports {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, when a retry is
     * necessary, the stream is reset so it starts at the beginning (or whatever the stream's position was at the time this
     * operation is called}.
     *
     * Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before, then the mark
     * will not be the same anymore after this operation, and a subsequent call to {@link java.io.InputStream#reset()} by
     * the caller will reset the stream not to the caller's mark, but to the position the stream was in when this operation
     * was called.
     *
     * If the stream is a {@link java.io.FileInputStream}, and the stream's {@link java.nio.channels.FileChannel} position
     * can be changed (like for a regular file), the stream will be wrapped in such a way that it does provide
     * support for {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same procedure as
     * above is followed. If the stream's {@link java.nio.channels.FileChannel} position cannot be changed (like for a
     * named pipe), then the stream's contents will be buffered in memory, as described below.
     *
     * If the stream does not support {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, then
     * the stream is wrapped in a {@link java.io.BufferedInputStream}, which means the entire contents may
     * be buffered in memory. Then the same procedure as above is followed.
     *
     * The contents of the stream, except when the stream is a {@link java.io.FileInputStream} whose
     * {@link java.nio.channels.FileChannel} position can be changed, should be less than 2 GiB in size if retries are used.
     * This is because streams 2 GiB in size or larger do no guarantee that mark-and-reset can be performed. If the stream
     * is larger, do not use built-in retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UploadPartResponse uploadPart(UploadPartRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ObjectStorageWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ObjectStoragePaginators getPaginators();
}
