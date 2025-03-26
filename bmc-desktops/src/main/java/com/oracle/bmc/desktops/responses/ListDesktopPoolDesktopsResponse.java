/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.responses;

import com.oracle.bmc.desktops.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class ListDesktopPoolDesktopsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The unique identifier of the request.
     */
    private String opcRequestId;

    /**
     * The unique identifier of the request.
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination.
     */
    private String opcNextPage;

    /**
     * For pagination.
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned DesktopPoolDesktopCollection instance.
     */
    private com.oracle.bmc.desktops.model.DesktopPoolDesktopCollection desktopPoolDesktopCollection;

    /**
     * The returned DesktopPoolDesktopCollection instance.
     * @return the value
     */
    public com.oracle.bmc.desktops.model.DesktopPoolDesktopCollection
            getDesktopPoolDesktopCollection() {
        return desktopPoolDesktopCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "desktopPoolDesktopCollection"
    })
    private ListDesktopPoolDesktopsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.desktops.model.DesktopPoolDesktopCollection
                    desktopPoolDesktopCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.desktopPoolDesktopCollection = desktopPoolDesktopCollection;
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
         * The unique identifier of the request.
         */
        private String opcRequestId;

        /**
         * The unique identifier of the request.
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For pagination.
         */
        private String opcNextPage;

        /**
         * For pagination.
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned DesktopPoolDesktopCollection instance.
         */
        private com.oracle.bmc.desktops.model.DesktopPoolDesktopCollection
                desktopPoolDesktopCollection;

        /**
         * The returned DesktopPoolDesktopCollection instance.
         * @param desktopPoolDesktopCollection the value to set
         * @return this builder
         */
        public Builder desktopPoolDesktopCollection(
                com.oracle.bmc.desktops.model.DesktopPoolDesktopCollection
                        desktopPoolDesktopCollection) {
            this.desktopPoolDesktopCollection = desktopPoolDesktopCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListDesktopPoolDesktopsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            desktopPoolDesktopCollection(o.getDesktopPoolDesktopCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListDesktopPoolDesktopsResponse build() {
            return new ListDesktopPoolDesktopsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    desktopPoolDesktopCollection);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",desktopPoolDesktopCollection=")
                .append(String.valueOf(desktopPoolDesktopCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDesktopPoolDesktopsResponse)) {
            return false;
        }

        ListDesktopPoolDesktopsResponse other = (ListDesktopPoolDesktopsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.desktopPoolDesktopCollection, other.desktopPoolDesktopCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.desktopPoolDesktopCollection == null
                                ? 43
                                : this.desktopPoolDesktopCollection.hashCode());
        return result;
    }
}
