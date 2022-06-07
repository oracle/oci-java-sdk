/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/PutObjectExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PutObjectRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class PutObjectRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream>
        implements com.oracle.bmc.requests.HasContentLength {

    /**
     * The Object Storage namespace used for the request.
     */
    private String namespaceName;

    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: {@code my-new-bucket1}
     *
     */
    private String bucketName;

    public String getBucketName() {
        return bucketName;
    }
    /**
     * The name of the object. Avoid entering confidential information.
     * Example: {@code test/object1.log}
     *
     */
    private String objectName;

    public String getObjectName() {
        return objectName;
    }
    /**
     * The content length of the body.
     */
    private Long contentLength;

    public Long getContentLength() {
        return contentLength;
    }
    /**
     * The object to upload to the object store.
     */
    private java.io.InputStream putObjectBody;

    public java.io.InputStream getPutObjectBody() {
        return putObjectBody;
    }
    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag matches the ETag of
     * the existing resource, GET and HEAD requests will return the resource and PUT and POST requests will upload
     * the resource.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that the request should
     * fail if the resource already exists.
     *
     */
    private String ifNoneMatch;

    public String getIfNoneMatch() {
        return ifNoneMatch;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }
    /**
     * A value of {@code 100-continue} requests preliminary verification of the request method, path, and headers before the request body is sent.
     * If no error results from such verification, the server will send a 100 (Continue) interim response to indicate readiness for the request body.
     * The only allowed value for this parameter is "100-Continue" (case-insensitive).
     *
     */
    private String expect;

    public String getExpect() {
        return expect;
    }
    /**
     * The optional base-64 header that defines the encoded MD5 hash of the body. If the optional Content-MD5 header is present, Object
     * Storage performs an integrity check on the body of the HTTP request by computing the MD5 hash for the body and comparing it to the
     * MD5 hash supplied in the header. If the two hashes do not match, the object is rejected and an HTTP-400 Unmatched Content MD5 error
     * is returned with the message:
     * <p>
     * "The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header (HEADER_MD5)"
     *
     */
    private String contentMD5;

    public String getContentMD5() {
        return contentMD5;
    }
    /**
     * The optional Content-Type header that defines the standard MIME type format of the object. Content type defaults to
     * 'application/octet-stream' if not specified in the PutObject call. Specifying values for this header has no effect
     * on Object Storage behavior. Programs that read the object determine what to do based on the value provided. For example,
     * you could use this header to identify and perform special operations on text only objects.
     *
     */
    private String contentType;

    public String getContentType() {
        return contentType;
    }
    /**
     * The optional Content-Language header that defines the content language of the object to upload. Specifying
     * values for this header has no effect on Object Storage behavior. Programs that read the object determine what
     * to do based on the value provided. For example, you could use this header to identify and differentiate objects
     * based on a particular language.
     *
     */
    private String contentLanguage;

    public String getContentLanguage() {
        return contentLanguage;
    }
    /**
     * The optional Content-Encoding header that defines the content encodings that were applied to the object to
     * upload. Specifying values for this header has no effect on Object Storage behavior. Programs that read the
     * object determine what to do based on the value provided. For example, you could use this header to determine
     * what decoding mechanisms need to be applied to obtain the media-type specified by the Content-Type header of
     * the object.
     *
     */
    private String contentEncoding;

    public String getContentEncoding() {
        return contentEncoding;
    }
    /**
     * The optional Content-Disposition header that defines presentational information for the object to be
     * returned in GetObject and HeadObject responses. Specifying values for this header has no effect on Object
     * Storage behavior. Programs that read the object determine what to do based on the value provided.
     * For example, you could use this header to let users download objects with custom filenames in a browser.
     *
     */
    private String contentDisposition;

    public String getContentDisposition() {
        return contentDisposition;
    }
    /**
     * The optional Cache-Control header that defines the caching behavior value to be returned in GetObject and
     * HeadObject responses. Specifying values for this header has no effect on Object Storage behavior. Programs
     * that read the object determine what to do based on the value provided.
     * For example, you could use this header to identify objects that require caching restrictions.
     *
     */
    private String cacheControl;

    public String getCacheControl() {
        return cacheControl;
    }
    /**
     * The optional header that specifies "AES256" as the encryption algorithm. For more information, see
     * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
     *
     */
    private String opcSseCustomerAlgorithm;

    public String getOpcSseCustomerAlgorithm() {
        return opcSseCustomerAlgorithm;
    }
    /**
     * The optional header that specifies the base64-encoded 256-bit encryption key to use to encrypt or
     * decrypt the data. For more information, see
     * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
     *
     */
    private String opcSseCustomerKey;

    public String getOpcSseCustomerKey() {
        return opcSseCustomerKey;
    }
    /**
     * The optional header that specifies the base64-encoded SHA256 hash of the encryption key. This
     * value is used to check the integrity of the encryption key. For more information, see
     * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
     *
     */
    private String opcSseCustomerKeySha256;

    public String getOpcSseCustomerKeySha256() {
        return opcSseCustomerKeySha256;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a master encryption key used to call the Key
     * Management service to generate a data encryption key or to encrypt or decrypt a data encryption key.
     *
     */
    private String opcSseKmsKeyId;

    public String getOpcSseKmsKeyId() {
        return opcSseKmsKeyId;
    }
    /**
     * The storage tier that the object should be stored in. If not specified, the object will be stored in
     * the same storage tier as the bucket.
     *
     */
    private com.oracle.bmc.objectstorage.model.StorageTier storageTier;

    public com.oracle.bmc.objectstorage.model.StorageTier getStorageTier() {
        return storageTier;
    }
    /**
     * Optional user-defined metadata key and value.
     */
    private java.util.Map<String, String> opcMeta;

    public java.util.Map<String, String> getOpcMeta() {
        return opcMeta;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return putObjectBody;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PutObjectRequest, java.io.InputStream> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String namespaceName = null;

        /**
         * The Object Storage namespace used for the request.
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        private String bucketName = null;

        /**
         * The name of the bucket. Avoid entering confidential information.
         * Example: {@code my-new-bucket1}
         *
         * @return this builder instance
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        private String objectName = null;

        /**
         * The name of the object. Avoid entering confidential information.
         * Example: {@code test/object1.log}
         *
         * @return this builder instance
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            return this;
        }

        private Long contentLength = null;

        /**
         * The content length of the body.
         * @return this builder instance
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        private java.io.InputStream putObjectBody = null;

        /**
         * The object to upload to the object store.
         * @return this builder instance
         */
        public Builder putObjectBody(java.io.InputStream putObjectBody) {
            this.putObjectBody = putObjectBody;
            return this;
        }

        private String ifMatch = null;

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag matches the ETag of
         * the existing resource, GET and HEAD requests will return the resource and PUT and POST requests will upload
         * the resource.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String ifNoneMatch = null;

        /**
         * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that the request should
         * fail if the resource already exists.
         *
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        private String expect = null;

        /**
         * A value of {@code 100-continue} requests preliminary verification of the request method, path, and headers before the request body is sent.
         * If no error results from such verification, the server will send a 100 (Continue) interim response to indicate readiness for the request body.
         * The only allowed value for this parameter is "100-Continue" (case-insensitive).
         *
         * @return this builder instance
         */
        public Builder expect(String expect) {
            this.expect = expect;
            return this;
        }

        private String contentMD5 = null;

        /**
         * The optional base-64 header that defines the encoded MD5 hash of the body. If the optional Content-MD5 header is present, Object
         * Storage performs an integrity check on the body of the HTTP request by computing the MD5 hash for the body and comparing it to the
         * MD5 hash supplied in the header. If the two hashes do not match, the object is rejected and an HTTP-400 Unmatched Content MD5 error
         * is returned with the message:
         * <p>
         * "The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header (HEADER_MD5)"
         *
         * @return this builder instance
         */
        public Builder contentMD5(String contentMD5) {
            this.contentMD5 = contentMD5;
            return this;
        }

        private String contentType = null;

        /**
         * The optional Content-Type header that defines the standard MIME type format of the object. Content type defaults to
         * 'application/octet-stream' if not specified in the PutObject call. Specifying values for this header has no effect
         * on Object Storage behavior. Programs that read the object determine what to do based on the value provided. For example,
         * you could use this header to identify and perform special operations on text only objects.
         *
         * @return this builder instance
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        private String contentLanguage = null;

        /**
         * The optional Content-Language header that defines the content language of the object to upload. Specifying
         * values for this header has no effect on Object Storage behavior. Programs that read the object determine what
         * to do based on the value provided. For example, you could use this header to identify and differentiate objects
         * based on a particular language.
         *
         * @return this builder instance
         */
        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }

        private String contentEncoding = null;

        /**
         * The optional Content-Encoding header that defines the content encodings that were applied to the object to
         * upload. Specifying values for this header has no effect on Object Storage behavior. Programs that read the
         * object determine what to do based on the value provided. For example, you could use this header to determine
         * what decoding mechanisms need to be applied to obtain the media-type specified by the Content-Type header of
         * the object.
         *
         * @return this builder instance
         */
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        private String contentDisposition = null;

        /**
         * The optional Content-Disposition header that defines presentational information for the object to be
         * returned in GetObject and HeadObject responses. Specifying values for this header has no effect on Object
         * Storage behavior. Programs that read the object determine what to do based on the value provided.
         * For example, you could use this header to let users download objects with custom filenames in a browser.
         *
         * @return this builder instance
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        private String cacheControl = null;

        /**
         * The optional Cache-Control header that defines the caching behavior value to be returned in GetObject and
         * HeadObject responses. Specifying values for this header has no effect on Object Storage behavior. Programs
         * that read the object determine what to do based on the value provided.
         * For example, you could use this header to identify objects that require caching restrictions.
         *
         * @return this builder instance
         */
        public Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }

        private String opcSseCustomerAlgorithm = null;

        /**
         * The optional header that specifies "AES256" as the encryption algorithm. For more information, see
         * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         * @return this builder instance
         */
        public Builder opcSseCustomerAlgorithm(String opcSseCustomerAlgorithm) {
            this.opcSseCustomerAlgorithm = opcSseCustomerAlgorithm;
            return this;
        }

        private String opcSseCustomerKey = null;

        /**
         * The optional header that specifies the base64-encoded 256-bit encryption key to use to encrypt or
         * decrypt the data. For more information, see
         * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         * @return this builder instance
         */
        public Builder opcSseCustomerKey(String opcSseCustomerKey) {
            this.opcSseCustomerKey = opcSseCustomerKey;
            return this;
        }

        private String opcSseCustomerKeySha256 = null;

        /**
         * The optional header that specifies the base64-encoded SHA256 hash of the encryption key. This
         * value is used to check the integrity of the encryption key. For more information, see
         * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         * @return this builder instance
         */
        public Builder opcSseCustomerKeySha256(String opcSseCustomerKeySha256) {
            this.opcSseCustomerKeySha256 = opcSseCustomerKeySha256;
            return this;
        }

        private String opcSseKmsKeyId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a master encryption key used to call the Key
         * Management service to generate a data encryption key or to encrypt or decrypt a data encryption key.
         *
         * @return this builder instance
         */
        public Builder opcSseKmsKeyId(String opcSseKmsKeyId) {
            this.opcSseKmsKeyId = opcSseKmsKeyId;
            return this;
        }

        private com.oracle.bmc.objectstorage.model.StorageTier storageTier = null;

        /**
         * The storage tier that the object should be stored in. If not specified, the object will be stored in
         * the same storage tier as the bucket.
         *
         * @return this builder instance
         */
        public Builder storageTier(com.oracle.bmc.objectstorage.model.StorageTier storageTier) {
            this.storageTier = storageTier;
            return this;
        }

        private java.util.Map<String, String> opcMeta = null;

        /**
         * Optional user-defined metadata key and value.
         * @return this builder instance
         */
        public Builder opcMeta(java.util.Map<String, String> opcMeta) {
            this.opcMeta = opcMeta;
            return this;
        }

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
            opcSseKmsKeyId(o.getOpcSseKmsKeyId());
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

        /**
         * Build the instance of PutObjectRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PutObjectRequest
         */
        public PutObjectRequest buildWithoutInvocationCallback() {
            PutObjectRequest request = new PutObjectRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.objectName = objectName;
            request.contentLength = contentLength;
            request.putObjectBody = putObjectBody;
            request.ifMatch = ifMatch;
            request.ifNoneMatch = ifNoneMatch;
            request.opcClientRequestId = opcClientRequestId;
            request.expect = expect;
            request.contentMD5 = contentMD5;
            request.contentType = contentType;
            request.contentLanguage = contentLanguage;
            request.contentEncoding = contentEncoding;
            request.contentDisposition = contentDisposition;
            request.cacheControl = cacheControl;
            request.opcSseCustomerAlgorithm = opcSseCustomerAlgorithm;
            request.opcSseCustomerKey = opcSseCustomerKey;
            request.opcSseCustomerKeySha256 = opcSseCustomerKeySha256;
            request.opcSseKmsKeyId = opcSseKmsKeyId;
            request.storageTier = storageTier;
            request.opcMeta = opcMeta;
            return request;
            // new PutObjectRequest(namespaceName, bucketName, objectName, contentLength, putObjectBody, ifMatch, ifNoneMatch, opcClientRequestId, expect, contentMD5, contentType, contentLanguage, contentEncoding, contentDisposition, cacheControl, opcSseCustomerAlgorithm, opcSseCustomerKey, opcSseCustomerKeySha256, opcSseKmsKeyId, storageTier, opcMeta);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .bucketName(bucketName)
                .objectName(objectName)
                .contentLength(contentLength)
                .putObjectBody(putObjectBody)
                .ifMatch(ifMatch)
                .ifNoneMatch(ifNoneMatch)
                .opcClientRequestId(opcClientRequestId)
                .expect(expect)
                .contentMD5(contentMD5)
                .contentType(contentType)
                .contentLanguage(contentLanguage)
                .contentEncoding(contentEncoding)
                .contentDisposition(contentDisposition)
                .cacheControl(cacheControl)
                .opcSseCustomerAlgorithm(opcSseCustomerAlgorithm)
                .opcSseCustomerKey(opcSseCustomerKey)
                .opcSseCustomerKeySha256(opcSseCustomerKeySha256)
                .opcSseKmsKeyId(opcSseKmsKeyId)
                .storageTier(storageTier)
                .opcMeta(opcMeta);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",bucketName=").append(String.valueOf(this.bucketName));
        sb.append(",objectName=").append(String.valueOf(this.objectName));
        sb.append(",contentLength=").append(String.valueOf(this.contentLength));
        sb.append(",putObjectBody=").append(String.valueOf(this.putObjectBody));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(",expect=").append(String.valueOf(this.expect));
        sb.append(",contentMD5=").append(String.valueOf(this.contentMD5));
        sb.append(",contentType=").append(String.valueOf(this.contentType));
        sb.append(",contentLanguage=").append(String.valueOf(this.contentLanguage));
        sb.append(",contentEncoding=").append(String.valueOf(this.contentEncoding));
        sb.append(",contentDisposition=").append(String.valueOf(this.contentDisposition));
        sb.append(",cacheControl=").append(String.valueOf(this.cacheControl));
        sb.append(",opcSseCustomerAlgorithm=").append(String.valueOf(this.opcSseCustomerAlgorithm));
        sb.append(",opcSseCustomerKey=").append(String.valueOf(this.opcSseCustomerKey));
        sb.append(",opcSseCustomerKeySha256=").append(String.valueOf(this.opcSseCustomerKeySha256));
        sb.append(",opcSseKmsKeyId=").append(String.valueOf(this.opcSseKmsKeyId));
        sb.append(",storageTier=").append(String.valueOf(this.storageTier));
        sb.append(",opcMeta=").append(String.valueOf(this.opcMeta));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutObjectRequest)) {
            return false;
        }

        PutObjectRequest other = (PutObjectRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(this.putObjectBody, other.putObjectBody)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.expect, other.expect)
                && java.util.Objects.equals(this.contentMD5, other.contentMD5)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.contentLanguage, other.contentLanguage)
                && java.util.Objects.equals(this.contentEncoding, other.contentEncoding)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(this.cacheControl, other.cacheControl)
                && java.util.Objects.equals(
                        this.opcSseCustomerAlgorithm, other.opcSseCustomerAlgorithm)
                && java.util.Objects.equals(this.opcSseCustomerKey, other.opcSseCustomerKey)
                && java.util.Objects.equals(
                        this.opcSseCustomerKeySha256, other.opcSseCustomerKeySha256)
                && java.util.Objects.equals(this.opcSseKmsKeyId, other.opcSseKmsKeyId)
                && java.util.Objects.equals(this.storageTier, other.storageTier)
                && java.util.Objects.equals(this.opcMeta, other.opcMeta);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result =
                (result * PRIME)
                        + (this.putObjectBody == null ? 43 : this.putObjectBody.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.expect == null ? 43 : this.expect.hashCode());
        result = (result * PRIME) + (this.contentMD5 == null ? 43 : this.contentMD5.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLanguage == null ? 43 : this.contentLanguage.hashCode());
        result =
                (result * PRIME)
                        + (this.contentEncoding == null ? 43 : this.contentEncoding.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result = (result * PRIME) + (this.cacheControl == null ? 43 : this.cacheControl.hashCode());
        result =
                (result * PRIME)
                        + (this.opcSseCustomerAlgorithm == null
                                ? 43
                                : this.opcSseCustomerAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.opcSseCustomerKey == null ? 43 : this.opcSseCustomerKey.hashCode());
        result =
                (result * PRIME)
                        + (this.opcSseCustomerKeySha256 == null
                                ? 43
                                : this.opcSseCustomerKeySha256.hashCode());
        result =
                (result * PRIME)
                        + (this.opcSseKmsKeyId == null ? 43 : this.opcSseKmsKeyId.hashCode());
        result = (result * PRIME) + (this.storageTier == null ? 43 : this.storageTier.hashCode());
        result = (result * PRIME) + (this.opcMeta == null ? 43 : this.opcMeta.hashCode());
        return result;
    }
}
