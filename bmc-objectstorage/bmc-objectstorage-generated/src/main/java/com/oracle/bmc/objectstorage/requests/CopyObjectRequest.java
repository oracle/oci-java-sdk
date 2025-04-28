/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CopyObjectExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CopyObjectRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CopyObjectRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.objectstorage.model.CopyObjectDetails> {

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
    /** The source and destination of the object to be copied. */
    private com.oracle.bmc.objectstorage.model.CopyObjectDetails copyObjectDetails;

    /** The source and destination of the object to be copied. */
    public com.oracle.bmc.objectstorage.model.CopyObjectDetails getCopyObjectDetails() {
        return copyObjectDetails;
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
     * The optional header that specifies "AES256" as the encryption algorithm to use to decrypt the
     * source object. For more information, see [Using Your Own Keys for Server-Side
     * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
     */
    private String opcSourceSseCustomerAlgorithm;

    /**
     * The optional header that specifies "AES256" as the encryption algorithm to use to decrypt the
     * source object. For more information, see [Using Your Own Keys for Server-Side
     * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
     */
    public String getOpcSourceSseCustomerAlgorithm() {
        return opcSourceSseCustomerAlgorithm;
    }
    /**
     * The optional header that specifies the base64-encoded 256-bit encryption key to use to
     * decrypt the source object. For more information, see [Using Your Own Keys for Server-Side
     * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
     */
    private String opcSourceSseCustomerKey;

    /**
     * The optional header that specifies the base64-encoded 256-bit encryption key to use to
     * decrypt the source object. For more information, see [Using Your Own Keys for Server-Side
     * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
     */
    public String getOpcSourceSseCustomerKey() {
        return opcSourceSseCustomerKey;
    }
    /**
     * The optional header that specifies the base64-encoded SHA256 hash of the encryption key used
     * to decrypt the source object. This value is used to check the integrity of the encryption
     * key. For more information, see [Using Your Own Keys for Server-Side
     * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
     */
    private String opcSourceSseCustomerKeySha256;

    /**
     * The optional header that specifies the base64-encoded SHA256 hash of the encryption key used
     * to decrypt the source object. This value is used to check the integrity of the encryption
     * key. For more information, see [Using Your Own Keys for Server-Side
     * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
     */
    public String getOpcSourceSseCustomerKeySha256() {
        return opcSourceSseCustomerKeySha256;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.objectstorage.model.CopyObjectDetails getBody$() {
        return copyObjectDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CopyObjectRequest, com.oracle.bmc.objectstorage.model.CopyObjectDetails> {
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

        /** The source and destination of the object to be copied. */
        private com.oracle.bmc.objectstorage.model.CopyObjectDetails copyObjectDetails = null;

        /**
         * The source and destination of the object to be copied.
         *
         * @param copyObjectDetails the value to set
         * @return this builder instance
         */
        public Builder copyObjectDetails(
                com.oracle.bmc.objectstorage.model.CopyObjectDetails copyObjectDetails) {
            this.copyObjectDetails = copyObjectDetails;
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
         * The optional header that specifies "AES256" as the encryption algorithm to use to decrypt
         * the source object. For more information, see [Using Your Own Keys for Server-Side
         * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
         */
        private String opcSourceSseCustomerAlgorithm = null;

        /**
         * The optional header that specifies "AES256" as the encryption algorithm to use to decrypt
         * the source object. For more information, see [Using Your Own Keys for Server-Side
         * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         * @param opcSourceSseCustomerAlgorithm the value to set
         * @return this builder instance
         */
        public Builder opcSourceSseCustomerAlgorithm(String opcSourceSseCustomerAlgorithm) {
            this.opcSourceSseCustomerAlgorithm = opcSourceSseCustomerAlgorithm;
            return this;
        }

        /**
         * The optional header that specifies the base64-encoded 256-bit encryption key to use to
         * decrypt the source object. For more information, see [Using Your Own Keys for Server-Side
         * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
         */
        private String opcSourceSseCustomerKey = null;

        /**
         * The optional header that specifies the base64-encoded 256-bit encryption key to use to
         * decrypt the source object. For more information, see [Using Your Own Keys for Server-Side
         * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         * @param opcSourceSseCustomerKey the value to set
         * @return this builder instance
         */
        public Builder opcSourceSseCustomerKey(String opcSourceSseCustomerKey) {
            this.opcSourceSseCustomerKey = opcSourceSseCustomerKey;
            return this;
        }

        /**
         * The optional header that specifies the base64-encoded SHA256 hash of the encryption key
         * used to decrypt the source object. This value is used to check the integrity of the
         * encryption key. For more information, see [Using Your Own Keys for Server-Side
         * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
         */
        private String opcSourceSseCustomerKeySha256 = null;

        /**
         * The optional header that specifies the base64-encoded SHA256 hash of the encryption key
         * used to decrypt the source object. This value is used to check the integrity of the
         * encryption key. For more information, see [Using Your Own Keys for Server-Side
         * Encryption](https://docs.oracle.com/iaas/Content/Object/Tasks/usingyourencryptionkeys.htm).
         *
         * @param opcSourceSseCustomerKeySha256 the value to set
         * @return this builder instance
         */
        public Builder opcSourceSseCustomerKeySha256(String opcSourceSseCustomerKeySha256) {
            this.opcSourceSseCustomerKeySha256 = opcSourceSseCustomerKeySha256;
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
        public Builder copy(CopyObjectRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            copyObjectDetails(o.getCopyObjectDetails());
            opcClientRequestId(o.getOpcClientRequestId());
            opcSseCustomerAlgorithm(o.getOpcSseCustomerAlgorithm());
            opcSseCustomerKey(o.getOpcSseCustomerKey());
            opcSseCustomerKeySha256(o.getOpcSseCustomerKeySha256());
            opcSourceSseCustomerAlgorithm(o.getOpcSourceSseCustomerAlgorithm());
            opcSourceSseCustomerKey(o.getOpcSourceSseCustomerKey());
            opcSourceSseCustomerKeySha256(o.getOpcSourceSseCustomerKeySha256());
            opcSseKmsKeyId(o.getOpcSseKmsKeyId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CopyObjectRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CopyObjectRequest
         */
        public CopyObjectRequest build() {
            CopyObjectRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.objectstorage.model.CopyObjectDetails body) {
            copyObjectDetails(body);
            return this;
        }

        /**
         * Build the instance of CopyObjectRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CopyObjectRequest
         */
        public CopyObjectRequest buildWithoutInvocationCallback() {
            CopyObjectRequest request = new CopyObjectRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.copyObjectDetails = copyObjectDetails;
            request.opcClientRequestId = opcClientRequestId;
            request.opcSseCustomerAlgorithm = opcSseCustomerAlgorithm;
            request.opcSseCustomerKey = opcSseCustomerKey;
            request.opcSseCustomerKeySha256 = opcSseCustomerKeySha256;
            request.opcSourceSseCustomerAlgorithm = opcSourceSseCustomerAlgorithm;
            request.opcSourceSseCustomerKey = opcSourceSseCustomerKey;
            request.opcSourceSseCustomerKeySha256 = opcSourceSseCustomerKeySha256;
            request.opcSseKmsKeyId = opcSseKmsKeyId;
            return request;
            // new CopyObjectRequest(namespaceName, bucketName, copyObjectDetails,
            // opcClientRequestId, opcSseCustomerAlgorithm, opcSseCustomerKey,
            // opcSseCustomerKeySha256, opcSourceSseCustomerAlgorithm, opcSourceSseCustomerKey,
            // opcSourceSseCustomerKeySha256, opcSseKmsKeyId);
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
                .copyObjectDetails(copyObjectDetails)
                .opcClientRequestId(opcClientRequestId)
                .opcSseCustomerAlgorithm(opcSseCustomerAlgorithm)
                .opcSseCustomerKey(opcSseCustomerKey)
                .opcSseCustomerKeySha256(opcSseCustomerKeySha256)
                .opcSourceSseCustomerAlgorithm(opcSourceSseCustomerAlgorithm)
                .opcSourceSseCustomerKey(opcSourceSseCustomerKey)
                .opcSourceSseCustomerKeySha256(opcSourceSseCustomerKeySha256)
                .opcSseKmsKeyId(opcSseKmsKeyId);
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
        sb.append(",copyObjectDetails=").append(String.valueOf(this.copyObjectDetails));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(",opcSseCustomerAlgorithm=").append(String.valueOf(this.opcSseCustomerAlgorithm));
        sb.append(",opcSseCustomerKey=").append(String.valueOf(this.opcSseCustomerKey));
        sb.append(",opcSseCustomerKeySha256=").append(String.valueOf(this.opcSseCustomerKeySha256));
        sb.append(",opcSourceSseCustomerAlgorithm=")
                .append(String.valueOf(this.opcSourceSseCustomerAlgorithm));
        sb.append(",opcSourceSseCustomerKey=").append(String.valueOf(this.opcSourceSseCustomerKey));
        sb.append(",opcSourceSseCustomerKeySha256=")
                .append(String.valueOf(this.opcSourceSseCustomerKeySha256));
        sb.append(",opcSseKmsKeyId=").append(String.valueOf(this.opcSseKmsKeyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CopyObjectRequest)) {
            return false;
        }

        CopyObjectRequest other = (CopyObjectRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.copyObjectDetails, other.copyObjectDetails)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(
                        this.opcSseCustomerAlgorithm, other.opcSseCustomerAlgorithm)
                && java.util.Objects.equals(this.opcSseCustomerKey, other.opcSseCustomerKey)
                && java.util.Objects.equals(
                        this.opcSseCustomerKeySha256, other.opcSseCustomerKeySha256)
                && java.util.Objects.equals(
                        this.opcSourceSseCustomerAlgorithm, other.opcSourceSseCustomerAlgorithm)
                && java.util.Objects.equals(
                        this.opcSourceSseCustomerKey, other.opcSourceSseCustomerKey)
                && java.util.Objects.equals(
                        this.opcSourceSseCustomerKeySha256, other.opcSourceSseCustomerKeySha256)
                && java.util.Objects.equals(this.opcSseKmsKeyId, other.opcSseKmsKeyId);
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
                        + (this.copyObjectDetails == null ? 43 : this.copyObjectDetails.hashCode());
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
                        + (this.opcSourceSseCustomerAlgorithm == null
                                ? 43
                                : this.opcSourceSseCustomerAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.opcSourceSseCustomerKey == null
                                ? 43
                                : this.opcSourceSseCustomerKey.hashCode());
        result =
                (result * PRIME)
                        + (this.opcSourceSseCustomerKeySha256 == null
                                ? 43
                                : this.opcSourceSseCustomerKeySha256.hashCode());
        result =
                (result * PRIME)
                        + (this.opcSseKmsKeyId == null ? 43 : this.opcSseKmsKeyId.hashCode());
        return result;
    }
}
