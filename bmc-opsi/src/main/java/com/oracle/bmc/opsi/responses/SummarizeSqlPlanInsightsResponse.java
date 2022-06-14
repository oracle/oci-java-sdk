/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeSqlPlanInsightsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned SqlPlanInsightAggregationCollection instance.
     */
    private com.oracle.bmc.opsi.model.SqlPlanInsightAggregationCollection
            sqlPlanInsightAggregationCollection;

    /**
     * The returned SqlPlanInsightAggregationCollection instance.
     * @return the value
     */
    public com.oracle.bmc.opsi.model.SqlPlanInsightAggregationCollection
            getSqlPlanInsightAggregationCollection() {
        return sqlPlanInsightAggregationCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "sqlPlanInsightAggregationCollection"
    })
    private SummarizeSqlPlanInsightsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.opsi.model.SqlPlanInsightAggregationCollection
                    sqlPlanInsightAggregationCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.sqlPlanInsightAggregationCollection = sqlPlanInsightAggregationCollection;
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
         * The returned SqlPlanInsightAggregationCollection instance.
         */
        private com.oracle.bmc.opsi.model.SqlPlanInsightAggregationCollection
                sqlPlanInsightAggregationCollection;

        /**
         * The returned SqlPlanInsightAggregationCollection instance.
         * @param sqlPlanInsightAggregationCollection the value to set
         * @return this builder
         */
        public Builder sqlPlanInsightAggregationCollection(
                com.oracle.bmc.opsi.model.SqlPlanInsightAggregationCollection
                        sqlPlanInsightAggregationCollection) {
            this.sqlPlanInsightAggregationCollection = sqlPlanInsightAggregationCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(SummarizeSqlPlanInsightsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            sqlPlanInsightAggregationCollection(o.getSqlPlanInsightAggregationCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public SummarizeSqlPlanInsightsResponse build() {
            return new SummarizeSqlPlanInsightsResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    sqlPlanInsightAggregationCollection);
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
        sb.append(",sqlPlanInsightAggregationCollection=")
                .append(String.valueOf(sqlPlanInsightAggregationCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeSqlPlanInsightsResponse)) {
            return false;
        }

        SummarizeSqlPlanInsightsResponse other = (SummarizeSqlPlanInsightsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.sqlPlanInsightAggregationCollection,
                        other.sqlPlanInsightAggregationCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlPlanInsightAggregationCollection == null
                                ? 43
                                : this.sqlPlanInsightAggregationCollection.hashCode());
        return result;
    }
}
