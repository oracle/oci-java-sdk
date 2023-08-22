/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListRetentionRulesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide this request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide this request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when
     * debugging.
     */
    private String opcClientRequestId;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when
     * debugging.
     *
     * @return the value
     */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Paginating a list of retention rules. If the {@code opc-next-page} header appears in the
     * response, it indicates that this is a partial list of retention rules and there are
     * additional rules to get. Include the value of this header as the {@code page} parameter in a
     * subsequent GET request to get the next set of retention rules. Repeat this process to
     * retrieve the entire list of retention rules.
     *
     * <p>For more details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcNextPage;

    /**
     * Paginating a list of retention rules. If the {@code opc-next-page} header appears in the
     * response, it indicates that this is a partial list of retention rules and there are
     * additional rules to get. Include the value of this header as the {@code page} parameter in a
     * subsequent GET request to get the next set of retention rules. Repeat this process to
     * retrieve the entire list of retention rules.
     *
     * <p>For more details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned {@code RetentionRuleCollection} instance. */
    private com.oracle.bmc.objectstorage.model.RetentionRuleCollection retentionRuleCollection;

    /**
     * The returned {@code RetentionRuleCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.objectstorage.model.RetentionRuleCollection getRetentionRuleCollection() {
        return retentionRuleCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcClientRequestId",
        "opcNextPage",
        "retentionRuleCollection"
    })
    private ListRetentionRulesResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcClientRequestId,
            String opcNextPage,
            com.oracle.bmc.objectstorage.model.RetentionRuleCollection retentionRuleCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcClientRequestId = opcClientRequestId;
        this.opcNextPage = opcNextPage;
        this.retentionRuleCollection = retentionRuleCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<ListRetentionRulesResponse> {
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide this request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide this request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when
         * debugging.
         */
        private String opcClientRequestId;

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when
         * debugging.
         *
         * @param opcClientRequestId the value to set
         * @return this builder
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Paginating a list of retention rules. If the {@code opc-next-page} header appears in the
         * response, it indicates that this is a partial list of retention rules and there are
         * additional rules to get. Include the value of this header as the {@code page} parameter
         * in a subsequent GET request to get the next set of retention rules. Repeat this process
         * to retrieve the entire list of retention rules.
         *
         * <p>For more details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String opcNextPage;

        /**
         * Paginating a list of retention rules. If the {@code opc-next-page} header appears in the
         * response, it indicates that this is a partial list of retention rules and there are
         * additional rules to get. Include the value of this header as the {@code page} parameter
         * in a subsequent GET request to get the next set of retention rules. Repeat this process
         * to retrieve the entire list of retention rules.
         *
         * <p>For more details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The returned {@code RetentionRuleCollection} instance. */
        private com.oracle.bmc.objectstorage.model.RetentionRuleCollection retentionRuleCollection;

        /**
         * The returned {@code RetentionRuleCollection} instance.
         *
         * @param retentionRuleCollection the value to set
         * @return this builder
         */
        public Builder retentionRuleCollection(
                com.oracle.bmc.objectstorage.model.RetentionRuleCollection
                        retentionRuleCollection) {
            this.retentionRuleCollection = retentionRuleCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListRetentionRulesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcClientRequestId(o.getOpcClientRequestId());
            opcNextPage(o.getOpcNextPage());
            retentionRuleCollection(o.getRetentionRuleCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListRetentionRulesResponse build() {
            return new ListRetentionRulesResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcClientRequestId,
                    opcNextPage,
                    retentionRuleCollection);
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
        sb.append(",opcClientRequestId=").append(String.valueOf(opcClientRequestId));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",retentionRuleCollection=").append(String.valueOf(retentionRuleCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRetentionRulesResponse)) {
            return false;
        }

        ListRetentionRulesResponse other = (ListRetentionRulesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.retentionRuleCollection, other.retentionRuleCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionRuleCollection == null
                                ? 43
                                : this.retentionRuleCollection.hashCode());
        return result;
    }
}
