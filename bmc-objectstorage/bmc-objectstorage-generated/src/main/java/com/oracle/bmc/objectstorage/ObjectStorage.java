/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage;

import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

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
     * default endpoint format ({@link Region#formatDefaultRegionEndpoint(Service, String)}
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
     * Commits a multipart upload, which involves checking part numbers and ETags of the parts, to create an aggregate object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CommitMultipartUploadResponse commitMultipartUpload(CommitMultipartUploadRequest request);

    /**
     * Creates a bucket in the given namespace with a bucket name and optional user-defined metadata. Avoid entering confidential
     * information in bucket names.
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
     * Deletes a bucket if it is already empty. If the bucket is not empty, use {@link #deleteObject(DeleteObjectRequest) deleteObject} first.
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
     * Deletes the pre-authenticated request for the bucket.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeletePreauthenticatedRequestResponse deletePreauthenticatedRequest(
            DeletePreauthenticatedRequestRequest request);

    /**
     * Gets the current representation of the given bucket in the given namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBucketResponse getBucket(GetBucketRequest request);

    /**
     * Namespaces are unique. Namespaces are either the tenancy name or a random string automatically generated during
     * account creation. You cannot edit a namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetNamespaceResponse getNamespace(GetNamespaceRequest request);

    /**
     * Get the metadata for the namespace, which contains defaultS3CompartmentId and defaultSwiftCompartmentId.
     * Any user with the NAMESPACE_READ permission will be able to see the current metadata. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write
     * policies to give users access, see [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
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
     * Gets the pre-authenticated request for the bucket.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPreauthenticatedRequestResponse getPreauthenticatedRequest(
            GetPreauthenticatedRequestRequest request);

    /**
     * Efficiently checks to see if a bucket exists and gets the current ETag for the bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    HeadBucketResponse headBucket(HeadBucketRequest request);

    /**
     * Gets the user-defined metadata and entity tag for an object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    HeadObjectResponse headObject(HeadObjectRequest request);

    /**
     * Gets a list of all `BucketSummary`s in a compartment. A `BucketSummary` contains only summary fields for the bucket
     * and does not contain fields like the user-defined metadata.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
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
     * Lists all in-progress multipart uploads for the given bucket in the given namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListMultipartUploadsResponse listMultipartUploads(ListMultipartUploadsRequest request);

    /**
     * Lists the objects in a bucket.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
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
     * Creates a new object or overwrites an existing one. See [Special Instructions for Object Storage PUT](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/signingrequests.htm#ObjectStoragePut) for request signature requirements.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    PutObjectResponse putObject(PutObjectRequest request);

    /**
     * Rename an object from source key to target key in the given namespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RenameObjectResponse renameObject(RenameObjectRequest request);

    /**
     * Restore one or more objects specified by objectName parameter.
     * By default object will be restored for 24 hours.Duration can be configured using hours parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RestoreObjectsResponse restoreObjects(RestoreObjectsRequest request);

    /**
     * Performs a partial or full update of a bucket's user-defined metadata.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateBucketResponse updateBucket(UpdateBucketRequest request);

    /**
     * Change the default Swift/S3 compartmentId of user's namespace into the user-defined compartmentId. Upon doing
     * this, all subsequent bucket creations will use the new default compartment, but no previously created
     * buckets will be modified. A user must have the NAMESPACE_UPDATE permission to make changes to the default
     * compartments for S3 and Swift.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateNamespaceMetadataResponse updateNamespaceMetadata(UpdateNamespaceMetadataRequest request);

    /**
     * Uploads a single part of a multipart upload. See [Special Instructions for Object Storage PUT](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/signingrequests.htm#ObjectStoragePut) for request signature requirements.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UploadPartResponse uploadPart(UploadPartRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ObjectStoragePaginators getPaginators();
}
