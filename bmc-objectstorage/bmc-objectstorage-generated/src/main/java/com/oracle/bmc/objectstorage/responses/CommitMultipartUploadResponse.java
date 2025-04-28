/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CommitMultipartUploadResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when
     * debugging.
     */
    private String opcClientRequestId;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when
     * debugging.
     *
     * @return the value
     */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide this request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide this request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Base-64 representation of the multipart object MD5 hash. The multipart object hash is
     * calculated by taking the MD5 hashes of the parts passed to this call, concatenating the
     * binary representation of those hashes in order of their part numbers, and then calculating
     * the MD5 hash of the concatenated values. The multipart object hash is followed by a hyphen
     * and the total number of parts (for example, '-6').
     */
    private String opcMultipartMd5;

    /**
     * Base-64 representation of the multipart object MD5 hash. The multipart object hash is
     * calculated by taking the MD5 hashes of the parts passed to this call, concatenating the
     * binary representation of those hashes in order of their part numbers, and then calculating
     * the MD5 hash of the concatenated values. The multipart object hash is followed by a hyphen
     * and the total number of parts (for example, '-6').
     *
     * @return the value
     */
    public String getOpcMultipartMd5() {
        return opcMultipartMd5;
    }

    /**
     * The base64-encoded, 32-bit CRC32C (Castagnoli) checksum of the object. Even for objects
     * uploaded using multipart upload, this header returns the CRC32C (Castagnoli) checksum of the
     * complete reconstructed object.
     */
    private String opcContentCrc32c;

    /**
     * The base64-encoded, 32-bit CRC32C (Castagnoli) checksum of the object. Even for objects
     * uploaded using multipart upload, this header returns the CRC32C (Castagnoli) checksum of the
     * complete reconstructed object.
     *
     * @return the value
     */
    public String getOpcContentCrc32c() {
        return opcContentCrc32c;
    }

    /**
     * Base-64 representation of the multipart object SHA256 hash. The multipart object hash is
     * calculated by taking the SHA256 hashes of the parts passed to this call, concatenating the
     * binary representation of those hashes in order of their part numbers, and then calculating
     * the SHA256 hash of the concatenated values. The multipart object hash is followed by a hyphen
     * and the total number of parts (for example, '-6').
     */
    private String opcMultipartSha256;

    /**
     * Base-64 representation of the multipart object SHA256 hash. The multipart object hash is
     * calculated by taking the SHA256 hashes of the parts passed to this call, concatenating the
     * binary representation of those hashes in order of their part numbers, and then calculating
     * the SHA256 hash of the concatenated values. The multipart object hash is followed by a hyphen
     * and the total number of parts (for example, '-6').
     *
     * @return the value
     */
    public String getOpcMultipartSha256() {
        return opcMultipartSha256;
    }

    /**
     * Base-64 representation of the multipart object SHA384 hash. The multipart object hash is
     * calculated by taking the SHA384 hashes of the parts passed to this call, concatenating the
     * binary representation of those hashes in order of their part numbers, and then calculating
     * the SHA384 hash of the concatenated values. The multipart object hash is followed by a hyphen
     * and the total number of parts (for example, '-6').
     */
    private String opcMultipartSha384;

    /**
     * Base-64 representation of the multipart object SHA384 hash. The multipart object hash is
     * calculated by taking the SHA384 hashes of the parts passed to this call, concatenating the
     * binary representation of those hashes in order of their part numbers, and then calculating
     * the SHA384 hash of the concatenated values. The multipart object hash is followed by a hyphen
     * and the total number of parts (for example, '-6').
     *
     * @return the value
     */
    public String getOpcMultipartSha384() {
        return opcMultipartSha384;
    }

    /** The entity tag (ETag) for the object. */
    private String eTag;

    /**
     * The entity tag (ETag) for the object.
     *
     * @return the value
     */
    public String getETag() {
        return eTag;
    }

    /**
     * The time the object was last modified, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     */
    private java.util.Date lastModified;

    /**
     * The time the object was last modified, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     *
     * @return the value
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /** VersionId of the newly created object */
    private String versionId;

    /**
     * VersionId of the newly created object
     *
     * @return the value
     */
    public String getVersionId() {
        return versionId;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcClientRequestId",
        "opcRequestId",
        "opcMultipartMd5",
        "opcContentCrc32c",
        "opcMultipartSha256",
        "opcMultipartSha384",
        "eTag",
        "lastModified",
        "versionId"
    })
    private CommitMultipartUploadResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcClientRequestId,
            String opcRequestId,
            String opcMultipartMd5,
            String opcContentCrc32c,
            String opcMultipartSha256,
            String opcMultipartSha384,
            String eTag,
            java.util.Date lastModified,
            String versionId) {
        super(__httpStatusCode__, headers);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.opcMultipartMd5 = opcMultipartMd5;
        this.opcContentCrc32c = opcContentCrc32c;
        this.opcMultipartSha256 = opcMultipartSha256;
        this.opcMultipartSha384 = opcMultipartSha384;
        this.eTag = eTag;
        this.lastModified = lastModified;
        this.versionId = versionId;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<CommitMultipartUploadResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when
         * debugging.
         */
        private String opcClientRequestId;

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when
         * debugging.
         *
         * @param opcClientRequestId the value to set
         * @return this builder
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide this request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide this request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Base-64 representation of the multipart object MD5 hash. The multipart object hash is
         * calculated by taking the MD5 hashes of the parts passed to this call, concatenating the
         * binary representation of those hashes in order of their part numbers, and then
         * calculating the MD5 hash of the concatenated values. The multipart object hash is
         * followed by a hyphen and the total number of parts (for example, '-6').
         */
        private String opcMultipartMd5;

        /**
         * Base-64 representation of the multipart object MD5 hash. The multipart object hash is
         * calculated by taking the MD5 hashes of the parts passed to this call, concatenating the
         * binary representation of those hashes in order of their part numbers, and then
         * calculating the MD5 hash of the concatenated values. The multipart object hash is
         * followed by a hyphen and the total number of parts (for example, '-6').
         *
         * @param opcMultipartMd5 the value to set
         * @return this builder
         */
        public Builder opcMultipartMd5(String opcMultipartMd5) {
            this.opcMultipartMd5 = opcMultipartMd5;
            return this;
        }

        /**
         * The base64-encoded, 32-bit CRC32C (Castagnoli) checksum of the object. Even for objects
         * uploaded using multipart upload, this header returns the CRC32C (Castagnoli) checksum of
         * the complete reconstructed object.
         */
        private String opcContentCrc32c;

        /**
         * The base64-encoded, 32-bit CRC32C (Castagnoli) checksum of the object. Even for objects
         * uploaded using multipart upload, this header returns the CRC32C (Castagnoli) checksum of
         * the complete reconstructed object.
         *
         * @param opcContentCrc32c the value to set
         * @return this builder
         */
        public Builder opcContentCrc32c(String opcContentCrc32c) {
            this.opcContentCrc32c = opcContentCrc32c;
            return this;
        }

        /**
         * Base-64 representation of the multipart object SHA256 hash. The multipart object hash is
         * calculated by taking the SHA256 hashes of the parts passed to this call, concatenating
         * the binary representation of those hashes in order of their part numbers, and then
         * calculating the SHA256 hash of the concatenated values. The multipart object hash is
         * followed by a hyphen and the total number of parts (for example, '-6').
         */
        private String opcMultipartSha256;

        /**
         * Base-64 representation of the multipart object SHA256 hash. The multipart object hash is
         * calculated by taking the SHA256 hashes of the parts passed to this call, concatenating
         * the binary representation of those hashes in order of their part numbers, and then
         * calculating the SHA256 hash of the concatenated values. The multipart object hash is
         * followed by a hyphen and the total number of parts (for example, '-6').
         *
         * @param opcMultipartSha256 the value to set
         * @return this builder
         */
        public Builder opcMultipartSha256(String opcMultipartSha256) {
            this.opcMultipartSha256 = opcMultipartSha256;
            return this;
        }

        /**
         * Base-64 representation of the multipart object SHA384 hash. The multipart object hash is
         * calculated by taking the SHA384 hashes of the parts passed to this call, concatenating
         * the binary representation of those hashes in order of their part numbers, and then
         * calculating the SHA384 hash of the concatenated values. The multipart object hash is
         * followed by a hyphen and the total number of parts (for example, '-6').
         */
        private String opcMultipartSha384;

        /**
         * Base-64 representation of the multipart object SHA384 hash. The multipart object hash is
         * calculated by taking the SHA384 hashes of the parts passed to this call, concatenating
         * the binary representation of those hashes in order of their part numbers, and then
         * calculating the SHA384 hash of the concatenated values. The multipart object hash is
         * followed by a hyphen and the total number of parts (for example, '-6').
         *
         * @param opcMultipartSha384 the value to set
         * @return this builder
         */
        public Builder opcMultipartSha384(String opcMultipartSha384) {
            this.opcMultipartSha384 = opcMultipartSha384;
            return this;
        }

        /** The entity tag (ETag) for the object. */
        private String eTag;

        /**
         * The entity tag (ETag) for the object.
         *
         * @param eTag the value to set
         * @return this builder
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /**
         * The time the object was last modified, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         */
        private java.util.Date lastModified;

        /**
         * The time the object was last modified, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         *
         * @param lastModified the value to set
         * @return this builder
         */
        public Builder lastModified(java.util.Date lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /** VersionId of the newly created object */
        private String versionId;

        /**
         * VersionId of the newly created object
         *
         * @param versionId the value to set
         * @return this builder
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CommitMultipartUploadResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            opcMultipartMd5(o.getOpcMultipartMd5());
            opcContentCrc32c(o.getOpcContentCrc32c());
            opcMultipartSha256(o.getOpcMultipartSha256());
            opcMultipartSha384(o.getOpcMultipartSha384());
            eTag(o.getETag());
            lastModified(o.getLastModified());
            versionId(o.getVersionId());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CommitMultipartUploadResponse build() {
            return new CommitMultipartUploadResponse(
                    __httpStatusCode__,
                    headers,
                    opcClientRequestId,
                    opcRequestId,
                    opcMultipartMd5,
                    opcContentCrc32c,
                    opcMultipartSha256,
                    opcMultipartSha384,
                    eTag,
                    lastModified,
                    versionId);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcClientRequestId=").append(String.valueOf(opcClientRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcMultipartMd5=").append(String.valueOf(opcMultipartMd5));
        sb.append(",opcContentCrc32c=").append(String.valueOf(opcContentCrc32c));
        sb.append(",opcMultipartSha256=").append(String.valueOf(opcMultipartSha256));
        sb.append(",opcMultipartSha384=").append(String.valueOf(opcMultipartSha384));
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",lastModified=").append(String.valueOf(lastModified));
        sb.append(",versionId=").append(String.valueOf(versionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommitMultipartUploadResponse)) {
            return false;
        }

        CommitMultipartUploadResponse other = (CommitMultipartUploadResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcMultipartMd5, other.opcMultipartMd5)
                && java.util.Objects.equals(this.opcContentCrc32c, other.opcContentCrc32c)
                && java.util.Objects.equals(this.opcMultipartSha256, other.opcMultipartSha256)
                && java.util.Objects.equals(this.opcMultipartSha384, other.opcMultipartSha384)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(this.lastModified, other.lastModified)
                && java.util.Objects.equals(this.versionId, other.versionId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcMultipartMd5 == null ? 43 : this.opcMultipartMd5.hashCode());
        result =
                (result * PRIME)
                        + (this.opcContentCrc32c == null ? 43 : this.opcContentCrc32c.hashCode());
        result =
                (result * PRIME)
                        + (this.opcMultipartSha256 == null
                                ? 43
                                : this.opcMultipartSha256.hashCode());
        result =
                (result * PRIME)
                        + (this.opcMultipartSha384 == null
                                ? 43
                                : this.opcMultipartSha384.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result = (result * PRIME) + (this.lastModified == null ? 43 : this.lastModified.hashCode());
        result = (result * PRIME) + (this.versionId == null ? 43 : this.versionId.hashCode());
        return result;
    }
}
