/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class QueryResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then additional items may be available on the next page of the list. Include this
     * value as the {@code page} parameter for the subsequent request to get the next batch of
     * items.
     */
    private String opcNextPageId;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then additional items may be available on the next page of the list. Include this
     * value as the {@code page} parameter for the subsequent request to get the next batch of
     * items.
     *
     * @return the value
     */
    public String getOpcNextPageId() {
        return opcNextPageId;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then additional items may be available on the previous page of the list. Include
     * this value as the {@code page} parameter for the subsequent request to get the previous batch
     * of items.
     */
    private String opcPrevPageId;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then additional items may be available on the previous page of the list. Include
     * this value as the {@code page} parameter for the subsequent request to get the previous batch
     * of items.
     *
     * @return the value
     */
    public String getOpcPrevPageId() {
        return opcPrevPageId;
    }

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query
     * status of the asynchronous operation.
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query
     * status of the asynchronous operation.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /** URI to entity or work request created. */
    private String location;

    /**
     * URI to entity or work request created.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** The returned {@code QueryAggregation} instance. */
    private com.oracle.bmc.loganalytics.model.QueryAggregation queryAggregation;

    /**
     * The returned {@code QueryAggregation} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.QueryAggregation getQueryAggregation() {
        return queryAggregation;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPageId",
        "opcPrevPageId",
        "opcWorkRequestId",
        "location",
        "queryAggregation"
    })
    private QueryResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPageId,
            String opcPrevPageId,
            String opcWorkRequestId,
            String location,
            com.oracle.bmc.loganalytics.model.QueryAggregation queryAggregation) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPageId = opcNextPageId;
        this.opcPrevPageId = opcPrevPageId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.location = location;
        this.queryAggregation = queryAggregation;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<QueryResponse> {
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

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then additional items may be available on the next page of the list.
         * Include this value as the {@code page} parameter for the subsequent request to get the
         * next batch of items.
         */
        private String opcNextPageId;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then additional items may be available on the next page of the list.
         * Include this value as the {@code page} parameter for the subsequent request to get the
         * next batch of items.
         *
         * @param opcNextPageId the value to set
         * @return this builder
         */
        public Builder opcNextPageId(String opcNextPageId) {
            this.opcNextPageId = opcNextPageId;
            return this;
        }

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then additional items may be available on the previous page of the list.
         * Include this value as the {@code page} parameter for the subsequent request to get the
         * previous batch of items.
         */
        private String opcPrevPageId;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then additional items may be available on the previous page of the list.
         * Include this value as the {@code page} parameter for the subsequent request to get the
         * previous batch of items.
         *
         * @param opcPrevPageId the value to set
         * @return this builder
         */
        public Builder opcPrevPageId(String opcPrevPageId) {
            this.opcPrevPageId = opcPrevPageId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query
         * status of the asynchronous operation.
         */
        private String opcWorkRequestId;

        /**
         * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query
         * status of the asynchronous operation.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /** URI to entity or work request created. */
        private String location;

        /**
         * URI to entity or work request created.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /** The returned {@code QueryAggregation} instance. */
        private com.oracle.bmc.loganalytics.model.QueryAggregation queryAggregation;

        /**
         * The returned {@code QueryAggregation} instance.
         *
         * @param queryAggregation the value to set
         * @return this builder
         */
        public Builder queryAggregation(
                com.oracle.bmc.loganalytics.model.QueryAggregation queryAggregation) {
            this.queryAggregation = queryAggregation;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(QueryResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPageId(o.getOpcNextPageId());
            opcPrevPageId(o.getOpcPrevPageId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            location(o.getLocation());
            queryAggregation(o.getQueryAggregation());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public QueryResponse build() {
            return new QueryResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPageId,
                    opcPrevPageId,
                    opcWorkRequestId,
                    location,
                    queryAggregation);
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
        sb.append(",opcNextPageId=").append(String.valueOf(opcNextPageId));
        sb.append(",opcPrevPageId=").append(String.valueOf(opcPrevPageId));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",queryAggregation=").append(String.valueOf(queryAggregation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryResponse)) {
            return false;
        }

        QueryResponse other = (QueryResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPageId, other.opcNextPageId)
                && java.util.Objects.equals(this.opcPrevPageId, other.opcPrevPageId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.queryAggregation, other.queryAggregation);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcNextPageId == null ? 43 : this.opcNextPageId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcPrevPageId == null ? 43 : this.opcPrevPageId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.queryAggregation == null ? 43 : this.queryAggregation.hashCode());
        return result;
    }
}
