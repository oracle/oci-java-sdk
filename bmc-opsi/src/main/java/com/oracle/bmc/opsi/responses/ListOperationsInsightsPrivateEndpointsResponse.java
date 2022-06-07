/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ListOperationsInsightsPrivateEndpointsResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned OperationsInsightsPrivateEndpointCollection instance.
     */
    private com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointCollection
            operationsInsightsPrivateEndpointCollection;

    public com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointCollection
            getOperationsInsightsPrivateEndpointCollection() {
        return operationsInsightsPrivateEndpointCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "operationsInsightsPrivateEndpointCollection"
    })
    private ListOperationsInsightsPrivateEndpointsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointCollection
                    operationsInsightsPrivateEndpointCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.operationsInsightsPrivateEndpointCollection =
                operationsInsightsPrivateEndpointCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String opcNextPage;

        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        private com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointCollection
                operationsInsightsPrivateEndpointCollection;

        public Builder operationsInsightsPrivateEndpointCollection(
                com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointCollection
                        operationsInsightsPrivateEndpointCollection) {
            this.operationsInsightsPrivateEndpointCollection =
                    operationsInsightsPrivateEndpointCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListOperationsInsightsPrivateEndpointsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            operationsInsightsPrivateEndpointCollection(
                    o.getOperationsInsightsPrivateEndpointCollection());

            return this;
        }

        public ListOperationsInsightsPrivateEndpointsResponse build() {
            return new ListOperationsInsightsPrivateEndpointsResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    operationsInsightsPrivateEndpointCollection);
        }
    }

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
        sb.append(",operationsInsightsPrivateEndpointCollection=")
                .append(String.valueOf(operationsInsightsPrivateEndpointCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListOperationsInsightsPrivateEndpointsResponse)) {
            return false;
        }

        ListOperationsInsightsPrivateEndpointsResponse other =
                (ListOperationsInsightsPrivateEndpointsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.operationsInsightsPrivateEndpointCollection,
                        other.operationsInsightsPrivateEndpointCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.operationsInsightsPrivateEndpointCollection == null
                                ? 43
                                : this.operationsInsightsPrivateEndpointCollection.hashCode());
        return result;
    }
}
