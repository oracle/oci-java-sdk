/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.responses;

import com.oracle.bmc.osmanagementhub.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListManagedInstanceGroupAvailableModulesResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned ManagedInstanceGroupAvailableModuleCollection instance.
     */
    private com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupAvailableModuleCollection
            managedInstanceGroupAvailableModuleCollection;

    /**
     * The returned ManagedInstanceGroupAvailableModuleCollection instance.
     * @return the value
     */
    public com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupAvailableModuleCollection
            getManagedInstanceGroupAvailableModuleCollection() {
        return managedInstanceGroupAvailableModuleCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "managedInstanceGroupAvailableModuleCollection"
    })
    private ListManagedInstanceGroupAvailableModulesResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupAvailableModuleCollection
                    managedInstanceGroupAvailableModuleCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.managedInstanceGroupAvailableModuleCollection =
                managedInstanceGroupAvailableModuleCollection;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String opcNextPage;

        /**
         * For list pagination. When this header appears in the response, additional pages of results remain. For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned ManagedInstanceGroupAvailableModuleCollection instance.
         */
        private com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupAvailableModuleCollection
                managedInstanceGroupAvailableModuleCollection;

        /**
         * The returned ManagedInstanceGroupAvailableModuleCollection instance.
         * @param managedInstanceGroupAvailableModuleCollection the value to set
         * @return this builder
         */
        public Builder managedInstanceGroupAvailableModuleCollection(
                com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupAvailableModuleCollection
                        managedInstanceGroupAvailableModuleCollection) {
            this.managedInstanceGroupAvailableModuleCollection =
                    managedInstanceGroupAvailableModuleCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListManagedInstanceGroupAvailableModulesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            managedInstanceGroupAvailableModuleCollection(
                    o.getManagedInstanceGroupAvailableModuleCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListManagedInstanceGroupAvailableModulesResponse build() {
            return new ListManagedInstanceGroupAvailableModulesResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    managedInstanceGroupAvailableModuleCollection);
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
        sb.append(",managedInstanceGroupAvailableModuleCollection=")
                .append(String.valueOf(managedInstanceGroupAvailableModuleCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListManagedInstanceGroupAvailableModulesResponse)) {
            return false;
        }

        ListManagedInstanceGroupAvailableModulesResponse other =
                (ListManagedInstanceGroupAvailableModulesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.managedInstanceGroupAvailableModuleCollection,
                        other.managedInstanceGroupAvailableModuleCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceGroupAvailableModuleCollection == null
                                ? 43
                                : this.managedInstanceGroupAvailableModuleCollection.hashCode());
        return result;
    }
}
