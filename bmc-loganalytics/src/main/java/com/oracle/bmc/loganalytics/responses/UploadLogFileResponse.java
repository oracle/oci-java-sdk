/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UploadLogFileResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific
     * request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific
     * request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The base-64 encoded MD5 hash of the request body as computed by the server. */
    private String opcContentMd5;

    /**
     * The base-64 encoded MD5 hash of the request body as computed by the server.
     *
     * @return the value
     */
    public String getOpcContentMd5() {
        return opcContentMd5;
    }

    /** Unique Oracle-assigned identifier for log data. */
    private String opcObjectId;

    /**
     * Unique Oracle-assigned identifier for log data.
     *
     * @return the value
     */
    public String getOpcObjectId() {
        return opcObjectId;
    }

    /** The returned {@code Upload} instance. */
    private com.oracle.bmc.loganalytics.model.Upload upload;

    /**
     * The returned {@code Upload} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.Upload getUpload() {
        return upload;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcContentMd5",
        "opcObjectId",
        "upload"
    })
    private UploadLogFileResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcContentMd5,
            String opcObjectId,
            com.oracle.bmc.loganalytics.model.Upload upload) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcContentMd5 = opcContentMd5;
        this.opcObjectId = opcObjectId;
        this.upload = upload;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<UploadLogFileResponse> {
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
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a
         * specific request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a
         * specific request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The base-64 encoded MD5 hash of the request body as computed by the server. */
        private String opcContentMd5;

        /**
         * The base-64 encoded MD5 hash of the request body as computed by the server.
         *
         * @param opcContentMd5 the value to set
         * @return this builder
         */
        public Builder opcContentMd5(String opcContentMd5) {
            this.opcContentMd5 = opcContentMd5;
            return this;
        }

        /** Unique Oracle-assigned identifier for log data. */
        private String opcObjectId;

        /**
         * Unique Oracle-assigned identifier for log data.
         *
         * @param opcObjectId the value to set
         * @return this builder
         */
        public Builder opcObjectId(String opcObjectId) {
            this.opcObjectId = opcObjectId;
            return this;
        }

        /** The returned {@code Upload} instance. */
        private com.oracle.bmc.loganalytics.model.Upload upload;

        /**
         * The returned {@code Upload} instance.
         *
         * @param upload the value to set
         * @return this builder
         */
        public Builder upload(com.oracle.bmc.loganalytics.model.Upload upload) {
            this.upload = upload;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(UploadLogFileResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcContentMd5(o.getOpcContentMd5());
            opcObjectId(o.getOpcObjectId());
            upload(o.getUpload());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public UploadLogFileResponse build() {
            return new UploadLogFileResponse(
                    __httpStatusCode__, headers, opcRequestId, opcContentMd5, opcObjectId, upload);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcContentMd5=").append(String.valueOf(opcContentMd5));
        sb.append(",opcObjectId=").append(String.valueOf(opcObjectId));
        sb.append(",upload=").append(String.valueOf(upload));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadLogFileResponse)) {
            return false;
        }

        UploadLogFileResponse other = (UploadLogFileResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcContentMd5, other.opcContentMd5)
                && java.util.Objects.equals(this.opcObjectId, other.opcObjectId)
                && java.util.Objects.equals(this.upload, other.upload);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcContentMd5 == null ? 43 : this.opcContentMd5.hashCode());
        result = (result * PRIME) + (this.opcObjectId == null ? 43 : this.opcObjectId.hashCode());
        result = (result * PRIME) + (this.upload == null ? 43 : this.upload.hashCode());
        return result;
    }
}
