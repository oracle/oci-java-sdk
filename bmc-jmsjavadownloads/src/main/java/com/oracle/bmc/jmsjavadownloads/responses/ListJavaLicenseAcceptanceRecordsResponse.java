/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.responses;

import com.oracle.bmc.jmsjavadownloads.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public class ListJavaLicenseAcceptanceRecordsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For list pagination. When this header appears in the response, additional pages of results
     * remain. Include this value as the {@code page} parameter for the subsequent GET request to
     * get the next batch of items. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, additional pages of results
     * remain. Include this value as the {@code page} parameter for the subsequent GET request to
     * get the next batch of items. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned {@code JavaLicenseAcceptanceRecordCollection} instance. */
    private com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecordCollection
            javaLicenseAcceptanceRecordCollection;

    /**
     * The returned {@code JavaLicenseAcceptanceRecordCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecordCollection
            getJavaLicenseAcceptanceRecordCollection() {
        return javaLicenseAcceptanceRecordCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "javaLicenseAcceptanceRecordCollection"
    })
    private ListJavaLicenseAcceptanceRecordsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecordCollection
                    javaLicenseAcceptanceRecordCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.javaLicenseAcceptanceRecordCollection = javaLicenseAcceptanceRecordCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListJavaLicenseAcceptanceRecordsResponse> {
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
         * particular request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. When this header appears in the response, additional pages of
         * results remain. Include this value as the {@code page} parameter for the subsequent GET
         * request to get the next batch of items. For important details about how pagination works,
         * see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String opcNextPage;

        /**
         * For list pagination. When this header appears in the response, additional pages of
         * results remain. Include this value as the {@code page} parameter for the subsequent GET
         * request to get the next batch of items. For important details about how pagination works,
         * see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The returned {@code JavaLicenseAcceptanceRecordCollection} instance. */
        private com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecordCollection
                javaLicenseAcceptanceRecordCollection;

        /**
         * The returned {@code JavaLicenseAcceptanceRecordCollection} instance.
         *
         * @param javaLicenseAcceptanceRecordCollection the value to set
         * @return this builder
         */
        public Builder javaLicenseAcceptanceRecordCollection(
                com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecordCollection
                        javaLicenseAcceptanceRecordCollection) {
            this.javaLicenseAcceptanceRecordCollection = javaLicenseAcceptanceRecordCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListJavaLicenseAcceptanceRecordsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            javaLicenseAcceptanceRecordCollection(o.getJavaLicenseAcceptanceRecordCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListJavaLicenseAcceptanceRecordsResponse build() {
            return new ListJavaLicenseAcceptanceRecordsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    javaLicenseAcceptanceRecordCollection);
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
        sb.append(",javaLicenseAcceptanceRecordCollection=")
                .append(String.valueOf(javaLicenseAcceptanceRecordCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListJavaLicenseAcceptanceRecordsResponse)) {
            return false;
        }

        ListJavaLicenseAcceptanceRecordsResponse other =
                (ListJavaLicenseAcceptanceRecordsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.javaLicenseAcceptanceRecordCollection,
                        other.javaLicenseAcceptanceRecordCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.javaLicenseAcceptanceRecordCollection == null
                                ? 43
                                : this.javaLicenseAcceptanceRecordCollection.hashCode());
        return result;
    }
}
