/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CreateMultipartUploadExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateMultipartUploadRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateMultipartUploadRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.objectstorage.model.CreateMultipartUploadDetails> {

    /** The Object Storage namespace used for the request. */
    private String namespaceName;

    /** The Object Storage namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The name of the bucket. Avoid entering confidential information. Example: {@code
     * my-new-bucket1}
     */
    private String bucketName;

    /**
     * The name of the bucket. Avoid entering confidential information. Example: {@code
     * my-new-bucket1}
     */
    public String getBucketName() {
        return bucketName;
    }
    /** Request object for creating a multipart upload. */
    private com.oracle.bmc.objectstorage.model.CreateMultipartUploadDetails
            createMultipartUploadDetails;

    /** Request object for creating a multipart upload. */
    public com.oracle.bmc.objectstorage.model.CreateMultipartUploadDetails
            getCreateMultipartUploadDetails() {
        return createMultipartUploadDetails;
    }
    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag
     * matches the ETag of the existing resource, GET and HEAD requests will return the resource and
     * PUT and POST requests will upload the resource.
     */
    private String ifMatch;

    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag
     * matches the ETag of the existing resource, GET and HEAD requests will return the resource and
     * PUT and POST requests will upload the resource.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that
     * the request should fail if the resource already exists.
     */
    private String ifNoneMatch;

    /**
     * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that
     * the request should fail if the resource already exists.
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }
    /** The client request ID for tracing. */
    private String opcClientRequestId;

    /** The client request ID for tracing. */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }
    /**
     * The optional header that specifies "AES256" as the encryption algorithm. For more
     * information, see [Using Your Own Keys for Server-Side
     * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
     */
    private String opcSseCustomerAlgorithm;

    /**
     * The optional header that specifies "AES256" as the encryption algorithm. For more
     * information, see [Using Your Own Keys for Server-Side
     * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
     */
    public String getOpcSseCustomerAlgorithm() {
        return opcSseCustomerAlgorithm;
    }
    /**
     * The optional header that specifies the base64-encoded 256-bit encryption key to use to
     * encrypt or decrypt the data. For more information, see [Using Your Own Keys for Server-Side
     * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
     */
    private String opcSseCustomerKey;

    /**
     * The optional header that specifies the base64-encoded 256-bit encryption key to use to
     * encrypt or decrypt the data. For more information, see [Using Your Own Keys for Server-Side
     * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
     */
    public String getOpcSseCustomerKey() {
        return opcSseCustomerKey;
    }
    /**
     * The optional header that specifies the base64-encoded SHA256 hash of the encryption key. This
     * value is used to check the integrity of the encryption key. For more information, see [Using
     * Your Own Keys for Server-Side
     * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
     */
    private String opcSseCustomerKeySha256;

    /**
     * The optional header that specifies the base64-encoded SHA256 hash of the encryption key. This
     * value is used to check the integrity of the encryption key. For more information, see [Using
     * Your Own Keys for Server-Side
     * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
     */
    public String getOpcSseCustomerKeySha256() {
        return opcSseCustomerKeySha256;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a master
     * encryption key used to call the Key Management service to generate a data encryption key or
     * to encrypt or decrypt a data encryption key.
     */
    private String opcSseKmsKeyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a master
     * encryption key used to call the Key Management service to generate a data encryption key or
     * to encrypt or decrypt a data encryption key.
     */
    public String getOpcSseKmsKeyId() {
        return opcSseKmsKeyId;
    }
    /**
     * The optional checksum algorithm to use to compute and store the checksum of the body of the
     * HTTP request (or the parts in case of multipart uploads), in addition to the default MD5
     * checksum.
     */
    private com.oracle.bmc.objectstorage.model.ChecksumAlgorithm opcChecksumAlgorithm;

    /**
     * The optional checksum algorithm to use to compute and store the checksum of the body of the
     * HTTP request (or the parts in case of multipart uploads), in addition to the default MD5
     * checksum.
     */
    public com.oracle.bmc.objectstorage.model.ChecksumAlgorithm getOpcChecksumAlgorithm() {
        return opcChecksumAlgorithm;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.objectstorage.model.CreateMultipartUploadDetails getBody$() {
        return createMultipartUploadDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateMultipartUploadRequest,
                    com.oracle.bmc.objectstorage.model.CreateMultipartUploadDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Object Storage namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Object Storage namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * The name of the bucket. Avoid entering confidential information. Example: {@code
         * my-new-bucket1}
         */
        private String bucketName = null;

        /**
         * The name of the bucket. Avoid entering confidential information. Example: {@code
         * my-new-bucket1}
         *
         * @param bucketName the value to set
         * @return this builder instance
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /** Request object for creating a multipart upload. */
        private com.oracle.bmc.objectstorage.model.CreateMultipartUploadDetails
                createMultipartUploadDetails = null;

        /**
         * Request object for creating a multipart upload.
         *
         * @param createMultipartUploadDetails the value to set
         * @return this builder instance
         */
        public Builder createMultipartUploadDetails(
                com.oracle.bmc.objectstorage.model.CreateMultipartUploadDetails
                        createMultipartUploadDetails) {
            this.createMultipartUploadDetails = createMultipartUploadDetails;
            return this;
        }

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified
         * ETag matches the ETag of the existing resource, GET and HEAD requests will return the
         * resource and PUT and POST requests will upload the resource.
         */
        private String ifMatch = null;

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified
         * ETag matches the ETag of the existing resource, GET and HEAD requests will return the
         * resource and PUT and POST requests will upload the resource.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates
         * that the request should fail if the resource already exists.
         */
        private String ifNoneMatch = null;

        /**
         * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates
         * that the request should fail if the resource already exists.
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcClientRequestId the value to set
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * The optional header that specifies "AES256" as the encryption algorithm. For more
         * information, see [Using Your Own Keys for Server-Side
         * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
         */
        private String opcSseCustomerAlgorithm = null;

        /**
         * The optional header that specifies "AES256" as the encryption algorithm. For more
         * information, see [Using Your Own Keys for Server-Side
         * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         * @param opcSseCustomerAlgorithm the value to set
         * @return this builder instance
         */
        public Builder opcSseCustomerAlgorithm(String opcSseCustomerAlgorithm) {
            this.opcSseCustomerAlgorithm = opcSseCustomerAlgorithm;
            return this;
        }

        /**
         * The optional header that specifies the base64-encoded 256-bit encryption key to use to
         * encrypt or decrypt the data. For more information, see [Using Your Own Keys for
         * Server-Side
         * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
         */
        private String opcSseCustomerKey = null;

        /**
         * The optional header that specifies the base64-encoded 256-bit encryption key to use to
         * encrypt or decrypt the data. For more information, see [Using Your Own Keys for
         * Server-Side
         * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         * @param opcSseCustomerKey the value to set
         * @return this builder instance
         */
        public Builder opcSseCustomerKey(String opcSseCustomerKey) {
            this.opcSseCustomerKey = opcSseCustomerKey;
            return this;
        }

        /**
         * The optional header that specifies the base64-encoded SHA256 hash of the encryption key.
         * This value is used to check the integrity of the encryption key. For more information,
         * see [Using Your Own Keys for Server-Side
         * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
         */
        private String opcSseCustomerKeySha256 = null;

        /**
         * The optional header that specifies the base64-encoded SHA256 hash of the encryption key.
         * This value is used to check the integrity of the encryption key. For more information,
         * see [Using Your Own Keys for Server-Side
         * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         * @param opcSseCustomerKeySha256 the value to set
         * @return this builder instance
         */
        public Builder opcSseCustomerKeySha256(String opcSseCustomerKeySha256) {
            this.opcSseCustomerKeySha256 = opcSseCustomerKeySha256;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * master encryption key used to call the Key Management service to generate a data
         * encryption key or to encrypt or decrypt a data encryption key.
         */
        private String opcSseKmsKeyId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * master encryption key used to call the Key Management service to generate a data
         * encryption key or to encrypt or decrypt a data encryption key.
         *
         * @param opcSseKmsKeyId the value to set
         * @return this builder instance
         */
        public Builder opcSseKmsKeyId(String opcSseKmsKeyId) {
            this.opcSseKmsKeyId = opcSseKmsKeyId;
            return this;
        }

        /**
         * The optional checksum algorithm to use to compute and store the checksum of the body of
         * the HTTP request (or the parts in case of multipart uploads), in addition to the default
         * MD5 checksum.
         */
        private com.oracle.bmc.objectstorage.model.ChecksumAlgorithm opcChecksumAlgorithm = null;

        /**
         * The optional checksum algorithm to use to compute and store the checksum of the body of
         * the HTTP request (or the parts in case of multipart uploads), in addition to the default
         * MD5 checksum.
         *
         * @param opcChecksumAlgorithm the value to set
         * @return this builder instance
         */
        public Builder opcChecksumAlgorithm(
                com.oracle.bmc.objectstorage.model.ChecksumAlgorithm opcChecksumAlgorithm) {
            this.opcChecksumAlgorithm = opcChecksumAlgorithm;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(CreateMultipartUploadRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            createMultipartUploadDetails(o.getCreateMultipartUploadDetails());
            ifMatch(o.getIfMatch());
            ifNoneMatch(o.getIfNoneMatch());
            opcClientRequestId(o.getOpcClientRequestId());
            opcSseCustomerAlgorithm(o.getOpcSseCustomerAlgorithm());
            opcSseCustomerKey(o.getOpcSseCustomerKey());
            opcSseCustomerKeySha256(o.getOpcSseCustomerKeySha256());
            opcSseKmsKeyId(o.getOpcSseKmsKeyId());
            opcChecksumAlgorithm(o.getOpcChecksumAlgorithm());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateMultipartUploadRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateMultipartUploadRequest
         */
        public CreateMultipartUploadRequest build() {
            CreateMultipartUploadRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.objectstorage.model.CreateMultipartUploadDetails body) {
            createMultipartUploadDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateMultipartUploadRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateMultipartUploadRequest
         */
        public CreateMultipartUploadRequest buildWithoutInvocationCallback() {
            CreateMultipartUploadRequest request = new CreateMultipartUploadRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.createMultipartUploadDetails = createMultipartUploadDetails;
            request.ifMatch = ifMatch;
            request.ifNoneMatch = ifNoneMatch;
            request.opcClientRequestId = opcClientRequestId;
            request.opcSseCustomerAlgorithm = opcSseCustomerAlgorithm;
            request.opcSseCustomerKey = opcSseCustomerKey;
            request.opcSseCustomerKeySha256 = opcSseCustomerKeySha256;
            request.opcSseKmsKeyId = opcSseKmsKeyId;
            request.opcChecksumAlgorithm = opcChecksumAlgorithm;
            return request;
            // new CreateMultipartUploadRequest(namespaceName, bucketName,
            // createMultipartUploadDetails, ifMatch, ifNoneMatch, opcClientRequestId,
            // opcSseCustomerAlgorithm, opcSseCustomerKey, opcSseCustomerKeySha256, opcSseKmsKeyId,
            // opcChecksumAlgorithm);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .bucketName(bucketName)
                .createMultipartUploadDetails(createMultipartUploadDetails)
                .ifMatch(ifMatch)
                .ifNoneMatch(ifNoneMatch)
                .opcClientRequestId(opcClientRequestId)
                .opcSseCustomerAlgorithm(opcSseCustomerAlgorithm)
                .opcSseCustomerKey(opcSseCustomerKey)
                .opcSseCustomerKeySha256(opcSseCustomerKeySha256)
                .opcSseKmsKeyId(opcSseKmsKeyId)
                .opcChecksumAlgorithm(opcChecksumAlgorithm);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",createMultipartUploadDetails=")
                .append(String.valueOf(this.createMultipartUploadDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(",opcSseCustomerAlgorithm=").append(String.valueOf(this.opcSseCustomerAlgorithm));
        sb.append(",opcSseCustomerKey=").append(String.valueOf(this.opcSseCustomerKey));
        sb.append(",opcSseCustomerKeySha256=").append(String.valueOf(this.opcSseCustomerKeySha256));
        sb.append(",opcSseKmsKeyId=").append(String.valueOf(this.opcSseKmsKeyId));
        sb.append(",opcChecksumAlgorithm=").append(String.valueOf(this.opcChecksumAlgorithm));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMultipartUploadRequest)) {
            return false;
        }

        CreateMultipartUploadRequest other = (CreateMultipartUploadRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(
                        this.createMultipartUploadDetails, other.createMultipartUploadDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(
                        this.opcSseCustomerAlgorithm, other.opcSseCustomerAlgorithm)
                && java.util.Objects.equals(this.opcSseCustomerKey, other.opcSseCustomerKey)
                && java.util.Objects.equals(
                        this.opcSseCustomerKeySha256, other.opcSseCustomerKeySha256)
                && java.util.Objects.equals(this.opcSseKmsKeyId, other.opcSseKmsKeyId)
                && java.util.Objects.equals(this.opcChecksumAlgorithm, other.opcChecksumAlgorithm);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.createMultipartUploadDetails == null
                                ? 43
                                : this.createMultipartUploadDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
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
        result =
                (result * PRIME)
                        + (this.opcChecksumAlgorithm == null
                                ? 43
                                : this.opcChecksumAlgorithm.hashCode());
        return result;
    }
}
