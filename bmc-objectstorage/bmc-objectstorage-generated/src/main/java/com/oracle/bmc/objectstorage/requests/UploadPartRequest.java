/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/UploadPartExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UploadPartRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UploadPartRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream>
        implements com.oracle.bmc.requests.HasContentLength {

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
    /**
     * The name of the object. Avoid entering confidential information. Example: {@code
     * test/object1.log}
     */
    private String objectName;

    /**
     * The name of the object. Avoid entering confidential information. Example: {@code
     * test/object1.log}
     */
    public String getObjectName() {
        return objectName;
    }
    /** The upload ID for a multipart upload. */
    private String uploadId;

    /** The upload ID for a multipart upload. */
    public String getUploadId() {
        return uploadId;
    }
    /** The part number that identifies the object part currently being uploaded. */
    private Integer uploadPartNum;

    /** The part number that identifies the object part currently being uploaded. */
    public Integer getUploadPartNum() {
        return uploadPartNum;
    }
    /** The content length of the body. */
    private Long contentLength;

    /** The content length of the body. */
    public Long getContentLength() {
        return contentLength;
    }
    /** The part being uploaded to the Object Storage service. */
    private java.io.InputStream uploadPartBody;

    /** The part being uploaded to the Object Storage service. */
    public java.io.InputStream getUploadPartBody() {
        return uploadPartBody;
    }
    /** The client request ID for tracing. */
    private String opcClientRequestId;

    /** The client request ID for tracing. */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
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
    /**
     * A value of {@code 100-continue} requests preliminary verification of the request method,
     * path, and headers before the request body is sent. If no error results from such
     * verification, the server will send a 100 (Continue) interim response to indicate readiness
     * for the request body. The only allowed value for this parameter is "100-Continue"
     * (case-insensitive).
     */
    private String expect;

    /**
     * A value of {@code 100-continue} requests preliminary verification of the request method,
     * path, and headers before the request body is sent. If no error results from such
     * verification, the server will send a 100 (Continue) interim response to indicate readiness
     * for the request body. The only allowed value for this parameter is "100-Continue"
     * (case-insensitive).
     */
    public String getExpect() {
        return expect;
    }
    /**
     * The optional header that defines the base64-encoded MD5 hash of the body. If the optional
     * Content-MD5 header is present, Object Storage performs an integrity check on the body of the
     * HTTP request by computing the MD5 hash for the body and comparing it to the MD5 hash supplied
     * in the header. If the two hashes do not match, the object is rejected and an HTTP-400
     * Unmatched Content MD5 error is returned with the message:
     *
     * <p>"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header
     * (HEADER_MD5)"
     */
    private String contentMD5;

    /**
     * The optional header that defines the base64-encoded MD5 hash of the body. If the optional
     * Content-MD5 header is present, Object Storage performs an integrity check on the body of the
     * HTTP request by computing the MD5 hash for the body and comparing it to the MD5 hash supplied
     * in the header. If the two hashes do not match, the object is rejected and an HTTP-400
     * Unmatched Content MD5 error is returned with the message:
     *
     * <p>"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header
     * (HEADER_MD5)"
     */
    public String getContentMD5() {
        return contentMD5;
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
     * Applicable only if CRC32C is specified in the opc-checksum-algorithm request header.
     *
     * <p>The optional header that defines the base64-encoded, 32-bit CRC32C (Castagnoli) checksum
     * of the body. If the optional opc-content-crc32c header is present, Object Storage performs an
     * integrity check on the body of the HTTP request by computing the CRC32C checksum for the body
     * and comparing it to the CRC32C checksum supplied in the header. If the two checksums do not
     * match, the object is rejected and an HTTP-400 Unmatched Content CRC32C error is returned with
     * the message:
     *
     * <p>"The computed CRC32C of the request body (ACTUAL_CRC32C) does not match the
     * opc-content-crc32c header (HEADER_CRC32C)"
     */
    private String opcContentCrc32c;

    /**
     * Applicable only if CRC32C is specified in the opc-checksum-algorithm request header.
     *
     * <p>The optional header that defines the base64-encoded, 32-bit CRC32C (Castagnoli) checksum
     * of the body. If the optional opc-content-crc32c header is present, Object Storage performs an
     * integrity check on the body of the HTTP request by computing the CRC32C checksum for the body
     * and comparing it to the CRC32C checksum supplied in the header. If the two checksums do not
     * match, the object is rejected and an HTTP-400 Unmatched Content CRC32C error is returned with
     * the message:
     *
     * <p>"The computed CRC32C of the request body (ACTUAL_CRC32C) does not match the
     * opc-content-crc32c header (HEADER_CRC32C)"
     */
    public String getOpcContentCrc32c() {
        return opcContentCrc32c;
    }
    /**
     * Applicable only if SHA256 is specified in the opc-checksum-algorithm request header.
     *
     * <p>The optional header that defines the base64-encoded SHA256 hash of the body. If the
     * optional opc-content-sha256 header is present, Object Storage performs an integrity check on
     * the body of the HTTP request by computing the SHA256 hash for the body and comparing it to
     * the SHA256 hash supplied in the header. If the two hashes do not match, the object is
     * rejected and an HTTP-400 Unmatched Content SHA256 error is returned with the message:
     *
     * <p>"The computed SHA256 of the request body (ACTUAL_SHA256) does not match the
     * opc-content-sha256 header (HEADER_SHA256)"
     */
    private String opcContentSha256;

    /**
     * Applicable only if SHA256 is specified in the opc-checksum-algorithm request header.
     *
     * <p>The optional header that defines the base64-encoded SHA256 hash of the body. If the
     * optional opc-content-sha256 header is present, Object Storage performs an integrity check on
     * the body of the HTTP request by computing the SHA256 hash for the body and comparing it to
     * the SHA256 hash supplied in the header. If the two hashes do not match, the object is
     * rejected and an HTTP-400 Unmatched Content SHA256 error is returned with the message:
     *
     * <p>"The computed SHA256 of the request body (ACTUAL_SHA256) does not match the
     * opc-content-sha256 header (HEADER_SHA256)"
     */
    public String getOpcContentSha256() {
        return opcContentSha256;
    }
    /**
     * Applicable only if SHA384 is specified in the opc-checksum-algorithm request header.
     *
     * <p>The optional header that defines the base64-encoded SHA384 hash of the body. If the
     * optional opc-content-sha384 header is present, Object Storage performs an integrity check on
     * the body of the HTTP request by computing the SHA384 hash for the body and comparing it to
     * the SHA384 hash supplied in the header. If the two hashes do not match, the object is
     * rejected and an HTTP-400 Unmatched Content SHA384 error is returned with the message:
     *
     * <p>"The computed SHA384 of the request body (ACTUAL_SHA384) does not match the
     * opc-content-sha384 header (HEADER_SHA384)"
     */
    private String opcContentSha384;

    /**
     * Applicable only if SHA384 is specified in the opc-checksum-algorithm request header.
     *
     * <p>The optional header that defines the base64-encoded SHA384 hash of the body. If the
     * optional opc-content-sha384 header is present, Object Storage performs an integrity check on
     * the body of the HTTP request by computing the SHA384 hash for the body and comparing it to
     * the SHA384 hash supplied in the header. If the two hashes do not match, the object is
     * rejected and an HTTP-400 Unmatched Content SHA384 error is returned with the message:
     *
     * <p>"The computed SHA384 of the request body (ACTUAL_SHA384) does not match the
     * opc-content-sha384 header (HEADER_SHA384)"
     */
    public String getOpcContentSha384() {
        return opcContentSha384;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return uploadPartBody;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UploadPartRequest, java.io.InputStream> {
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

        /**
         * The name of the object. Avoid entering confidential information. Example: {@code
         * test/object1.log}
         */
        private String objectName = null;

        /**
         * The name of the object. Avoid entering confidential information. Example: {@code
         * test/object1.log}
         *
         * @param objectName the value to set
         * @return this builder instance
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            return this;
        }

        /** The upload ID for a multipart upload. */
        private String uploadId = null;

        /**
         * The upload ID for a multipart upload.
         *
         * @param uploadId the value to set
         * @return this builder instance
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        /** The part number that identifies the object part currently being uploaded. */
        private Integer uploadPartNum = null;

        /**
         * The part number that identifies the object part currently being uploaded.
         *
         * @param uploadPartNum the value to set
         * @return this builder instance
         */
        public Builder uploadPartNum(Integer uploadPartNum) {
            this.uploadPartNum = uploadPartNum;
            return this;
        }

        /** The content length of the body. */
        private Long contentLength = null;

        /**
         * The content length of the body.
         *
         * @param contentLength the value to set
         * @return this builder instance
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /** The part being uploaded to the Object Storage service. */
        private java.io.InputStream uploadPartBody = null;

        /**
         * The part being uploaded to the Object Storage service.
         *
         * @param uploadPartBody the value to set
         * @return this builder instance
         */
        public Builder uploadPartBody(java.io.InputStream uploadPartBody) {
            this.uploadPartBody = uploadPartBody;
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

        /**
         * A value of {@code 100-continue} requests preliminary verification of the request method,
         * path, and headers before the request body is sent. If no error results from such
         * verification, the server will send a 100 (Continue) interim response to indicate
         * readiness for the request body. The only allowed value for this parameter is
         * "100-Continue" (case-insensitive).
         */
        private String expect = null;

        /**
         * A value of {@code 100-continue} requests preliminary verification of the request method,
         * path, and headers before the request body is sent. If no error results from such
         * verification, the server will send a 100 (Continue) interim response to indicate
         * readiness for the request body. The only allowed value for this parameter is
         * "100-Continue" (case-insensitive).
         *
         * @param expect the value to set
         * @return this builder instance
         */
        public Builder expect(String expect) {
            this.expect = expect;
            return this;
        }

        /**
         * The optional header that defines the base64-encoded MD5 hash of the body. If the optional
         * Content-MD5 header is present, Object Storage performs an integrity check on the body of
         * the HTTP request by computing the MD5 hash for the body and comparing it to the MD5 hash
         * supplied in the header. If the two hashes do not match, the object is rejected and an
         * HTTP-400 Unmatched Content MD5 error is returned with the message:
         *
         * <p>"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5
         * header (HEADER_MD5)"
         */
        private String contentMD5 = null;

        /**
         * The optional header that defines the base64-encoded MD5 hash of the body. If the optional
         * Content-MD5 header is present, Object Storage performs an integrity check on the body of
         * the HTTP request by computing the MD5 hash for the body and comparing it to the MD5 hash
         * supplied in the header. If the two hashes do not match, the object is rejected and an
         * HTTP-400 Unmatched Content MD5 error is returned with the message:
         *
         * <p>"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5
         * header (HEADER_MD5)"
         *
         * @param contentMD5 the value to set
         * @return this builder instance
         */
        public Builder contentMD5(String contentMD5) {
            this.contentMD5 = contentMD5;
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
         * Applicable only if CRC32C is specified in the opc-checksum-algorithm request header.
         *
         * <p>The optional header that defines the base64-encoded, 32-bit CRC32C (Castagnoli)
         * checksum of the body. If the optional opc-content-crc32c header is present, Object
         * Storage performs an integrity check on the body of the HTTP request by computing the
         * CRC32C checksum for the body and comparing it to the CRC32C checksum supplied in the
         * header. If the two checksums do not match, the object is rejected and an HTTP-400
         * Unmatched Content CRC32C error is returned with the message:
         *
         * <p>"The computed CRC32C of the request body (ACTUAL_CRC32C) does not match the
         * opc-content-crc32c header (HEADER_CRC32C)"
         */
        private String opcContentCrc32c = null;

        /**
         * Applicable only if CRC32C is specified in the opc-checksum-algorithm request header.
         *
         * <p>The optional header that defines the base64-encoded, 32-bit CRC32C (Castagnoli)
         * checksum of the body. If the optional opc-content-crc32c header is present, Object
         * Storage performs an integrity check on the body of the HTTP request by computing the
         * CRC32C checksum for the body and comparing it to the CRC32C checksum supplied in the
         * header. If the two checksums do not match, the object is rejected and an HTTP-400
         * Unmatched Content CRC32C error is returned with the message:
         *
         * <p>"The computed CRC32C of the request body (ACTUAL_CRC32C) does not match the
         * opc-content-crc32c header (HEADER_CRC32C)"
         *
         * @param opcContentCrc32c the value to set
         * @return this builder instance
         */
        public Builder opcContentCrc32c(String opcContentCrc32c) {
            this.opcContentCrc32c = opcContentCrc32c;
            return this;
        }

        /**
         * Applicable only if SHA256 is specified in the opc-checksum-algorithm request header.
         *
         * <p>The optional header that defines the base64-encoded SHA256 hash of the body. If the
         * optional opc-content-sha256 header is present, Object Storage performs an integrity check
         * on the body of the HTTP request by computing the SHA256 hash for the body and comparing
         * it to the SHA256 hash supplied in the header. If the two hashes do not match, the object
         * is rejected and an HTTP-400 Unmatched Content SHA256 error is returned with the message:
         *
         * <p>"The computed SHA256 of the request body (ACTUAL_SHA256) does not match the
         * opc-content-sha256 header (HEADER_SHA256)"
         */
        private String opcContentSha256 = null;

        /**
         * Applicable only if SHA256 is specified in the opc-checksum-algorithm request header.
         *
         * <p>The optional header that defines the base64-encoded SHA256 hash of the body. If the
         * optional opc-content-sha256 header is present, Object Storage performs an integrity check
         * on the body of the HTTP request by computing the SHA256 hash for the body and comparing
         * it to the SHA256 hash supplied in the header. If the two hashes do not match, the object
         * is rejected and an HTTP-400 Unmatched Content SHA256 error is returned with the message:
         *
         * <p>"The computed SHA256 of the request body (ACTUAL_SHA256) does not match the
         * opc-content-sha256 header (HEADER_SHA256)"
         *
         * @param opcContentSha256 the value to set
         * @return this builder instance
         */
        public Builder opcContentSha256(String opcContentSha256) {
            this.opcContentSha256 = opcContentSha256;
            return this;
        }

        /**
         * Applicable only if SHA384 is specified in the opc-checksum-algorithm request header.
         *
         * <p>The optional header that defines the base64-encoded SHA384 hash of the body. If the
         * optional opc-content-sha384 header is present, Object Storage performs an integrity check
         * on the body of the HTTP request by computing the SHA384 hash for the body and comparing
         * it to the SHA384 hash supplied in the header. If the two hashes do not match, the object
         * is rejected and an HTTP-400 Unmatched Content SHA384 error is returned with the message:
         *
         * <p>"The computed SHA384 of the request body (ACTUAL_SHA384) does not match the
         * opc-content-sha384 header (HEADER_SHA384)"
         */
        private String opcContentSha384 = null;

        /**
         * Applicable only if SHA384 is specified in the opc-checksum-algorithm request header.
         *
         * <p>The optional header that defines the base64-encoded SHA384 hash of the body. If the
         * optional opc-content-sha384 header is present, Object Storage performs an integrity check
         * on the body of the HTTP request by computing the SHA384 hash for the body and comparing
         * it to the SHA384 hash supplied in the header. If the two hashes do not match, the object
         * is rejected and an HTTP-400 Unmatched Content SHA384 error is returned with the message:
         *
         * <p>"The computed SHA384 of the request body (ACTUAL_SHA384) does not match the
         * opc-content-sha384 header (HEADER_SHA384)"
         *
         * @param opcContentSha384 the value to set
         * @return this builder instance
         */
        public Builder opcContentSha384(String opcContentSha384) {
            this.opcContentSha384 = opcContentSha384;
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
            opcChecksumAlgorithm(o.getOpcChecksumAlgorithm());
            opcContentCrc32c(o.getOpcContentCrc32c());
            opcContentSha256(o.getOpcContentSha256());
            opcContentSha384(o.getOpcContentSha384());
            opcSseCustomerAlgorithm(o.getOpcSseCustomerAlgorithm());
            opcSseCustomerKey(o.getOpcSseCustomerKey());
            opcSseCustomerKeySha256(o.getOpcSseCustomerKeySha256());
            opcSseKmsKeyId(o.getOpcSseKmsKeyId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UploadPartRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UploadPartRequest
         */
        public UploadPartRequest build() {
            UploadPartRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            uploadPartBody(body);
            return this;
        }

        /**
         * Build the instance of UploadPartRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UploadPartRequest
         */
        public UploadPartRequest buildWithoutInvocationCallback() {
            UploadPartRequest request = new UploadPartRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.objectName = objectName;
            request.uploadId = uploadId;
            request.uploadPartNum = uploadPartNum;
            request.contentLength = contentLength;
            request.uploadPartBody = uploadPartBody;
            request.opcClientRequestId = opcClientRequestId;
            request.ifMatch = ifMatch;
            request.ifNoneMatch = ifNoneMatch;
            request.expect = expect;
            request.contentMD5 = contentMD5;
            request.opcChecksumAlgorithm = opcChecksumAlgorithm;
            request.opcContentCrc32c = opcContentCrc32c;
            request.opcContentSha256 = opcContentSha256;
            request.opcContentSha384 = opcContentSha384;
            request.opcSseCustomerAlgorithm = opcSseCustomerAlgorithm;
            request.opcSseCustomerKey = opcSseCustomerKey;
            request.opcSseCustomerKeySha256 = opcSseCustomerKeySha256;
            request.opcSseKmsKeyId = opcSseKmsKeyId;
            return request;
            // new UploadPartRequest(namespaceName, bucketName, objectName, uploadId, uploadPartNum,
            // contentLength, uploadPartBody, opcClientRequestId, ifMatch, ifNoneMatch, expect,
            // contentMD5, opcChecksumAlgorithm, opcContentCrc32c, opcContentSha256,
            // opcContentSha384, opcSseCustomerAlgorithm, opcSseCustomerKey,
            // opcSseCustomerKeySha256, opcSseKmsKeyId);
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
                .objectName(objectName)
                .uploadId(uploadId)
                .uploadPartNum(uploadPartNum)
                .contentLength(contentLength)
                .uploadPartBody(uploadPartBody)
                .opcClientRequestId(opcClientRequestId)
                .ifMatch(ifMatch)
                .ifNoneMatch(ifNoneMatch)
                .expect(expect)
                .contentMD5(contentMD5)
                .opcChecksumAlgorithm(opcChecksumAlgorithm)
                .opcContentCrc32c(opcContentCrc32c)
                .opcContentSha256(opcContentSha256)
                .opcContentSha384(opcContentSha384)
                .opcSseCustomerAlgorithm(opcSseCustomerAlgorithm)
                .opcSseCustomerKey(opcSseCustomerKey)
                .opcSseCustomerKeySha256(opcSseCustomerKeySha256)
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
        sb.append(",objectName=").append(String.valueOf(this.objectName));
        sb.append(",uploadId=").append(String.valueOf(this.uploadId));
        sb.append(",uploadPartNum=").append(String.valueOf(this.uploadPartNum));
        sb.append(",contentLength=").append(String.valueOf(this.contentLength));
        sb.append(",uploadPartBody=").append(String.valueOf(this.uploadPartBody));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(",expect=").append(String.valueOf(this.expect));
        sb.append(",contentMD5=").append(String.valueOf(this.contentMD5));
        sb.append(",opcChecksumAlgorithm=").append(String.valueOf(this.opcChecksumAlgorithm));
        sb.append(",opcContentCrc32c=").append(String.valueOf(this.opcContentCrc32c));
        sb.append(",opcContentSha256=").append(String.valueOf(this.opcContentSha256));
        sb.append(",opcContentSha384=").append(String.valueOf(this.opcContentSha384));
        sb.append(",opcSseCustomerAlgorithm=").append(String.valueOf(this.opcSseCustomerAlgorithm));
        sb.append(",opcSseCustomerKey=").append(String.valueOf(this.opcSseCustomerKey));
        sb.append(",opcSseCustomerKeySha256=").append(String.valueOf(this.opcSseCustomerKeySha256));
        sb.append(",opcSseKmsKeyId=").append(String.valueOf(this.opcSseKmsKeyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadPartRequest)) {
            return false;
        }

        UploadPartRequest other = (UploadPartRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.uploadId, other.uploadId)
                && java.util.Objects.equals(this.uploadPartNum, other.uploadPartNum)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(this.uploadPartBody, other.uploadPartBody)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
                && java.util.Objects.equals(this.expect, other.expect)
                && java.util.Objects.equals(this.contentMD5, other.contentMD5)
                && java.util.Objects.equals(this.opcChecksumAlgorithm, other.opcChecksumAlgorithm)
                && java.util.Objects.equals(this.opcContentCrc32c, other.opcContentCrc32c)
                && java.util.Objects.equals(this.opcContentSha256, other.opcContentSha256)
                && java.util.Objects.equals(this.opcContentSha384, other.opcContentSha384)
                && java.util.Objects.equals(
                        this.opcSseCustomerAlgorithm, other.opcSseCustomerAlgorithm)
                && java.util.Objects.equals(this.opcSseCustomerKey, other.opcSseCustomerKey)
                && java.util.Objects.equals(
                        this.opcSseCustomerKeySha256, other.opcSseCustomerKeySha256)
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
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.uploadId == null ? 43 : this.uploadId.hashCode());
        result =
                (result * PRIME)
                        + (this.uploadPartNum == null ? 43 : this.uploadPartNum.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result =
                (result * PRIME)
                        + (this.uploadPartBody == null ? 43 : this.uploadPartBody.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        result = (result * PRIME) + (this.expect == null ? 43 : this.expect.hashCode());
        result = (result * PRIME) + (this.contentMD5 == null ? 43 : this.contentMD5.hashCode());
        result =
                (result * PRIME)
                        + (this.opcChecksumAlgorithm == null
                                ? 43
                                : this.opcChecksumAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.opcContentCrc32c == null ? 43 : this.opcContentCrc32c.hashCode());
        result =
                (result * PRIME)
                        + (this.opcContentSha256 == null ? 43 : this.opcContentSha256.hashCode());
        result =
                (result * PRIME)
                        + (this.opcContentSha384 == null ? 43 : this.opcContentSha384.hashCode());
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
        return result;
    }
}
