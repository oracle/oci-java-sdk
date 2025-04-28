/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.responses;

import com.oracle.bmc.desktops.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class ListDesktopPoolsResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** For pagination. */
    private String opcNextPage;

    /**
     * For pagination.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned {@code DesktopPoolCollection} instance. */
    private com.oracle.bmc.desktops.model.DesktopPoolCollection desktopPoolCollection;

    /**
     * The returned {@code DesktopPoolCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.desktops.model.DesktopPoolCollection getDesktopPoolCollection() {
        return desktopPoolCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "desktopPoolCollection"
    })
    private ListDesktopPoolsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.desktops.model.DesktopPoolCollection desktopPoolCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.desktopPoolCollection = desktopPoolCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<ListDesktopPoolsResponse> {
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

        /** For pagination. */
        private String opcNextPage;

        /**
         * For pagination.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The returned {@code DesktopPoolCollection} instance. */
        private com.oracle.bmc.desktops.model.DesktopPoolCollection desktopPoolCollection;

        /**
         * The returned {@code DesktopPoolCollection} instance.
         *
         * @param desktopPoolCollection the value to set
         * @return this builder
         */
        public Builder desktopPoolCollection(
                com.oracle.bmc.desktops.model.DesktopPoolCollection desktopPoolCollection) {
            this.desktopPoolCollection = desktopPoolCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListDesktopPoolsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            desktopPoolCollection(o.getDesktopPoolCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListDesktopPoolsResponse build() {
            return new ListDesktopPoolsResponse(
                    __httpStatusCode__, headers, opcRequestId, opcNextPage, desktopPoolCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",desktopPoolCollection=").append(String.valueOf(desktopPoolCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDesktopPoolsResponse)) {
            return false;
        }

        ListDesktopPoolsResponse other = (ListDesktopPoolsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.desktopPoolCollection, other.desktopPoolCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.desktopPoolCollection == null
                                ? 43
                                : this.desktopPoolCollection.hashCode());
        return result;
    }
}
