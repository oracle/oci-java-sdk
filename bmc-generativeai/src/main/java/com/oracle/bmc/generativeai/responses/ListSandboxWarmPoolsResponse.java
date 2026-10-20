/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.responses;

import com.oracle.bmc.generativeai.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class ListSandboxWarmPoolsResponse extends com.oracle.bmc.responses.BmcResponse {
    /** Request identifier. */
    private String opcRequestId;

    /**
     * Request identifier.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** Opaque continuation token bound to Project and filters. */
    private String opcNextPage;

    /**
     * Opaque continuation token bound to Project and filters.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned {@code SandboxWarmPoolCollection} instance. */
    private com.oracle.bmc.generativeai.model.SandboxWarmPoolCollection sandboxWarmPoolCollection;

    /**
     * The returned {@code SandboxWarmPoolCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.generativeai.model.SandboxWarmPoolCollection
            getSandboxWarmPoolCollection() {
        return sandboxWarmPoolCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "sandboxWarmPoolCollection"
    })
    private ListSandboxWarmPoolsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.generativeai.model.SandboxWarmPoolCollection sandboxWarmPoolCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.sandboxWarmPoolCollection = sandboxWarmPoolCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<ListSandboxWarmPoolsResponse> {
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

        /** Request identifier. */
        private String opcRequestId;

        /**
         * Request identifier.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Opaque continuation token bound to Project and filters. */
        private String opcNextPage;

        /**
         * Opaque continuation token bound to Project and filters.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The returned {@code SandboxWarmPoolCollection} instance. */
        private com.oracle.bmc.generativeai.model.SandboxWarmPoolCollection
                sandboxWarmPoolCollection;

        /**
         * The returned {@code SandboxWarmPoolCollection} instance.
         *
         * @param sandboxWarmPoolCollection the value to set
         * @return this builder
         */
        public Builder sandboxWarmPoolCollection(
                com.oracle.bmc.generativeai.model.SandboxWarmPoolCollection
                        sandboxWarmPoolCollection) {
            this.sandboxWarmPoolCollection = sandboxWarmPoolCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListSandboxWarmPoolsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            sandboxWarmPoolCollection(o.getSandboxWarmPoolCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListSandboxWarmPoolsResponse build() {
            return new ListSandboxWarmPoolsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    sandboxWarmPoolCollection);
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
        sb.append(",sandboxWarmPoolCollection=").append(String.valueOf(sandboxWarmPoolCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSandboxWarmPoolsResponse)) {
            return false;
        }

        ListSandboxWarmPoolsResponse other = (ListSandboxWarmPoolsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.sandboxWarmPoolCollection, other.sandboxWarmPoolCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.sandboxWarmPoolCollection == null
                                ? 43
                                : this.sandboxWarmPoolCollection.hashCode());
        return result;
    }
}
