/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetObjectExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetObjectRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetObjectRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Object Storage namespace used for the request.
     */
    private String namespaceName;

    /**
     * The Object Storage namespace used for the request.
     */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: {@code my-new-bucket1}
     *
     */
    private String bucketName;

    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: {@code my-new-bucket1}
     *
     */
    public String getBucketName() {
        return bucketName;
    }
    /**
     * The name of the object. Avoid entering confidential information.
     * Example: {@code test/object1.log}
     *
     */
    private String objectName;

    /**
     * The name of the object. Avoid entering confidential information.
     * Example: {@code test/object1.log}
     *
     */
    public String getObjectName() {
        return objectName;
    }
    /**
     * VersionId used to identify a particular version of the object
     */
    private String versionId;

    /**
     * VersionId used to identify a particular version of the object
     */
    public String getVersionId() {
        return versionId;
    }
    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag matches the ETag of
     * the existing resource, GET and HEAD requests will return the resource and PUT and POST requests will upload
     * the resource.
     *
     */
    private String ifMatch;

    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag matches the ETag of
     * the existing resource, GET and HEAD requests will return the resource and PUT and POST requests will upload
     * the resource.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The entity tag (ETag) to avoid matching. Wildcards ('*') are not allowed. If the specified ETag does not
     * match the ETag of the existing resource, the request returns the expected response. If the ETag matches
     * the ETag of the existing resource, the request returns an HTTP 304 status without a response body.
     *
     */
    private String ifNoneMatch;

    /**
     * The entity tag (ETag) to avoid matching. Wildcards ('*') are not allowed. If the specified ETag does not
     * match the ETag of the existing resource, the request returns the expected response. If the ETag matches
     * the ETag of the existing resource, the request returns an HTTP 304 status without a response body.
     *
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }
    /**
     * Optional byte range to fetch, as described in [RFC 7233](https://tools.ietf.org/html/rfc7233#section-2.1).
     * Note that only a single range of bytes is supported.
     *
     */
    private com.oracle.bmc.model.Range range;

    /**
     * Optional byte range to fetch, as described in [RFC 7233](https://tools.ietf.org/html/rfc7233#section-2.1).
     * Note that only a single range of bytes is supported.
     *
     */
    public com.oracle.bmc.model.Range getRange() {
        return range;
    }
    /**
     * The optional header that specifies "AES256" as the encryption algorithm. For more information, see
     * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
     *
     */
    private String opcSseCustomerAlgorithm;

    /**
     * The optional header that specifies "AES256" as the encryption algorithm. For more information, see
     * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
     *
     */
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

    /**
     * The optional header that specifies the base64-encoded 256-bit encryption key to use to encrypt or
     * decrypt the data. For more information, see
     * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
     *
     */
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

    /**
     * The optional header that specifies the base64-encoded SHA256 hash of the encryption key. This
     * value is used to check the integrity of the encryption key. For more information, see
     * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
     *
     */
    public String getOpcSseCustomerKeySha256() {
        return opcSseCustomerKeySha256;
    }
    /**
     * Specify this query parameter to override the value of the Content-Disposition response header in the GetObject response.
     */
    private String httpResponseContentDisposition;

    /**
     * Specify this query parameter to override the value of the Content-Disposition response header in the GetObject response.
     */
    public String getHttpResponseContentDisposition() {
        return httpResponseContentDisposition;
    }
    /**
     * Specify this query parameter to override the Cache-Control response header in the GetObject response.
     */
    private String httpResponseCacheControl;

    /**
     * Specify this query parameter to override the Cache-Control response header in the GetObject response.
     */
    public String getHttpResponseCacheControl() {
        return httpResponseCacheControl;
    }
    /**
     * Specify this query parameter to override the Content-Type response header in the GetObject response.
     */
    private String httpResponseContentType;

    /**
     * Specify this query parameter to override the Content-Type response header in the GetObject response.
     */
    public String getHttpResponseContentType() {
        return httpResponseContentType;
    }
    /**
     * Specify this query parameter to override the Content-Language response header in the GetObject response.
     */
    private String httpResponseContentLanguage;

    /**
     * Specify this query parameter to override the Content-Language response header in the GetObject response.
     */
    public String getHttpResponseContentLanguage() {
        return httpResponseContentLanguage;
    }
    /**
     * Specify this query parameter to override the Content-Encoding response header in the GetObject response.
     */
    private String httpResponseContentEncoding;

    /**
     * Specify this query parameter to override the Content-Encoding response header in the GetObject response.
     */
    public String getHttpResponseContentEncoding() {
        return httpResponseContentEncoding;
    }
    /**
     * Specify this query parameter to override the Expires response header in the GetObject response.
     */
    private String httpResponseExpires;

    /**
     * Specify this query parameter to override the Expires response header in the GetObject response.
     */
    public String getHttpResponseExpires() {
        return httpResponseExpires;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetObjectRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Object Storage namespace used for the request.
         */
        private String namespaceName = null;

        /**
         * The Object Storage namespace used for the request.
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * The name of the bucket. Avoid entering confidential information.
         * Example: {@code my-new-bucket1}
         *
         */
        private String bucketName = null;

        /**
         * The name of the bucket. Avoid entering confidential information.
         * Example: {@code my-new-bucket1}
         *
         * @param bucketName the value to set
         * @return this builder instance
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * The name of the object. Avoid entering confidential information.
         * Example: {@code test/object1.log}
         *
         */
        private String objectName = null;

        /**
         * The name of the object. Avoid entering confidential information.
         * Example: {@code test/object1.log}
         *
         * @param objectName the value to set
         * @return this builder instance
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            return this;
        }

        /**
         * VersionId used to identify a particular version of the object
         */
        private String versionId = null;

        /**
         * VersionId used to identify a particular version of the object
         * @param versionId the value to set
         * @return this builder instance
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag matches the ETag of
         * the existing resource, GET and HEAD requests will return the resource and PUT and POST requests will upload
         * the resource.
         *
         */
        private String ifMatch = null;

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag matches the ETag of
         * the existing resource, GET and HEAD requests will return the resource and PUT and POST requests will upload
         * the resource.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The entity tag (ETag) to avoid matching. Wildcards ('*') are not allowed. If the specified ETag does not
         * match the ETag of the existing resource, the request returns the expected response. If the ETag matches
         * the ETag of the existing resource, the request returns an HTTP 304 status without a response body.
         *
         */
        private String ifNoneMatch = null;

        /**
         * The entity tag (ETag) to avoid matching. Wildcards ('*') are not allowed. If the specified ETag does not
         * match the ETag of the existing resource, the request returns the expected response. If the ETag matches
         * the ETag of the existing resource, the request returns an HTTP 304 status without a response body.
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcClientRequestId the value to set
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Optional byte range to fetch, as described in [RFC 7233](https://tools.ietf.org/html/rfc7233#section-2.1).
         * Note that only a single range of bytes is supported.
         *
         */
        private com.oracle.bmc.model.Range range = null;

        /**
         * Optional byte range to fetch, as described in [RFC 7233](https://tools.ietf.org/html/rfc7233#section-2.1).
         * Note that only a single range of bytes is supported.
         *
         * @param range the value to set
         * @return this builder instance
         */
        public Builder range(com.oracle.bmc.model.Range range) {
            this.range = range;
            return this;
        }

        /**
         * The optional header that specifies "AES256" as the encryption algorithm. For more information, see
         * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         */
        private String opcSseCustomerAlgorithm = null;

        /**
         * The optional header that specifies "AES256" as the encryption algorithm. For more information, see
         * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         * @param opcSseCustomerAlgorithm the value to set
         * @return this builder instance
         */
        public Builder opcSseCustomerAlgorithm(String opcSseCustomerAlgorithm) {
            this.opcSseCustomerAlgorithm = opcSseCustomerAlgorithm;
            return this;
        }

        /**
         * The optional header that specifies the base64-encoded 256-bit encryption key to use to encrypt or
         * decrypt the data. For more information, see
         * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         */
        private String opcSseCustomerKey = null;

        /**
         * The optional header that specifies the base64-encoded 256-bit encryption key to use to encrypt or
         * decrypt the data. For more information, see
         * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         * @param opcSseCustomerKey the value to set
         * @return this builder instance
         */
        public Builder opcSseCustomerKey(String opcSseCustomerKey) {
            this.opcSseCustomerKey = opcSseCustomerKey;
            return this;
        }

        /**
         * The optional header that specifies the base64-encoded SHA256 hash of the encryption key. This
         * value is used to check the integrity of the encryption key. For more information, see
         * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         */
        private String opcSseCustomerKeySha256 = null;

        /**
         * The optional header that specifies the base64-encoded SHA256 hash of the encryption key. This
         * value is used to check the integrity of the encryption key. For more information, see
         * [Using Your Own Keys for Server-Side Encryption](https://docs.cloud.oracle.com/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         * @param opcSseCustomerKeySha256 the value to set
         * @return this builder instance
         */
        public Builder opcSseCustomerKeySha256(String opcSseCustomerKeySha256) {
            this.opcSseCustomerKeySha256 = opcSseCustomerKeySha256;
            return this;
        }

        /**
         * Specify this query parameter to override the value of the Content-Disposition response header in the GetObject response.
         */
        private String httpResponseContentDisposition = null;

        /**
         * Specify this query parameter to override the value of the Content-Disposition response header in the GetObject response.
         * @param httpResponseContentDisposition the value to set
         * @return this builder instance
         */
        public Builder httpResponseContentDisposition(String httpResponseContentDisposition) {
            this.httpResponseContentDisposition = httpResponseContentDisposition;
            return this;
        }

        /**
         * Specify this query parameter to override the Cache-Control response header in the GetObject response.
         */
        private String httpResponseCacheControl = null;

        /**
         * Specify this query parameter to override the Cache-Control response header in the GetObject response.
         * @param httpResponseCacheControl the value to set
         * @return this builder instance
         */
        public Builder httpResponseCacheControl(String httpResponseCacheControl) {
            this.httpResponseCacheControl = httpResponseCacheControl;
            return this;
        }

        /**
         * Specify this query parameter to override the Content-Type response header in the GetObject response.
         */
        private String httpResponseContentType = null;

        /**
         * Specify this query parameter to override the Content-Type response header in the GetObject response.
         * @param httpResponseContentType the value to set
         * @return this builder instance
         */
        public Builder httpResponseContentType(String httpResponseContentType) {
            this.httpResponseContentType = httpResponseContentType;
            return this;
        }

        /**
         * Specify this query parameter to override the Content-Language response header in the GetObject response.
         */
        private String httpResponseContentLanguage = null;

        /**
         * Specify this query parameter to override the Content-Language response header in the GetObject response.
         * @param httpResponseContentLanguage the value to set
         * @return this builder instance
         */
        public Builder httpResponseContentLanguage(String httpResponseContentLanguage) {
            this.httpResponseContentLanguage = httpResponseContentLanguage;
            return this;
        }

        /**
         * Specify this query parameter to override the Content-Encoding response header in the GetObject response.
         */
        private String httpResponseContentEncoding = null;

        /**
         * Specify this query parameter to override the Content-Encoding response header in the GetObject response.
         * @param httpResponseContentEncoding the value to set
         * @return this builder instance
         */
        public Builder httpResponseContentEncoding(String httpResponseContentEncoding) {
            this.httpResponseContentEncoding = httpResponseContentEncoding;
            return this;
        }

        /**
         * Specify this query parameter to override the Expires response header in the GetObject response.
         */
        private String httpResponseExpires = null;

        /**
         * Specify this query parameter to override the Expires response header in the GetObject response.
         * @param httpResponseExpires the value to set
         * @return this builder instance
         */
        public Builder httpResponseExpires(String httpResponseExpires) {
            this.httpResponseExpires = httpResponseExpires;
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
        public Builder copy(GetObjectRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            objectName(o.getObjectName());
            versionId(o.getVersionId());
            ifMatch(o.getIfMatch());
            ifNoneMatch(o.getIfNoneMatch());
            opcClientRequestId(o.getOpcClientRequestId());
            range(o.getRange());
            opcSseCustomerAlgorithm(o.getOpcSseCustomerAlgorithm());
            opcSseCustomerKey(o.getOpcSseCustomerKey());
            opcSseCustomerKeySha256(o.getOpcSseCustomerKeySha256());
            httpResponseContentDisposition(o.getHttpResponseContentDisposition());
            httpResponseCacheControl(o.getHttpResponseCacheControl());
            httpResponseContentType(o.getHttpResponseContentType());
            httpResponseContentLanguage(o.getHttpResponseContentLanguage());
            httpResponseContentEncoding(o.getHttpResponseContentEncoding());
            httpResponseExpires(o.getHttpResponseExpires());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetObjectRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetObjectRequest
         */
        public GetObjectRequest build() {
            GetObjectRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetObjectRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetObjectRequest
         */
        public GetObjectRequest buildWithoutInvocationCallback() {
            GetObjectRequest request = new GetObjectRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.objectName = objectName;
            request.versionId = versionId;
            request.ifMatch = ifMatch;
            request.ifNoneMatch = ifNoneMatch;
            request.opcClientRequestId = opcClientRequestId;
            request.range = range;
            request.opcSseCustomerAlgorithm = opcSseCustomerAlgorithm;
            request.opcSseCustomerKey = opcSseCustomerKey;
            request.opcSseCustomerKeySha256 = opcSseCustomerKeySha256;
            request.httpResponseContentDisposition = httpResponseContentDisposition;
            request.httpResponseCacheControl = httpResponseCacheControl;
            request.httpResponseContentType = httpResponseContentType;
            request.httpResponseContentLanguage = httpResponseContentLanguage;
            request.httpResponseContentEncoding = httpResponseContentEncoding;
            request.httpResponseExpires = httpResponseExpires;
            return request;
            // new GetObjectRequest(namespaceName, bucketName, objectName, versionId, ifMatch, ifNoneMatch, opcClientRequestId, range, opcSseCustomerAlgorithm, opcSseCustomerKey, opcSseCustomerKeySha256, httpResponseContentDisposition, httpResponseCacheControl, httpResponseContentType, httpResponseContentLanguage, httpResponseContentEncoding, httpResponseExpires);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .bucketName(bucketName)
                .objectName(objectName)
                .versionId(versionId)
                .ifMatch(ifMatch)
                .ifNoneMatch(ifNoneMatch)
                .opcClientRequestId(opcClientRequestId)
                .range(range)
                .opcSseCustomerAlgorithm(opcSseCustomerAlgorithm)
                .opcSseCustomerKey(opcSseCustomerKey)
                .opcSseCustomerKeySha256(opcSseCustomerKeySha256)
                .httpResponseContentDisposition(httpResponseContentDisposition)
                .httpResponseCacheControl(httpResponseCacheControl)
                .httpResponseContentType(httpResponseContentType)
                .httpResponseContentLanguage(httpResponseContentLanguage)
                .httpResponseContentEncoding(httpResponseContentEncoding)
                .httpResponseExpires(httpResponseExpires);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
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
        sb.append(",versionId=").append(String.valueOf(this.versionId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(",range=").append(String.valueOf(this.range));
        sb.append(",opcSseCustomerAlgorithm=").append(String.valueOf(this.opcSseCustomerAlgorithm));
        sb.append(",opcSseCustomerKey=").append(String.valueOf(this.opcSseCustomerKey));
        sb.append(",opcSseCustomerKeySha256=").append(String.valueOf(this.opcSseCustomerKeySha256));
        sb.append(",httpResponseContentDisposition=")
                .append(String.valueOf(this.httpResponseContentDisposition));
        sb.append(",httpResponseCacheControl=")
                .append(String.valueOf(this.httpResponseCacheControl));
        sb.append(",httpResponseContentType=").append(String.valueOf(this.httpResponseContentType));
        sb.append(",httpResponseContentLanguage=")
                .append(String.valueOf(this.httpResponseContentLanguage));
        sb.append(",httpResponseContentEncoding=")
                .append(String.valueOf(this.httpResponseContentEncoding));
        sb.append(",httpResponseExpires=").append(String.valueOf(this.httpResponseExpires));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetObjectRequest)) {
            return false;
        }

        GetObjectRequest other = (GetObjectRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.versionId, other.versionId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.range, other.range)
                && java.util.Objects.equals(
                        this.opcSseCustomerAlgorithm, other.opcSseCustomerAlgorithm)
                && java.util.Objects.equals(this.opcSseCustomerKey, other.opcSseCustomerKey)
                && java.util.Objects.equals(
                        this.opcSseCustomerKeySha256, other.opcSseCustomerKeySha256)
                && java.util.Objects.equals(
                        this.httpResponseContentDisposition, other.httpResponseContentDisposition)
                && java.util.Objects.equals(
                        this.httpResponseCacheControl, other.httpResponseCacheControl)
                && java.util.Objects.equals(
                        this.httpResponseContentType, other.httpResponseContentType)
                && java.util.Objects.equals(
                        this.httpResponseContentLanguage, other.httpResponseContentLanguage)
                && java.util.Objects.equals(
                        this.httpResponseContentEncoding, other.httpResponseContentEncoding)
                && java.util.Objects.equals(this.httpResponseExpires, other.httpResponseExpires);
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
        result = (result * PRIME) + (this.versionId == null ? 43 : this.versionId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.range == null ? 43 : this.range.hashCode());
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
                        + (this.httpResponseContentDisposition == null
                                ? 43
                                : this.httpResponseContentDisposition.hashCode());
        result =
                (result * PRIME)
                        + (this.httpResponseCacheControl == null
                                ? 43
                                : this.httpResponseCacheControl.hashCode());
        result =
                (result * PRIME)
                        + (this.httpResponseContentType == null
                                ? 43
                                : this.httpResponseContentType.hashCode());
        result =
                (result * PRIME)
                        + (this.httpResponseContentLanguage == null
                                ? 43
                                : this.httpResponseContentLanguage.hashCode());
        result =
                (result * PRIME)
                        + (this.httpResponseContentEncoding == null
                                ? 43
                                : this.httpResponseContentEncoding.hashCode());
        result =
                (result * PRIME)
                        + (this.httpResponseExpires == null
                                ? 43
                                : this.httpResponseExpires.hashCode());
        return result;
    }
}
