/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.responses;

import com.oracle.bmc.adm.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ListApplicationDependencyVulnerabilitiesResponse
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
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned ApplicationDependencyVulnerabilityCollection instance.
     */
    private com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilityCollection
            applicationDependencyVulnerabilityCollection;

    /**
     * The returned ApplicationDependencyVulnerabilityCollection instance.
     * @return the value
     */
    public com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilityCollection
            getApplicationDependencyVulnerabilityCollection() {
        return applicationDependencyVulnerabilityCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "applicationDependencyVulnerabilityCollection"
    })
    private ListApplicationDependencyVulnerabilitiesResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilityCollection
                    applicationDependencyVulnerabilityCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.applicationDependencyVulnerabilityCollection =
                applicationDependencyVulnerabilityCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
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
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then a partial list might have been returned. Include this value as the {@code page} parameter for the
         * subsequent GET request to get the next batch of items.
         *
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then a partial list might have been returned. Include this value as the {@code page} parameter for the
         * subsequent GET request to get the next batch of items.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned ApplicationDependencyVulnerabilityCollection instance.
         */
        private com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilityCollection
                applicationDependencyVulnerabilityCollection;

        /**
         * The returned ApplicationDependencyVulnerabilityCollection instance.
         * @param applicationDependencyVulnerabilityCollection the value to set
         * @return this builder
         */
        public Builder applicationDependencyVulnerabilityCollection(
                com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilityCollection
                        applicationDependencyVulnerabilityCollection) {
            this.applicationDependencyVulnerabilityCollection =
                    applicationDependencyVulnerabilityCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListApplicationDependencyVulnerabilitiesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            applicationDependencyVulnerabilityCollection(
                    o.getApplicationDependencyVulnerabilityCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListApplicationDependencyVulnerabilitiesResponse build() {
            return new ListApplicationDependencyVulnerabilitiesResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    applicationDependencyVulnerabilityCollection);
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
        sb.append(",applicationDependencyVulnerabilityCollection=")
                .append(String.valueOf(applicationDependencyVulnerabilityCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListApplicationDependencyVulnerabilitiesResponse)) {
            return false;
        }

        ListApplicationDependencyVulnerabilitiesResponse other =
                (ListApplicationDependencyVulnerabilitiesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.applicationDependencyVulnerabilityCollection,
                        other.applicationDependencyVulnerabilityCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationDependencyVulnerabilityCollection == null
                                ? 43
                                : this.applicationDependencyVulnerabilityCollection.hashCode());
        return result;
    }
}
