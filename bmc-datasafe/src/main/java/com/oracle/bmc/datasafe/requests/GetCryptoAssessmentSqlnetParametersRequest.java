/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetCryptoAssessmentSqlnetParametersExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetCryptoAssessmentSqlnetParametersRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetCryptoAssessmentSqlnetParametersRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the crypto assessment.
     */
    private String cryptoAssessmentId;

    /**
     * The OCID of the crypto assessment.
     */
    public String getCryptoAssessmentId() {
        return cryptoAssessmentId;
    }
    /**
     * A filter to return only the SQLNET parameter with the specified name.
     */
    private String parameter;

    /**
     * A filter to return only the SQLNET parameter with the specified name.
     */
    public String getParameter() {
        return parameter;
    }
    /**
     * Filters SQLNET parameters by quantum-readiness category.
     */
    private com.oracle.bmc.datasafe.model.CryptoQuantumReadiness quantumReadiness;

    /**
     * Filters SQLNET parameters by quantum-readiness category.
     */
    public com.oracle.bmc.datasafe.model.CryptoQuantumReadiness getQuantumReadiness() {
        return quantumReadiness;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetCryptoAssessmentSqlnetParametersRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the crypto assessment.
         */
        private String cryptoAssessmentId = null;

        /**
         * The OCID of the crypto assessment.
         * @param cryptoAssessmentId the value to set
         * @return this builder instance
         */
        public Builder cryptoAssessmentId(String cryptoAssessmentId) {
            this.cryptoAssessmentId = cryptoAssessmentId;
            return this;
        }

        /**
         * A filter to return only the SQLNET parameter with the specified name.
         */
        private String parameter = null;

        /**
         * A filter to return only the SQLNET parameter with the specified name.
         * @param parameter the value to set
         * @return this builder instance
         */
        public Builder parameter(String parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * Filters SQLNET parameters by quantum-readiness category.
         */
        private com.oracle.bmc.datasafe.model.CryptoQuantumReadiness quantumReadiness = null;

        /**
         * Filters SQLNET parameters by quantum-readiness category.
         * @param quantumReadiness the value to set
         * @return this builder instance
         */
        public Builder quantumReadiness(
                com.oracle.bmc.datasafe.model.CryptoQuantumReadiness quantumReadiness) {
            this.quantumReadiness = quantumReadiness;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(GetCryptoAssessmentSqlnetParametersRequest o) {
            cryptoAssessmentId(o.getCryptoAssessmentId());
            parameter(o.getParameter());
            quantumReadiness(o.getQuantumReadiness());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetCryptoAssessmentSqlnetParametersRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetCryptoAssessmentSqlnetParametersRequest
         */
        public GetCryptoAssessmentSqlnetParametersRequest build() {
            GetCryptoAssessmentSqlnetParametersRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetCryptoAssessmentSqlnetParametersRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetCryptoAssessmentSqlnetParametersRequest
         */
        public GetCryptoAssessmentSqlnetParametersRequest buildWithoutInvocationCallback() {
            GetCryptoAssessmentSqlnetParametersRequest request =
                    new GetCryptoAssessmentSqlnetParametersRequest();
            request.cryptoAssessmentId = cryptoAssessmentId;
            request.parameter = parameter;
            request.quantumReadiness = quantumReadiness;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetCryptoAssessmentSqlnetParametersRequest(cryptoAssessmentId, parameter, quantumReadiness, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .cryptoAssessmentId(cryptoAssessmentId)
                .parameter(parameter)
                .quantumReadiness(quantumReadiness)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId);
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
        sb.append(",cryptoAssessmentId=").append(String.valueOf(this.cryptoAssessmentId));
        sb.append(",parameter=").append(String.valueOf(this.parameter));
        sb.append(",quantumReadiness=").append(String.valueOf(this.quantumReadiness));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetCryptoAssessmentSqlnetParametersRequest)) {
            return false;
        }

        GetCryptoAssessmentSqlnetParametersRequest other =
                (GetCryptoAssessmentSqlnetParametersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.cryptoAssessmentId, other.cryptoAssessmentId)
                && java.util.Objects.equals(this.parameter, other.parameter)
                && java.util.Objects.equals(this.quantumReadiness, other.quantumReadiness)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.cryptoAssessmentId == null
                                ? 43
                                : this.cryptoAssessmentId.hashCode());
        result = (result * PRIME) + (this.parameter == null ? 43 : this.parameter.hashCode());
        result =
                (result * PRIME)
                        + (this.quantumReadiness == null ? 43 : this.quantumReadiness.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
