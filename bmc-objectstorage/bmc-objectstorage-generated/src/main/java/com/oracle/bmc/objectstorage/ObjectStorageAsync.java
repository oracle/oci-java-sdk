/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
public interface ObjectStorageAsync extends AutoCloseable {

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
     * Aborts an in-progress multipart upload and deletes all parts that have been uploaded.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AbortMultipartUploadResponse> abortMultipartUpload(
            AbortMultipartUploadRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AbortMultipartUploadRequest, AbortMultipartUploadResponse>
                    handler);

    /**
     * Cancels a work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Commits a multipart upload, which involves checking part numbers and entity tags (ETags) of the parts, to create an aggregate object.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CommitMultipartUploadResponse> commitMultipartUpload(
            CommitMultipartUploadRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CommitMultipartUploadRequest, CommitMultipartUploadResponse>
                    handler);

    /**
     * Creates a request to copy an object within a region or to another region.
     * <p>
     * See [Object Names](https://docs.cloud.oracle.com/Content/Object/Tasks/managingobjects.htm#namerequirements)
     * for object naming requirements.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CopyObjectResponse> copyObject(
            CopyObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<CopyObjectRequest, CopyObjectResponse> handler);

    /**
     * Creates a bucket in the given namespace with a bucket name and optional user-defined metadata. Avoid entering
     * confidential information in bucket names.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateBucketResponse> createBucket(
            CreateBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBucketRequest, CreateBucketResponse>
                    handler);

    /**
     * Starts a new multipart upload to a specific object in the given bucket in the given namespace.
     * <p>
     * See [Object Names](https://docs.cloud.oracle.com/Content/Object/Tasks/managingobjects.htm#namerequirements)
     * for object naming requirements.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateMultipartUploadResponse> createMultipartUpload(
            CreateMultipartUploadRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMultipartUploadRequest, CreateMultipartUploadResponse>
                    handler);

    /**
     * Creates a pre-authenticated request specific to the bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePreauthenticatedRequestResponse>
            createPreauthenticatedRequest(
                    CreatePreauthenticatedRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreatePreauthenticatedRequestRequest,
                                    CreatePreauthenticatedRequestResponse>
                            handler);

    /**
     * Creates a replication policy for the specified bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateReplicationPolicyResponse> createReplicationPolicy(
            CreateReplicationPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateReplicationPolicyRequest, CreateReplicationPolicyResponse>
                    handler);

    /**
     * Creates a new retention rule in the specified bucket. The new rule will take effect typically within 30 seconds.
     * Note that a maximum of 100 rules are supported on a bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateRetentionRuleResponse> createRetentionRule(
            CreateRetentionRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateRetentionRuleRequest, CreateRetentionRuleResponse>
                    handler);

    /**
     * Deletes a bucket if the bucket is already empty. If the bucket is not empty, use
     * {@link #deleteObject(DeleteObjectRequest, Consumer, Consumer) deleteObject} first. In addition,
     * you cannot delete a bucket that has a multipart upload in progress or a pre-authenticated
     * request associated with that bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBucketResponse> deleteBucket(
            DeleteBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBucketRequest, DeleteBucketResponse>
                    handler);

    /**
     * Deletes an object.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteObjectResponse> deleteObject(
            DeleteObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteObjectRequest, DeleteObjectResponse>
                    handler);

    /**
     * Deletes the object lifecycle policy for the bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteObjectLifecyclePolicyResponse> deleteObjectLifecyclePolicy(
            DeleteObjectLifecyclePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteObjectLifecyclePolicyRequest, DeleteObjectLifecyclePolicyResponse>
                    handler);

    /**
     * Deletes the pre-authenticated request for the bucket.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePreauthenticatedRequestResponse>
            deletePreauthenticatedRequest(
                    DeletePreauthenticatedRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeletePreauthenticatedRequestRequest,
                                    DeletePreauthenticatedRequestResponse>
                            handler);

    /**
     * Deletes the replication policy associated with the source bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteReplicationPolicyResponse> deleteReplicationPolicy(
            DeleteReplicationPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteReplicationPolicyRequest, DeleteReplicationPolicyResponse>
                    handler);

    /**
     * Deletes the specified rule. The deletion takes effect typically within 30 seconds.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRetentionRuleResponse> deleteRetentionRule(
            DeleteRetentionRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteRetentionRuleRequest, DeleteRetentionRuleResponse>
                    handler);

    /**
     * Gets the current representation of the given bucket in the given Object Storage namespace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetBucketResponse> getBucket(
            GetBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBucketRequest, GetBucketResponse> handler);

    /**
     * Each Oracle Cloud Infrastructure tenant is assigned one unique and uneditable Object Storage namespace. The namespace
     * is a system-generated string assigned during account creation. For some older tenancies, the namespace string may be
     * the tenancy name in all lower-case letters. You cannot edit a namespace.
     * <p>
     * GetNamespace returns the name of the Object Storage namespace for the user making the request.
     * If an optional compartmentId query parameter is provided, GetNamespace returns the namespace name of the corresponding
     * tenancy, provided the user has access to it.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetNamespaceResponse> getNamespace(
            GetNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetNamespaceRequest, GetNamespaceResponse>
                    handler);

    /**
     * Gets the metadata for the Object Storage namespace, which contains defaultS3CompartmentId and
     * defaultSwiftCompartmentId.
     * <p>
     * Any user with the OBJECTSTORAGE_NAMESPACE_READ permission will be able to see the current metadata. If you are
     * not authorized, talk to an administrator. If you are an administrator who needs to write policies
     * to give users access, see
     * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetNamespaceMetadataResponse> getNamespaceMetadata(
            GetNamespaceMetadataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetNamespaceMetadataRequest, GetNamespaceMetadataResponse>
                    handler);

    /**
     * Gets the metadata and body of an object.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetObjectResponse> getObject(
            GetObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetObjectRequest, GetObjectResponse> handler);

    /**
     * Gets the object lifecycle policy for the bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetObjectLifecyclePolicyResponse> getObjectLifecyclePolicy(
            GetObjectLifecyclePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetObjectLifecyclePolicyRequest, GetObjectLifecyclePolicyResponse>
                    handler);

    /**
     * Gets the pre-authenticated request for the bucket.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPreauthenticatedRequestResponse> getPreauthenticatedRequest(
            GetPreauthenticatedRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPreauthenticatedRequestRequest, GetPreauthenticatedRequestResponse>
                    handler);

    /**
     * Get the replication policy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetReplicationPolicyResponse> getReplicationPolicy(
            GetReplicationPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetReplicationPolicyRequest, GetReplicationPolicyResponse>
                    handler);

    /**
     * Get the specified retention rule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetRetentionRuleResponse> getRetentionRule(
            GetRetentionRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRetentionRuleRequest, GetRetentionRuleResponse>
                    handler);

    /**
     * Gets the status of the work request for the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Efficiently checks to see if a bucket exists and gets the current entity tag (ETag) for the bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<HeadBucketResponse> headBucket(
            HeadBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<HeadBucketRequest, HeadBucketResponse> handler);

    /**
     * Gets the user-defined metadata and entity tag (ETag) for an object.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<HeadObjectResponse> headObject(
            HeadObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<HeadObjectRequest, HeadObjectResponse> handler);

    /**
     * Gets a list of all BucketSummary items in a compartment. A BucketSummary contains only summary fields for the bucket
     * and does not contain fields like the user-defined metadata.
     * <p>
     * ListBuckets returns a BucketSummary containing at most 1000 buckets. To paginate through more buckets, use the returned
     * `opc-next-page` value with the `page` request parameter.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you are not authorized,
     * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListBucketsResponse> listBuckets(
            ListBucketsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBucketsRequest, ListBucketsResponse> handler);

    /**
     * Lists the parts of an in-progress multipart upload.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMultipartUploadPartsResponse> listMultipartUploadParts(
            ListMultipartUploadPartsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMultipartUploadPartsRequest, ListMultipartUploadPartsResponse>
                    handler);

    /**
     * Lists all of the in-progress multipart uploads for the given bucket in the given Object Storage namespace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMultipartUploadsResponse> listMultipartUploads(
            ListMultipartUploadsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMultipartUploadsRequest, ListMultipartUploadsResponse>
                    handler);

    /**
     * Lists the object versions in a bucket.
     * <p>
     * ListObjectVersions returns an ObjectVersionCollection containing at most 1000 object versions. To paginate through
     * more object versions, use the returned `opc-next-page` value with the `page` request parameter.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you are not authorized,
     * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListObjectVersionsResponse> listObjectVersions(
            ListObjectVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListObjectVersionsRequest, ListObjectVersionsResponse>
                    handler);

    /**
     * Lists the objects in a bucket. By default, ListObjects returns object names only. See the `fields`
     * parameter for other fields that you can optionally include in ListObjects response.
     * <p>
     * ListObjects returns at most 1000 objects. To paginate through more objects, use the returned 'nextStartWith'
     * value with the 'start' parameter. To filter which objects ListObjects returns, use the 'start' and 'end'
     * parameters.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you are not authorized,
     * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListObjectsResponse> listObjects(
            ListObjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListObjectsRequest, ListObjectsResponse> handler);

    /**
     * Lists pre-authenticated requests for the bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPreauthenticatedRequestsResponse> listPreauthenticatedRequests(
            ListPreauthenticatedRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPreauthenticatedRequestsRequest,
                            ListPreauthenticatedRequestsResponse>
                    handler);

    /**
     * List the replication policies associated with a bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListReplicationPoliciesResponse> listReplicationPolicies(
            ListReplicationPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListReplicationPoliciesRequest, ListReplicationPoliciesResponse>
                    handler);

    /**
     * List the replication sources of a destination bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListReplicationSourcesResponse> listReplicationSources(
            ListReplicationSourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListReplicationSourcesRequest, ListReplicationSourcesResponse>
                    handler);

    /**
     * List the retention rules for a bucket. The retention rules are sorted based on creation time,
     * with the most recently created retention rule returned first.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListRetentionRulesResponse> listRetentionRules(
            ListRetentionRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRetentionRulesRequest, ListRetentionRulesResponse>
                    handler);

    /**
     * Lists the errors of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Lists the logs of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Stops replication to the destination bucket and removes the replication policy. When the replication
     * policy was created, this destination bucket became read-only except for new and changed objects replicated
     * automatically from the source bucket. MakeBucketWritable removes the replication policy. This bucket is no
     * longer the target for replication and is now writable, allowing users to make changes to bucket contents.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<MakeBucketWritableResponse> makeBucketWritable(
            MakeBucketWritableRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            MakeBucketWritableRequest, MakeBucketWritableResponse>
                    handler);

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
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PutObjectResponse> putObject(
            PutObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<PutObjectRequest, PutObjectResponse> handler);

    /**
     * Creates or replaces the object lifecycle policy for the bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PutObjectLifecyclePolicyResponse> putObjectLifecyclePolicy(
            PutObjectLifecyclePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PutObjectLifecyclePolicyRequest, PutObjectLifecyclePolicyResponse>
                    handler);

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
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ReencryptBucketResponse> reencryptBucket(
            ReencryptBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<ReencryptBucketRequest, ReencryptBucketResponse>
                    handler);

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
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ReencryptObjectResponse> reencryptObject(
            ReencryptObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<ReencryptObjectRequest, ReencryptObjectResponse>
                    handler);

    /**
     * Rename an object in the given Object Storage namespace.
     * <p>
     * See [Object Names](https://docs.cloud.oracle.com/Content/Object/Tasks/managingobjects.htm#namerequirements)
     * for object naming requirements.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RenameObjectResponse> renameObject(
            RenameObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<RenameObjectRequest, RenameObjectResponse>
                    handler);

    /**
     * Restores one or more objects specified by the objectName parameter.
     * By default objects will be restored for 24 hours. Duration can be configured using the hours parameter.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestoreObjectsResponse> restoreObjects(
            RestoreObjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<RestoreObjectsRequest, RestoreObjectsResponse>
                    handler);

    /**
     * Performs a partial or full update of a bucket's user-defined metadata.
     * <p>
     * Use UpdateBucket to move a bucket from one compartment to another within the same tenancy. Supply the compartmentID
     * of the compartment that you want to move the bucket to. For more information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBucketResponse> updateBucket(
            UpdateBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateBucketRequest, UpdateBucketResponse>
                    handler);

    /**
     * By default, buckets created using the Amazon S3 Compatibility API or the Swift API are created in the root
     * compartment of the Oracle Cloud Infrastructure tenancy.
     * <p>
     * You can change the default Swift/Amazon S3 compartmentId designation to a different compartmentId. All
     * subsequent bucket creations will use the new default compartment, but no previously created
     * buckets will be modified. A user must have OBJECTSTORAGE_NAMESPACE_UPDATE permission to make changes to the default
     * compartments for Amazon S3 and Swift.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNamespaceMetadataResponse> updateNamespaceMetadata(
            UpdateNamespaceMetadataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateNamespaceMetadataRequest, UpdateNamespaceMetadataResponse>
                    handler);

    /**
     * Changes the storage tier of the object specified by the objectName parameter.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateObjectStorageTierResponse> updateObjectStorageTier(
            UpdateObjectStorageTierRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateObjectStorageTierRequest, UpdateObjectStorageTierResponse>
                    handler);

    /**
     * Updates the specified retention rule. Rule changes take effect typically within 30 seconds.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRetentionRuleResponse> updateRetentionRule(
            UpdateRetentionRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateRetentionRuleRequest, UpdateRetentionRuleResponse>
                    handler);

    /**
     * Uploads a single part of a multipart upload.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UploadPartResponse> uploadPart(
            UploadPartRequest request,
            com.oracle.bmc.responses.AsyncHandler<UploadPartRequest, UploadPartResponse> handler);
}
