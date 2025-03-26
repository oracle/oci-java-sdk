/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.responses;

import com.oracle.bmc.aidocument.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
public class CreateModelResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The full URI of the resource related to the request
     *
     */
    private String contentLocation;

    /**
     * The full URI of the resource related to the request
     *
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /**
     * The full URI of the resource related to the request
     *
     */
    private String location;

    /**
     * The full URI of the resource related to the request
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * A unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * A unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The returned Model instance.
     */
    private com.oracle.bmc.aidocument.model.Model model;

    /**
     * The returned Model instance.
     * @return the value
     */
    public com.oracle.bmc.aidocument.model.Model getModel() {
        return model;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "contentLocation",
        "location",
        "opcWorkRequestId",
        "opcRequestId",
        "etag",
        "model"
    })
    private CreateModelResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String contentLocation,
            String location,
            String opcWorkRequestId,
            String opcRequestId,
            String etag,
            com.oracle.bmc.aidocument.model.Model model) {
        super(__httpStatusCode__, headers);
        this.contentLocation = contentLocation;
        this.location = location;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.model = model;
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
         * The full URI of the resource related to the request
         *
         */
        private String contentLocation;

        /**
         * The full URI of the resource related to the request
         *
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
            return this;
        }

        /**
         * The full URI of the resource related to the request
         *
         */
        private String location;

        /**
         * The full URI of the resource related to the request
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * A unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
         *
         */
        private String opcWorkRequestId;

        /**
         * A unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The returned Model instance.
         */
        private com.oracle.bmc.aidocument.model.Model model;

        /**
         * The returned Model instance.
         * @param model the value to set
         * @return this builder
         */
        public Builder model(com.oracle.bmc.aidocument.model.Model model) {
            this.model = model;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateModelResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            contentLocation(o.getContentLocation());
            location(o.getLocation());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            model(o.getModel());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CreateModelResponse build() {
            return new CreateModelResponse(
                    __httpStatusCode__,
                    headers,
                    contentLocation,
                    location,
                    opcWorkRequestId,
                    opcRequestId,
                    etag,
                    model);
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
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",model=").append(String.valueOf(model));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateModelResponse)) {
            return false;
        }

        CreateModelResponse other = (CreateModelResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.model, other.model);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.model == null ? 43 : this.model.hashCode());
        return result;
    }
}
