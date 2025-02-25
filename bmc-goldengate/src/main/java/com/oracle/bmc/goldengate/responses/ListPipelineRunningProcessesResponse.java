/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.responses;

import com.oracle.bmc.goldengate.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class ListPipelineRunningProcessesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The page token represents the page to start retrieving results. This is usually retrieved
     * from a previous list call.
     *
     */
    private String opcNextPage;

    /**
     * The page token represents the page to start retrieving results. This is usually retrieved
     * from a previous list call.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned PipelineRunningProcessCollection instance.
     */
    private com.oracle.bmc.goldengate.model.PipelineRunningProcessCollection
            pipelineRunningProcessCollection;

    /**
     * The returned PipelineRunningProcessCollection instance.
     * @return the value
     */
    public com.oracle.bmc.goldengate.model.PipelineRunningProcessCollection
            getPipelineRunningProcessCollection() {
        return pipelineRunningProcessCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcNextPage",
        "opcRequestId",
        "pipelineRunningProcessCollection"
    })
    private ListPipelineRunningProcessesResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcNextPage,
            String opcRequestId,
            com.oracle.bmc.goldengate.model.PipelineRunningProcessCollection
                    pipelineRunningProcessCollection) {
        super(__httpStatusCode__, headers);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.pipelineRunningProcessCollection = pipelineRunningProcessCollection;
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
         * The page token represents the page to start retrieving results. This is usually retrieved
         * from a previous list call.
         *
         */
        private String opcNextPage;

        /**
         * The page token represents the page to start retrieving results. This is usually retrieved
         * from a previous list call.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please include the request ID.
         *
         */
        private String opcRequestId;

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please include the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned PipelineRunningProcessCollection instance.
         */
        private com.oracle.bmc.goldengate.model.PipelineRunningProcessCollection
                pipelineRunningProcessCollection;

        /**
         * The returned PipelineRunningProcessCollection instance.
         * @param pipelineRunningProcessCollection the value to set
         * @return this builder
         */
        public Builder pipelineRunningProcessCollection(
                com.oracle.bmc.goldengate.model.PipelineRunningProcessCollection
                        pipelineRunningProcessCollection) {
            this.pipelineRunningProcessCollection = pipelineRunningProcessCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListPipelineRunningProcessesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            pipelineRunningProcessCollection(o.getPipelineRunningProcessCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListPipelineRunningProcessesResponse build() {
            return new ListPipelineRunningProcessesResponse(
                    __httpStatusCode__,
                    headers,
                    opcNextPage,
                    opcRequestId,
                    pipelineRunningProcessCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",pipelineRunningProcessCollection=")
                .append(String.valueOf(pipelineRunningProcessCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPipelineRunningProcessesResponse)) {
            return false;
        }

        ListPipelineRunningProcessesResponse other = (ListPipelineRunningProcessesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.pipelineRunningProcessCollection,
                        other.pipelineRunningProcessCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.pipelineRunningProcessCollection == null
                                ? 43
                                : this.pipelineRunningProcessCollection.hashCode());
        return result;
    }
}
