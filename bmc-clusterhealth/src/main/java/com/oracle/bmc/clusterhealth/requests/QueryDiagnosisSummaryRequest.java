/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterhealth.requests;

import com.oracle.bmc.clusterhealth.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/clusterhealth/QueryDiagnosisSummaryExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use QueryDiagnosisSummaryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260331")
public class QueryDiagnosisSummaryRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.clusterhealth.model.QueryDiagnosisSummaryDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Diagnosis.
     */
    private String diagnosisStoreId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Diagnosis.
     */
    public String getDiagnosisStoreId() {
        return diagnosisStoreId;
    }
    /**
     * Parameters for filtering diagnosis summaries.
     */
    private com.oracle.bmc.clusterhealth.model.QueryDiagnosisSummaryDetails
            queryDiagnosisSummaryDetails;

    /**
     * Parameters for filtering diagnosis summaries.
     */
    public com.oracle.bmc.clusterhealth.model.QueryDiagnosisSummaryDetails
            getQueryDiagnosisSummaryDetails() {
        return queryDiagnosisSummaryDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the opc-next-page response header from the previous
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the opc-next-page response header from the previous
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.clusterhealth.model.QueryDiagnosisSummaryDetails getBody$() {
        return queryDiagnosisSummaryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    QueryDiagnosisSummaryRequest,
                    com.oracle.bmc.clusterhealth.model.QueryDiagnosisSummaryDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Diagnosis.
         */
        private String diagnosisStoreId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Diagnosis.
         * @param diagnosisStoreId the value to set
         * @return this builder instance
         */
        public Builder diagnosisStoreId(String diagnosisStoreId) {
            this.diagnosisStoreId = diagnosisStoreId;
            return this;
        }

        /**
         * Parameters for filtering diagnosis summaries.
         */
        private com.oracle.bmc.clusterhealth.model.QueryDiagnosisSummaryDetails
                queryDiagnosisSummaryDetails = null;

        /**
         * Parameters for filtering diagnosis summaries.
         * @param queryDiagnosisSummaryDetails the value to set
         * @return this builder instance
         */
        public Builder queryDiagnosisSummaryDetails(
                com.oracle.bmc.clusterhealth.model.QueryDiagnosisSummaryDetails
                        queryDiagnosisSummaryDetails) {
            this.queryDiagnosisSummaryDetails = queryDiagnosisSummaryDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(QueryDiagnosisSummaryRequest o) {
            diagnosisStoreId(o.getDiagnosisStoreId());
            queryDiagnosisSummaryDetails(o.getQueryDiagnosisSummaryDetails());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of QueryDiagnosisSummaryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of QueryDiagnosisSummaryRequest
         */
        public QueryDiagnosisSummaryRequest build() {
            QueryDiagnosisSummaryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.clusterhealth.model.QueryDiagnosisSummaryDetails body) {
            queryDiagnosisSummaryDetails(body);
            return this;
        }

        /**
         * Build the instance of QueryDiagnosisSummaryRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of QueryDiagnosisSummaryRequest
         */
        public QueryDiagnosisSummaryRequest buildWithoutInvocationCallback() {
            QueryDiagnosisSummaryRequest request = new QueryDiagnosisSummaryRequest();
            request.diagnosisStoreId = diagnosisStoreId;
            request.queryDiagnosisSummaryDetails = queryDiagnosisSummaryDetails;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            return request;
            // new QueryDiagnosisSummaryRequest(diagnosisStoreId, queryDiagnosisSummaryDetails, opcRequestId, limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .diagnosisStoreId(diagnosisStoreId)
                .queryDiagnosisSummaryDetails(queryDiagnosisSummaryDetails)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",diagnosisStoreId=").append(String.valueOf(this.diagnosisStoreId));
        sb.append(",queryDiagnosisSummaryDetails=")
                .append(String.valueOf(this.queryDiagnosisSummaryDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryDiagnosisSummaryRequest)) {
            return false;
        }

        QueryDiagnosisSummaryRequest other = (QueryDiagnosisSummaryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.diagnosisStoreId, other.diagnosisStoreId)
                && java.util.Objects.equals(
                        this.queryDiagnosisSummaryDetails, other.queryDiagnosisSummaryDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.diagnosisStoreId == null ? 43 : this.diagnosisStoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.queryDiagnosisSummaryDetails == null
                                ? 43
                                : this.queryDiagnosisSummaryDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
