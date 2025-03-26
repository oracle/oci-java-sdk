/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.responses;

import com.oracle.bmc.apigateway.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class ListWorkRequestLogsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For list pagination. When this header appears in the response,
     * additional pages of results remain. For important details about how
     * pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response,
     * additional pages of results remain. For important details about how
     * pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * For list pagination. When this header appears in the response,
     * additional pages of results were seen previously. For important details
     * about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcPrevPage;

    /**
     * For list pagination. When this header appears in the response,
     * additional pages of results were seen previously. For important details
     * about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcPrevPage() {
        return opcPrevPage;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request
     * id.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request
     * id.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned WorkRequestLogCollection instance.
     */
    private com.oracle.bmc.apigateway.model.WorkRequestLogCollection workRequestLogCollection;

    /**
     * The returned WorkRequestLogCollection instance.
     * @return the value
     */
    public com.oracle.bmc.apigateway.model.WorkRequestLogCollection getWorkRequestLogCollection() {
        return workRequestLogCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcNextPage",
        "opcPrevPage",
        "opcRequestId",
        "workRequestLogCollection"
    })
    private ListWorkRequestLogsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcNextPage,
            String opcPrevPage,
            String opcRequestId,
            com.oracle.bmc.apigateway.model.WorkRequestLogCollection workRequestLogCollection) {
        super(__httpStatusCode__, headers);
        this.opcNextPage = opcNextPage;
        this.opcPrevPage = opcPrevPage;
        this.opcRequestId = opcRequestId;
        this.workRequestLogCollection = workRequestLogCollection;
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
         * For list pagination. When this header appears in the response,
         * additional pages of results remain. For important details about how
         * pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String opcNextPage;

        /**
         * For list pagination. When this header appears in the response,
         * additional pages of results remain. For important details about how
         * pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * For list pagination. When this header appears in the response,
         * additional pages of results were seen previously. For important details
         * about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String opcPrevPage;

        /**
         * For list pagination. When this header appears in the response,
         * additional pages of results were seen previously. For important details
         * about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcPrevPage the value to set
         * @return this builder
         */
        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to
         * contact Oracle about a particular request, please provide the request
         * id.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to
         * contact Oracle about a particular request, please provide the request
         * id.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned WorkRequestLogCollection instance.
         */
        private com.oracle.bmc.apigateway.model.WorkRequestLogCollection workRequestLogCollection;

        /**
         * The returned WorkRequestLogCollection instance.
         * @param workRequestLogCollection the value to set
         * @return this builder
         */
        public Builder workRequestLogCollection(
                com.oracle.bmc.apigateway.model.WorkRequestLogCollection workRequestLogCollection) {
            this.workRequestLogCollection = workRequestLogCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListWorkRequestLogsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcNextPage(o.getOpcNextPage());
            opcPrevPage(o.getOpcPrevPage());
            opcRequestId(o.getOpcRequestId());
            workRequestLogCollection(o.getWorkRequestLogCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListWorkRequestLogsResponse build() {
            return new ListWorkRequestLogsResponse(
                    __httpStatusCode__,
                    headers,
                    opcNextPage,
                    opcPrevPage,
                    opcRequestId,
                    workRequestLogCollection);
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
        sb.append(",opcPrevPage=").append(String.valueOf(opcPrevPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",workRequestLogCollection=").append(String.valueOf(workRequestLogCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListWorkRequestLogsResponse)) {
            return false;
        }

        ListWorkRequestLogsResponse other = (ListWorkRequestLogsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.workRequestLogCollection, other.workRequestLogCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestLogCollection == null
                                ? 43
                                : this.workRequestLogCollection.hashCode());
        return result;
    }
}
