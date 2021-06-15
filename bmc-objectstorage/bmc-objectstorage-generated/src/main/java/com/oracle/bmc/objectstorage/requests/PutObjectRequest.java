/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/PutObjectExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PutObjectRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class PutObjectRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream>
        implements com.oracle.bmc.requests.HasContentLength {

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
     * The content length of the body.
     */
    private Long contentLength;

    /**
     * The object to upload to the object store.
     */
    private java.io.InputStream putObjectBody;

    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag matches the ETag of
     * the existing resource, GET and HEAD requests will return the resource and PUT and POST requests will upload
     * the resource.
     *
     */
    private String ifMatch;

    /**
     * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that the request should
     * fail if the resource already exists.
     *
     */
    private String ifNoneMatch;

    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    /**
     * 100-continue
     */
    private String expect;

    /**
     * The optional base-64 header that defines the encoded MD5 hash of the body. If the optional Content-MD5 header is present, Object
     * Storage performs an integrity check on the body of the HTTP request by computing the MD5 hash for the body and comparing it to the
     * MD5 hash supplied in the header. If the two hashes do not match, the object is rejected and an HTTP-400 Unmatched Content MD5 error
     * is returned with the message:
     * <p>
     * \"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header (HEADER_MD5)\"
     *
     */
    private String contentMD5;

    /**
     * The optional Content-Type header that defines the standard MIME type format of the object. Content type defaults to
     * 'application/octet-stream' if not specified in the PutObject call. Specifying values for this header has no effect
     * on Object Storage behavior. Programs that read the object determine what to do based on the value provided. For example,
     * you could use this header to identify and perform special operations on text only objects.
     *
     */
    private String contentType;

    /**
     * The optional Content-Language header that defines the content language of the object to upload. Specifying
     * values for this header has no effect on Object Storage behavior. Programs that read the object determine what
     * to do based on the value provided. For example, you could use this header to identify and differentiate objects
     * based on a particular language.
     *
     */
    private String contentLanguage;

    /**
     * The optional Content-Encoding header that defines the content encodings that were applied to the object to
     * upload. Specifying values for this header has no effect on Object Storage behavior. Programs that read the
     * object determine what to do based on the value provided. For example, you could use this header to determine
     * what decoding mechanisms need to be applied to obtain the media-type specified by the Content-Type header of
     * the object.
     *
     */
    private String contentEncoding;

    /**
     * The optional Content-Disposition header that defines presentational information for the object to be
     * returned in GetObject and HeadObject responses. Specifying values for this header has no effect on Object
     * Storage behavior. Programs that read the object determine what to do based on the value provided.
     * For example, you could use this header to let users download objects with custom filenames in a browser.
     *
     */
    private String contentDisposition;

    /**
     * The optional Cache-Control header that defines the caching behavior value to be returned in GetObject and
     * HeadObject responses. Specifying values for this header has no effect on Object Storage behavior. Programs
     * that read the object determine what to do based on the value provided.
     * For example, you could use this header to identify objects that require caching restrictions.
     *
     */
    private String cacheControl;

    /**
     * The optional header that specifies \"AES256\" as the encryption algorithm. For more information, see
     * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
     *
     */
    private String opcSseCustomerAlgorithm;

    /**
     * The optional header that specifies the base64-encoded 256-bit encryption key to use to encrypt or
     * decrypt the data. For more information, see
     * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
     *
     */
    private String opcSseCustomerKey;

    /**
     * The optional header that specifies the base64-encoded SHA256 hash of the encryption key. This
     * value is used to check the integrity of the encryption key. For more information, see
     * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
     *
     */
    private String opcSseCustomerKeySha256;

    /**
     * The storage tier that the object should be stored in. If not specified, the object will be stored in
     * the same storage tier as the bucket.
     *
     */
    private com.oracle.bmc.objectstorage.model.StorageTier storageTier;

    /**
     * Optional user-defined metadata key and value.
     */
    private java.util.Map<String, String> opcMeta;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return putObjectBody;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PutObjectRequest, java.io.InputStream> {
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
        public Builder copy(PutObjectRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            objectName(o.getObjectName());
            contentLength(o.getContentLength());
            putObjectBody(o.getPutObjectBody());
            ifMatch(o.getIfMatch());
            ifNoneMatch(o.getIfNoneMatch());
            opcClientRequestId(o.getOpcClientRequestId());
            expect(o.getExpect());
            contentMD5(o.getContentMD5());
            contentType(o.getContentType());
            contentLanguage(o.getContentLanguage());
            contentEncoding(o.getContentEncoding());
            contentDisposition(o.getContentDisposition());
            cacheControl(o.getCacheControl());
            opcSseCustomerAlgorithm(o.getOpcSseCustomerAlgorithm());
            opcSseCustomerKey(o.getOpcSseCustomerKey());
            opcSseCustomerKeySha256(o.getOpcSseCustomerKeySha256());
            storageTier(o.getStorageTier());
            opcMeta(o.getOpcMeta());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PutObjectRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PutObjectRequest
         */
        public PutObjectRequest build() {
            PutObjectRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(java.io.InputStream body) {
            putObjectBody(body);
            return this;
        }
    }
}
