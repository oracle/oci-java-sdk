/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.responses;

import com.oracle.bmc.networkfirewall.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public class UpdateApplicationGroupResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. This is to get the page counts
     * overall.
     */
    private String opcPageCount;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. This is to get the page counts
     * overall.
     *
     * @return the value
     */
    public String getOpcPageCount() {
        return opcPageCount;
    }

    /** For pagination of a list of items. This provides the count of total items across pages. */
    private Integer opcTotalItems;

    /**
     * For pagination of a list of items. This provides the count of total items across pages.
     *
     * @return the value
     */
    public Integer getOpcTotalItems() {
        return opcTotalItems;
    }

    /** For optimistic concurrency control. See {@code if-match}. */
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

    /** The returned {@code ApplicationGroup} instance. */
    private com.oracle.bmc.networkfirewall.model.ApplicationGroup applicationGroup;

    /**
     * The returned {@code ApplicationGroup} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.networkfirewall.model.ApplicationGroup getApplicationGroup() {
        return applicationGroup;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcPageCount",
        "opcTotalItems",
        "etag",
        "opcRequestId",
        "applicationGroup"
    })
    private UpdateApplicationGroupResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcPageCount,
            Integer opcTotalItems,
            String etag,
            String opcRequestId,
            com.oracle.bmc.networkfirewall.model.ApplicationGroup applicationGroup) {
        super(__httpStatusCode__, headers);
        this.opcPageCount = opcPageCount;
        this.opcTotalItems = opcTotalItems;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.applicationGroup = applicationGroup;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    UpdateApplicationGroupResponse> {
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
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. This is to get the page
         * counts overall.
         */
        private String opcPageCount;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. This is to get the page
         * counts overall.
         *
         * @param opcPageCount the value to set
         * @return this builder
         */
        public Builder opcPageCount(String opcPageCount) {
            this.opcPageCount = opcPageCount;
            return this;
        }

        /**
         * For pagination of a list of items. This provides the count of total items across pages.
         */
        private Integer opcTotalItems;

        /**
         * For pagination of a list of items. This provides the count of total items across pages.
         *
         * @param opcTotalItems the value to set
         * @return this builder
         */
        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
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

        /** The returned {@code ApplicationGroup} instance. */
        private com.oracle.bmc.networkfirewall.model.ApplicationGroup applicationGroup;

        /**
         * The returned {@code ApplicationGroup} instance.
         *
         * @param applicationGroup the value to set
         * @return this builder
         */
        public Builder applicationGroup(
                com.oracle.bmc.networkfirewall.model.ApplicationGroup applicationGroup) {
            this.applicationGroup = applicationGroup;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(UpdateApplicationGroupResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcPageCount(o.getOpcPageCount());
            opcTotalItems(o.getOpcTotalItems());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            applicationGroup(o.getApplicationGroup());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public UpdateApplicationGroupResponse build() {
            return new UpdateApplicationGroupResponse(
                    __httpStatusCode__,
                    headers,
                    opcPageCount,
                    opcTotalItems,
                    etag,
                    opcRequestId,
                    applicationGroup);
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
        sb.append(",opcPageCount=").append(String.valueOf(opcPageCount));
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",applicationGroup=").append(String.valueOf(applicationGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateApplicationGroupResponse)) {
            return false;
        }

        UpdateApplicationGroupResponse other = (UpdateApplicationGroupResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcPageCount, other.opcPageCount)
                && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.applicationGroup, other.applicationGroup);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcPageCount == null ? 43 : this.opcPageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationGroup == null ? 43 : this.applicationGroup.hashCode());
        return result;
    }
}
