/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.responses;

import com.oracle.bmc.desktops.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class CreateDesktopPoolResponse extends com.oracle.bmc.responses.BmcResponse {
    /** The unique identifier of the request. */
    private String opcRequestId;

    /**
     * The unique identifier of the request.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** A unique identifier for an asynchronous request. */
    private String opcWorkRequestId;

    /**
     * A unique identifier for an asynchronous request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /** A URL containing location of the newly created resource. */
    private String location;

    /**
     * A URL containing location of the newly created resource.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** A URL containing the location of the newly created resource. */
    private String contentLocation;

    /**
     * A URL containing the location of the newly created resource.
     *
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /** For optimistic concurrency. See if-match. */
    private String etag;

    /**
     * For optimistic concurrency. See if-match.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code DesktopPool} instance. */
    private com.oracle.bmc.desktops.model.DesktopPool desktopPool;

    /**
     * The returned {@code DesktopPool} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.desktops.model.DesktopPool getDesktopPool() {
        return desktopPool;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcWorkRequestId",
        "location",
        "contentLocation",
        "etag",
        "desktopPool"
    })
    private CreateDesktopPoolResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcWorkRequestId,
            String location,
            String contentLocation,
            String etag,
            com.oracle.bmc.desktops.model.DesktopPool desktopPool) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.location = location;
        this.contentLocation = contentLocation;
        this.etag = etag;
        this.desktopPool = desktopPool;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<CreateDesktopPoolResponse> {
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

        /** The unique identifier of the request. */
        private String opcRequestId;

        /**
         * The unique identifier of the request.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** A unique identifier for an asynchronous request. */
        private String opcWorkRequestId;

        /**
         * A unique identifier for an asynchronous request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /** A URL containing location of the newly created resource. */
        private String location;

        /**
         * A URL containing location of the newly created resource.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /** A URL containing the location of the newly created resource. */
        private String contentLocation;

        /**
         * A URL containing the location of the newly created resource.
         *
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
            return this;
        }

        /** For optimistic concurrency. See if-match. */
        private String etag;

        /**
         * For optimistic concurrency. See if-match.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code DesktopPool} instance. */
        private com.oracle.bmc.desktops.model.DesktopPool desktopPool;

        /**
         * The returned {@code DesktopPool} instance.
         *
         * @param desktopPool the value to set
         * @return this builder
         */
        public Builder desktopPool(com.oracle.bmc.desktops.model.DesktopPool desktopPool) {
            this.desktopPool = desktopPool;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateDesktopPoolResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            location(o.getLocation());
            contentLocation(o.getContentLocation());
            etag(o.getEtag());
            desktopPool(o.getDesktopPool());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateDesktopPoolResponse build() {
            return new CreateDesktopPoolResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcWorkRequestId,
                    location,
                    contentLocation,
                    etag,
                    desktopPool);
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",desktopPool=").append(String.valueOf(desktopPool));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDesktopPoolResponse)) {
            return false;
        }

        CreateDesktopPoolResponse other = (CreateDesktopPoolResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.desktopPool, other.desktopPool);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.desktopPool == null ? 43 : this.desktopPool.hashCode());
        return result;
    }
}
