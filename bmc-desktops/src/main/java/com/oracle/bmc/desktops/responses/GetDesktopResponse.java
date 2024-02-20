/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.responses;

import com.oracle.bmc.desktops.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class GetDesktopResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code Desktop} instance. */
    private com.oracle.bmc.desktops.model.Desktop desktop;

    /**
     * The returned {@code Desktop} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.desktops.model.Desktop getDesktop() {
        return desktop;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "desktop"
    })
    private GetDesktopResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.desktops.model.Desktop desktop) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.desktop = desktop;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetDesktopResponse> {
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

        /** The returned {@code Desktop} instance. */
        private com.oracle.bmc.desktops.model.Desktop desktop;

        /**
         * The returned {@code Desktop} instance.
         *
         * @param desktop the value to set
         * @return this builder
         */
        public Builder desktop(com.oracle.bmc.desktops.model.Desktop desktop) {
            this.desktop = desktop;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetDesktopResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            desktop(o.getDesktop());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetDesktopResponse build() {
            return new GetDesktopResponse(__httpStatusCode__, headers, opcRequestId, etag, desktop);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",desktop=").append(String.valueOf(desktop));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDesktopResponse)) {
            return false;
        }

        GetDesktopResponse other = (GetDesktopResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.desktop, other.desktop);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.desktop == null ? 43 : this.desktop.hashCode());
        return result;
    }
}
