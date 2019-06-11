/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class UploadPartRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The Object Storage namespace used for the request.
     */
    private String namespaceName;

    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: `my-new-bucket1`
     *
     */
    private String bucketName;

    /**
     * The name of the object. Avoid entering confidential information.
     * Example: `test/object1.log`
     *
     */
    private String objectName;

    /**
     * The upload ID for a multipart upload.
     */
    private String uploadId;

    /**
     * The part number that identifies the object part currently being uploaded.
     */
    private Integer uploadPartNum;

    /**
     * The content length of the body.
     */
    private Long contentLength;

    /**
     * The part being uploaded to the Object Storage service.
     */
    private java.io.InputStream uploadPartBody;

    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    /**
     * The entity tag (ETag) to match. For creating and committing a multipart upload to an object, this is the entity tag of the target object.
     * For uploading a part, this is the entity tag of the target part.
     *
     */
    private String ifMatch;

    /**
     * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that the request should fail if the object
     * already exists. For creating and committing a multipart upload, this is the entity tag of the target object. For uploading a
     * part, this is the entity tag of the target part.
     *
     */
    private String ifNoneMatch;

    /**
     * 100-continue
     */
    private String expect;

    /**
     * The base-64 encoded MD5 hash of the body. If the Content-MD5 header is present, Object Storage performs an integrity check
     * on the body of the HTTP request by computing the MD5 hash for the body and comparing it to the MD5 hash supplied in the header.
     * If the two hashes do not match, the object is rejected and an HTTP-400 Unmatched Content MD5 error is returned with the message:
     * <p>
     * \"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header (HEADER_MD5)\"
     *
     */
    private String contentMD5;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UploadPartRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            objectName(o.getObjectName());
            uploadId(o.getUploadId());
            uploadPartNum(o.getUploadPartNum());
            contentLength(o.getContentLength());
            uploadPartBody(o.getUploadPartBody());
            opcClientRequestId(o.getOpcClientRequestId());
            ifMatch(o.getIfMatch());
            ifNoneMatch(o.getIfNoneMatch());
            expect(o.getExpect());
            contentMD5(o.getContentMD5());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UploadPartRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UploadPartRequest
         */
        public UploadPartRequest build() {
            UploadPartRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
