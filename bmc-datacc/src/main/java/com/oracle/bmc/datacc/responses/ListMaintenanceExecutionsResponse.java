/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.responses;

import com.oracle.bmc.datacc.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class ListMaintenanceExecutionsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about a
     * particular request, then please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about a
     * particular request, then please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then it can mean that a partial list was returned. To obtain the next batch of
     * items, include this value as the {@code page} parameter for your next GET request.
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then it can mean that a partial list was returned. To obtain the next batch of
     * items, include this value as the {@code page} parameter for your next GET request.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned {@code MaintenanceExecutionCollection} instance. */
    private com.oracle.bmc.datacc.model.MaintenanceExecutionCollection
            maintenanceExecutionCollection;

    /**
     * The returned {@code MaintenanceExecutionCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.datacc.model.MaintenanceExecutionCollection
            getMaintenanceExecutionCollection() {
        return maintenanceExecutionCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "maintenanceExecutionCollection"
    })
    private ListMaintenanceExecutionsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.datacc.model.MaintenanceExecutionCollection
                    maintenanceExecutionCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.maintenanceExecutionCollection = maintenanceExecutionCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListMaintenanceExecutionsResponse> {
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
         * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about
         * a particular request, then please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about
         * a particular request, then please provide the request ID.
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
         * the response, then it can mean that a partial list was returned. To obtain the next batch
         * of items, include this value as the {@code page} parameter for your next GET request.
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then it can mean that a partial list was returned. To obtain the next batch
         * of items, include this value as the {@code page} parameter for your next GET request.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The returned {@code MaintenanceExecutionCollection} instance. */
        private com.oracle.bmc.datacc.model.MaintenanceExecutionCollection
                maintenanceExecutionCollection;

        /**
         * The returned {@code MaintenanceExecutionCollection} instance.
         *
         * @param maintenanceExecutionCollection the value to set
         * @return this builder
         */
        public Builder maintenanceExecutionCollection(
                com.oracle.bmc.datacc.model.MaintenanceExecutionCollection
                        maintenanceExecutionCollection) {
            this.maintenanceExecutionCollection = maintenanceExecutionCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListMaintenanceExecutionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            maintenanceExecutionCollection(o.getMaintenanceExecutionCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListMaintenanceExecutionsResponse build() {
            return new ListMaintenanceExecutionsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    maintenanceExecutionCollection);
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
        sb.append(",maintenanceExecutionCollection=")
                .append(String.valueOf(maintenanceExecutionCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMaintenanceExecutionsResponse)) {
            return false;
        }

        ListMaintenanceExecutionsResponse other = (ListMaintenanceExecutionsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.maintenanceExecutionCollection, other.maintenanceExecutionCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceExecutionCollection == null
                                ? 43
                                : this.maintenanceExecutionCollection.hashCode());
        return result;
    }
}
