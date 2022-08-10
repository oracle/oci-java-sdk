/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.responses;

import com.oracle.bmc.dataconnectivity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class ListRegistriesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination of a list of {@code Registry}s. If this header appears in the response, then this
     * is a partial list of Registries. Include this value as the {@code page} parameter in a subsequent
     * GET request to get the next batch of Registries.
     *
     */
    private String opcNextPage;

    /**
     * For pagination of a list of {@code Registry}s. If this header appears in the response, then this
     * is a partial list of Registries. Include this value as the {@code page} parameter in a subsequent
     * GET request to get the next batch of Registries.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned RegistrySummaryCollection instance.
     */
    private com.oracle.bmc.dataconnectivity.model.RegistrySummaryCollection
            registrySummaryCollection;

    /**
     * The returned RegistrySummaryCollection instance.
     * @return the value
     */
    public com.oracle.bmc.dataconnectivity.model.RegistrySummaryCollection
            getRegistrySummaryCollection() {
        return registrySummaryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "registrySummaryCollection"
    })
    private ListRegistriesResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.dataconnectivity.model.RegistrySummaryCollection
                    registrySummaryCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.registrySummaryCollection = registrySummaryCollection;
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
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For pagination of a list of {@code Registry}s. If this header appears in the response, then this
         * is a partial list of Registries. Include this value as the {@code page} parameter in a subsequent
         * GET request to get the next batch of Registries.
         *
         */
        private String opcNextPage;

        /**
         * For pagination of a list of {@code Registry}s. If this header appears in the response, then this
         * is a partial list of Registries. Include this value as the {@code page} parameter in a subsequent
         * GET request to get the next batch of Registries.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned RegistrySummaryCollection instance.
         */
        private com.oracle.bmc.dataconnectivity.model.RegistrySummaryCollection
                registrySummaryCollection;

        /**
         * The returned RegistrySummaryCollection instance.
         * @param registrySummaryCollection the value to set
         * @return this builder
         */
        public Builder registrySummaryCollection(
                com.oracle.bmc.dataconnectivity.model.RegistrySummaryCollection
                        registrySummaryCollection) {
            this.registrySummaryCollection = registrySummaryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListRegistriesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            registrySummaryCollection(o.getRegistrySummaryCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListRegistriesResponse build() {
            return new ListRegistriesResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    registrySummaryCollection);
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
        sb.append(",registrySummaryCollection=").append(String.valueOf(registrySummaryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRegistriesResponse)) {
            return false;
        }

        ListRegistriesResponse other = (ListRegistriesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.registrySummaryCollection, other.registrySummaryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.registrySummaryCollection == null
                                ? 43
                                : this.registrySummaryCollection.hashCode());
        return result;
    }
}
