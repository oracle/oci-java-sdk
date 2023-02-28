/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class DeleteObjectResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The time the object was deleted, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     */
    private java.util.Date lastModified;

    /**
     * The time the object was deleted, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     *
     * @return the value
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * The {@code versionId} of the delete marker created as a result of the DELETE Object. If the
     * request contains a specific {@code versionId}, then this response header will be the same as
     * the requested {@code versionId} of the object that was deleted.
     */
    private String versionId;

    /**
     * The {@code versionId} of the delete marker created as a result of the DELETE Object. If the
     * request contains a specific {@code versionId}, then this response header will be the same as
     * the requested {@code versionId} of the object that was deleted.
     *
     * @return the value
     */
    public String getVersionId() {
        return versionId;
    }

    /** This is {@code true} if the deleted object is a delete marker, otherwise {@code false} */
    private Boolean isDeleteMarker;

    /**
     * This is {@code true} if the deleted object is a delete marker, otherwise {@code false}
     *
     * @return the value
     */
    public Boolean getIsDeleteMarker() {
        return isDeleteMarker;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcClientRequestId",
        "opcRequestId",
        "lastModified",
        "versionId",
        "isDeleteMarker"
    })
    private DeleteObjectResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcClientRequestId,
            String opcRequestId,
            java.util.Date lastModified,
            String versionId,
            Boolean isDeleteMarker) {
        super(__httpStatusCode__, headers);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.lastModified = lastModified;
        this.versionId = versionId;
        this.isDeleteMarker = isDeleteMarker;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<DeleteObjectResponse> {
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
         * The time the object was deleted, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         */
        private java.util.Date lastModified;

        /**
         * The time the object was deleted, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         *
         * @param lastModified the value to set
         * @return this builder
         */
        public Builder lastModified(java.util.Date lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * The {@code versionId} of the delete marker created as a result of the DELETE Object. If
         * the request contains a specific {@code versionId}, then this response header will be the
         * same as the requested {@code versionId} of the object that was deleted.
         */
        private String versionId;

        /**
         * The {@code versionId} of the delete marker created as a result of the DELETE Object. If
         * the request contains a specific {@code versionId}, then this response header will be the
         * same as the requested {@code versionId} of the object that was deleted.
         *
         * @param versionId the value to set
         * @return this builder
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * This is {@code true} if the deleted object is a delete marker, otherwise {@code false}
         */
        private Boolean isDeleteMarker;

        /**
         * This is {@code true} if the deleted object is a delete marker, otherwise {@code false}
         *
         * @param isDeleteMarker the value to set
         * @return this builder
         */
        public Builder isDeleteMarker(Boolean isDeleteMarker) {
            this.isDeleteMarker = isDeleteMarker;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(DeleteObjectResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            lastModified(o.getLastModified());
            versionId(o.getVersionId());
            isDeleteMarker(o.getIsDeleteMarker());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public DeleteObjectResponse build() {
            return new DeleteObjectResponse(
                    __httpStatusCode__,
                    headers,
                    opcClientRequestId,
                    opcRequestId,
                    lastModified,
                    versionId,
                    isDeleteMarker);
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
        sb.append(",lastModified=").append(String.valueOf(lastModified));
        sb.append(",versionId=").append(String.valueOf(versionId));
        sb.append(",isDeleteMarker=").append(String.valueOf(isDeleteMarker));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteObjectResponse)) {
            return false;
        }

        DeleteObjectResponse other = (DeleteObjectResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.lastModified, other.lastModified)
                && java.util.Objects.equals(this.versionId, other.versionId)
                && java.util.Objects.equals(this.isDeleteMarker, other.isDeleteMarker);
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
        result = (result * PRIME) + (this.lastModified == null ? 43 : this.lastModified.hashCode());
        result = (result * PRIME) + (this.versionId == null ? 43 : this.versionId.hashCode());
        result =
                (result * PRIME)
                        + (this.isDeleteMarker == null ? 43 : this.isDeleteMarker.hashCode());
        return result;
    }
}
