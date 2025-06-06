/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.responses;

import com.oracle.bmc.goldengate.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class ListDatabaseRegistrationsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
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
     * The page token represents the page to start retrieving results. This is usually retrieved
     * from a previous list call.
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

    /** Deprecation date of this API version. */
    private String sunset;

    /**
     * Deprecation date of this API version.
     *
     * @return the value
     */
    public String getSunset() {
        return sunset;
    }

    /** The returned {@code DatabaseRegistrationCollection} instance. */
    private com.oracle.bmc.goldengate.model.DatabaseRegistrationCollection
            databaseRegistrationCollection;

    /**
     * The returned {@code DatabaseRegistrationCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.goldengate.model.DatabaseRegistrationCollection
            getDatabaseRegistrationCollection() {
        return databaseRegistrationCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "sunset",
        "databaseRegistrationCollection"
    })
    private ListDatabaseRegistrationsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            String sunset,
            com.oracle.bmc.goldengate.model.DatabaseRegistrationCollection
                    databaseRegistrationCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.sunset = sunset;
        this.databaseRegistrationCollection = databaseRegistrationCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListDatabaseRegistrationsResponse> {
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
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please include the request ID.
         */
        private String opcRequestId;

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please include the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The page token represents the page to start retrieving results. This is usually retrieved
         * from a previous list call.
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

        /** Deprecation date of this API version. */
        private String sunset;

        /**
         * Deprecation date of this API version.
         *
         * @param sunset the value to set
         * @return this builder
         */
        public Builder sunset(String sunset) {
            this.sunset = sunset;
            return this;
        }

        /** The returned {@code DatabaseRegistrationCollection} instance. */
        private com.oracle.bmc.goldengate.model.DatabaseRegistrationCollection
                databaseRegistrationCollection;

        /**
         * The returned {@code DatabaseRegistrationCollection} instance.
         *
         * @param databaseRegistrationCollection the value to set
         * @return this builder
         */
        public Builder databaseRegistrationCollection(
                com.oracle.bmc.goldengate.model.DatabaseRegistrationCollection
                        databaseRegistrationCollection) {
            this.databaseRegistrationCollection = databaseRegistrationCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListDatabaseRegistrationsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            sunset(o.getSunset());
            databaseRegistrationCollection(o.getDatabaseRegistrationCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListDatabaseRegistrationsResponse build() {
            return new ListDatabaseRegistrationsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    sunset,
                    databaseRegistrationCollection);
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
        sb.append(",sunset=").append(String.valueOf(sunset));
        sb.append(",databaseRegistrationCollection=")
                .append(String.valueOf(databaseRegistrationCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDatabaseRegistrationsResponse)) {
            return false;
        }

        ListDatabaseRegistrationsResponse other = (ListDatabaseRegistrationsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.sunset, other.sunset)
                && java.util.Objects.equals(
                        this.databaseRegistrationCollection, other.databaseRegistrationCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.sunset == null ? 43 : this.sunset.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseRegistrationCollection == null
                                ? 43
                                : this.databaseRegistrationCollection.hashCode());
        return result;
    }
}
