/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class CreateOdaPrivateEndpointAttachmentResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /** Fully qualified URL for the newly created resource. */
    private String location;

    /**
     * Fully qualified URL for the newly created resource.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency
     * control.
     */
    private String etag;

    /**
     * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency
     * control.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query
     * status of the operation.
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query
     * status of the operation.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /** The returned OdaPrivateEndpointAttachment instance. */
    private com.oracle.bmc.oda.model.OdaPrivateEndpointAttachment odaPrivateEndpointAttachment;

    /**
     * The returned OdaPrivateEndpointAttachment instance.
     *
     * @return the value
     */
    public com.oracle.bmc.oda.model.OdaPrivateEndpointAttachment getOdaPrivateEndpointAttachment() {
        return odaPrivateEndpointAttachment;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "location",
        "etag",
        "opcRequestId",
        "opcWorkRequestId",
        "odaPrivateEndpointAttachment"
    })
    private CreateOdaPrivateEndpointAttachmentResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String location,
            String etag,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.oda.model.OdaPrivateEndpointAttachment odaPrivateEndpointAttachment) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.odaPrivateEndpointAttachment = odaPrivateEndpointAttachment;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateOdaPrivateEndpointAttachmentResponse> {
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

        /** Fully qualified URL for the newly created resource. */
        private String location;

        /**
         * Fully qualified URL for the newly created resource.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency
         * control.
         */
        private String etag;

        /**
         * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency
         * control.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query
         * status of the operation.
         */
        private String opcWorkRequestId;

        /**
         * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query
         * status of the operation.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /** The returned OdaPrivateEndpointAttachment instance. */
        private com.oracle.bmc.oda.model.OdaPrivateEndpointAttachment odaPrivateEndpointAttachment;

        /**
         * The returned OdaPrivateEndpointAttachment instance.
         *
         * @param odaPrivateEndpointAttachment the value to set
         * @return this builder
         */
        public Builder odaPrivateEndpointAttachment(
                com.oracle.bmc.oda.model.OdaPrivateEndpointAttachment
                        odaPrivateEndpointAttachment) {
            this.odaPrivateEndpointAttachment = odaPrivateEndpointAttachment;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateOdaPrivateEndpointAttachmentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            odaPrivateEndpointAttachment(o.getOdaPrivateEndpointAttachment());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateOdaPrivateEndpointAttachmentResponse build() {
            return new CreateOdaPrivateEndpointAttachmentResponse(
                    __httpStatusCode__,
                    headers,
                    location,
                    etag,
                    opcRequestId,
                    opcWorkRequestId,
                    odaPrivateEndpointAttachment);
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
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",odaPrivateEndpointAttachment=")
                .append(String.valueOf(odaPrivateEndpointAttachment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOdaPrivateEndpointAttachmentResponse)) {
            return false;
        }

        CreateOdaPrivateEndpointAttachmentResponse other =
                (CreateOdaPrivateEndpointAttachmentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(
                        this.odaPrivateEndpointAttachment, other.odaPrivateEndpointAttachment);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.odaPrivateEndpointAttachment == null
                                ? 43
                                : this.odaPrivateEndpointAttachment.hashCode());
        return result;
    }
}
