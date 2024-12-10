/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class PutObjectResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     * @return the value
     */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The base64-encoded MD5 hash of the request body as computed by the server.
     */
    private String opcContentMd5;

    /**
     * The base64-encoded MD5 hash of the request body as computed by the server.
     * @return the value
     */
    public String getOpcContentMd5() {
        return opcContentMd5;
    }

    /**
     * The base64-encoded, 32-bit CRC32C (Castagnoli) checksum of the request body as computed by the server. Applicable only if CRC32C was specified in opc-checksum-algorithm request header during upload.
     */
    private String opcContentCrc32c;

    /**
     * The base64-encoded, 32-bit CRC32C (Castagnoli) checksum of the request body as computed by the server. Applicable only if CRC32C was specified in opc-checksum-algorithm request header during upload.
     * @return the value
     */
    public String getOpcContentCrc32c() {
        return opcContentCrc32c;
    }

    /**
     * The base64-encoded SHA256 hash of the request body as computed by the server. Applicable only if SHA256 was specified in opc-checksum-algorithm request header during upload.
     */
    private String opcContentSha256;

    /**
     * The base64-encoded SHA256 hash of the request body as computed by the server. Applicable only if SHA256 was specified in opc-checksum-algorithm request header during upload.
     * @return the value
     */
    public String getOpcContentSha256() {
        return opcContentSha256;
    }

    /**
     * The base64-encoded SHA384 hash of the request body as computed by the server. Applicable only if SHA384 was specified in opc-checksum-algorithm request header during upload.
     */
    private String opcContentSha384;

    /**
     * The base64-encoded SHA384 hash of the request body as computed by the server. Applicable only if SHA384 was specified in opc-checksum-algorithm request header during upload.
     * @return the value
     */
    public String getOpcContentSha384() {
        return opcContentSha384;
    }

    /**
     * The entity tag (ETag) for the object.
     */
    private String eTag;

    /**
     * The entity tag (ETag) for the object.
     * @return the value
     */
    public String getETag() {
        return eTag;
    }

    /**
     * The time the object was modified, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     */
    private java.util.Date lastModified;

    /**
     * The time the object was modified, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     * @return the value
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * VersionId of the newly created object
     */
    private String versionId;

    /**
     * VersionId of the newly created object
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
        "opcContentMd5",
        "opcContentCrc32c",
        "opcContentSha256",
        "opcContentSha384",
        "eTag",
        "lastModified",
        "versionId"
    })
    private PutObjectResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcClientRequestId,
            String opcRequestId,
            String opcContentMd5,
            String opcContentCrc32c,
            String opcContentSha256,
            String opcContentSha384,
            String eTag,
            java.util.Date lastModified,
            String versionId) {
        super(__httpStatusCode__, headers);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.opcContentMd5 = opcContentMd5;
        this.opcContentCrc32c = opcContentCrc32c;
        this.opcContentSha256 = opcContentSha256;
        this.opcContentSha384 = opcContentSha384;
        this.eTag = eTag;
        this.lastModified = lastModified;
        this.versionId = versionId;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
         */
        private String opcClientRequestId;

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
         * @param opcClientRequestId the value to set
         * @return this builder
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
         * request, provide this request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
         * request, provide this request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The base64-encoded MD5 hash of the request body as computed by the server.
         */
        private String opcContentMd5;

        /**
         * The base64-encoded MD5 hash of the request body as computed by the server.
         * @param opcContentMd5 the value to set
         * @return this builder
         */
        public Builder opcContentMd5(String opcContentMd5) {
            this.opcContentMd5 = opcContentMd5;
            return this;
        }

        /**
         * The base64-encoded, 32-bit CRC32C (Castagnoli) checksum of the request body as computed by the server. Applicable only if CRC32C was specified in opc-checksum-algorithm request header during upload.
         */
        private String opcContentCrc32c;

        /**
         * The base64-encoded, 32-bit CRC32C (Castagnoli) checksum of the request body as computed by the server. Applicable only if CRC32C was specified in opc-checksum-algorithm request header during upload.
         * @param opcContentCrc32c the value to set
         * @return this builder
         */
        public Builder opcContentCrc32c(String opcContentCrc32c) {
            this.opcContentCrc32c = opcContentCrc32c;
            return this;
        }

        /**
         * The base64-encoded SHA256 hash of the request body as computed by the server. Applicable only if SHA256 was specified in opc-checksum-algorithm request header during upload.
         */
        private String opcContentSha256;

        /**
         * The base64-encoded SHA256 hash of the request body as computed by the server. Applicable only if SHA256 was specified in opc-checksum-algorithm request header during upload.
         * @param opcContentSha256 the value to set
         * @return this builder
         */
        public Builder opcContentSha256(String opcContentSha256) {
            this.opcContentSha256 = opcContentSha256;
            return this;
        }

        /**
         * The base64-encoded SHA384 hash of the request body as computed by the server. Applicable only if SHA384 was specified in opc-checksum-algorithm request header during upload.
         */
        private String opcContentSha384;

        /**
         * The base64-encoded SHA384 hash of the request body as computed by the server. Applicable only if SHA384 was specified in opc-checksum-algorithm request header during upload.
         * @param opcContentSha384 the value to set
         * @return this builder
         */
        public Builder opcContentSha384(String opcContentSha384) {
            this.opcContentSha384 = opcContentSha384;
            return this;
        }

        /**
         * The entity tag (ETag) for the object.
         */
        private String eTag;

        /**
         * The entity tag (ETag) for the object.
         * @param eTag the value to set
         * @return this builder
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /**
         * The time the object was modified, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         */
        private java.util.Date lastModified;

        /**
         * The time the object was modified, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         * @param lastModified the value to set
         * @return this builder
         */
        public Builder lastModified(java.util.Date lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * VersionId of the newly created object
         */
        private String versionId;

        /**
         * VersionId of the newly created object
         * @param versionId the value to set
         * @return this builder
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(PutObjectResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            opcContentMd5(o.getOpcContentMd5());
            opcContentCrc32c(o.getOpcContentCrc32c());
            opcContentSha256(o.getOpcContentSha256());
            opcContentSha384(o.getOpcContentSha384());
            eTag(o.getETag());
            lastModified(o.getLastModified());
            versionId(o.getVersionId());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public PutObjectResponse build() {
            return new PutObjectResponse(
                    __httpStatusCode__,
                    headers,
                    opcClientRequestId,
                    opcRequestId,
                    opcContentMd5,
                    opcContentCrc32c,
                    opcContentSha256,
                    opcContentSha384,
                    eTag,
                    lastModified,
                    versionId);
        }
    }

    /**
     * Return a new builder for this response object.
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
        sb.append(",opcContentMd5=").append(String.valueOf(opcContentMd5));
        sb.append(",opcContentCrc32c=").append(String.valueOf(opcContentCrc32c));
        sb.append(",opcContentSha256=").append(String.valueOf(opcContentSha256));
        sb.append(",opcContentSha384=").append(String.valueOf(opcContentSha384));
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
        if (!(o instanceof PutObjectResponse)) {
            return false;
        }

        PutObjectResponse other = (PutObjectResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcContentMd5, other.opcContentMd5)
                && java.util.Objects.equals(this.opcContentCrc32c, other.opcContentCrc32c)
                && java.util.Objects.equals(this.opcContentSha256, other.opcContentSha256)
                && java.util.Objects.equals(this.opcContentSha384, other.opcContentSha384)
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
                        + (this.opcContentMd5 == null ? 43 : this.opcContentMd5.hashCode());
        result =
                (result * PRIME)
                        + (this.opcContentCrc32c == null ? 43 : this.opcContentCrc32c.hashCode());
        result =
                (result * PRIME)
                        + (this.opcContentSha256 == null ? 43 : this.opcContentSha256.hashCode());
        result =
                (result * PRIME)
                        + (this.opcContentSha384 == null ? 43 : this.opcContentSha384.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result = (result * PRIME) + (this.lastModified == null ? 43 : this.lastModified.hashCode());
        result = (result * PRIME) + (this.versionId == null ? 43 : this.versionId.hashCode());
        return result;
    }
}
