/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListCryptoAssessmentFindingsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCryptoAssessmentFindingsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListCryptoAssessmentFindingsRequest
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
     * A filter to return only findings with the specified finding key.
     */
    private String findingKey;

    /**
     * A filter to return only findings with the specified finding key.
     */
    public String getFindingKey() {
        return findingKey;
    }
    /**
     * A filter to return only findings with the specified title.
     */
    private String title;

    /**
     * A filter to return only findings with the specified title.
     */
    public String getTitle() {
        return title;
    }
    /**
     * A filter to return only findings in the specified category key.
     */
    private com.oracle.bmc.datasafe.model.CryptoFindingCategory category;

    /**
     * A filter to return only findings in the specified category key.
     */
    public com.oracle.bmc.datasafe.model.CryptoFindingCategory getCategory() {
        return category;
    }
    /**
     * A filter to return only findings with the specified status.
     */
    private com.oracle.bmc.datasafe.model.CryptoFindingStatus status;

    /**
     * A filter to return only findings with the specified status.
     */
    public com.oracle.bmc.datasafe.model.CryptoFindingStatus getStatus() {
        return status;
    }
    /**
     * A filter to return only findings that are or are not part of quantum-readiness checks.
     */
    private Boolean isQuantumReadinessCheck;

    /**
     * A filter to return only findings that are or are not part of quantum-readiness checks.
     */
    public Boolean getIsQuantumReadinessCheck() {
        return isQuantumReadinessCheck;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCryptoAssessmentFindingsRequest, java.lang.Void> {
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
         * A filter to return only findings with the specified finding key.
         */
        private String findingKey = null;

        /**
         * A filter to return only findings with the specified finding key.
         * @param findingKey the value to set
         * @return this builder instance
         */
        public Builder findingKey(String findingKey) {
            this.findingKey = findingKey;
            return this;
        }

        /**
         * A filter to return only findings with the specified title.
         */
        private String title = null;

        /**
         * A filter to return only findings with the specified title.
         * @param title the value to set
         * @return this builder instance
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * A filter to return only findings in the specified category key.
         */
        private com.oracle.bmc.datasafe.model.CryptoFindingCategory category = null;

        /**
         * A filter to return only findings in the specified category key.
         * @param category the value to set
         * @return this builder instance
         */
        public Builder category(com.oracle.bmc.datasafe.model.CryptoFindingCategory category) {
            this.category = category;
            return this;
        }

        /**
         * A filter to return only findings with the specified status.
         */
        private com.oracle.bmc.datasafe.model.CryptoFindingStatus status = null;

        /**
         * A filter to return only findings with the specified status.
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(com.oracle.bmc.datasafe.model.CryptoFindingStatus status) {
            this.status = status;
            return this;
        }

        /**
         * A filter to return only findings that are or are not part of quantum-readiness checks.
         */
        private Boolean isQuantumReadinessCheck = null;

        /**
         * A filter to return only findings that are or are not part of quantum-readiness checks.
         * @param isQuantumReadinessCheck the value to set
         * @return this builder instance
         */
        public Builder isQuantumReadinessCheck(Boolean isQuantumReadinessCheck) {
            this.isQuantumReadinessCheck = isQuantumReadinessCheck;
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
        public Builder copy(ListCryptoAssessmentFindingsRequest o) {
            cryptoAssessmentId(o.getCryptoAssessmentId());
            findingKey(o.getFindingKey());
            title(o.getTitle());
            category(o.getCategory());
            status(o.getStatus());
            isQuantumReadinessCheck(o.getIsQuantumReadinessCheck());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCryptoAssessmentFindingsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListCryptoAssessmentFindingsRequest
         */
        public ListCryptoAssessmentFindingsRequest build() {
            ListCryptoAssessmentFindingsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCryptoAssessmentFindingsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCryptoAssessmentFindingsRequest
         */
        public ListCryptoAssessmentFindingsRequest buildWithoutInvocationCallback() {
            ListCryptoAssessmentFindingsRequest request = new ListCryptoAssessmentFindingsRequest();
            request.cryptoAssessmentId = cryptoAssessmentId;
            request.findingKey = findingKey;
            request.title = title;
            request.category = category;
            request.status = status;
            request.isQuantumReadinessCheck = isQuantumReadinessCheck;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListCryptoAssessmentFindingsRequest(cryptoAssessmentId, findingKey, title, category, status, isQuantumReadinessCheck, opcRequestId, limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .cryptoAssessmentId(cryptoAssessmentId)
                .findingKey(findingKey)
                .title(title)
                .category(category)
                .status(status)
                .isQuantumReadinessCheck(isQuantumReadinessCheck)
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
        sb.append(",cryptoAssessmentId=").append(String.valueOf(this.cryptoAssessmentId));
        sb.append(",findingKey=").append(String.valueOf(this.findingKey));
        sb.append(",title=").append(String.valueOf(this.title));
        sb.append(",category=").append(String.valueOf(this.category));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",isQuantumReadinessCheck=").append(String.valueOf(this.isQuantumReadinessCheck));
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
        if (!(o instanceof ListCryptoAssessmentFindingsRequest)) {
            return false;
        }

        ListCryptoAssessmentFindingsRequest other = (ListCryptoAssessmentFindingsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.cryptoAssessmentId, other.cryptoAssessmentId)
                && java.util.Objects.equals(this.findingKey, other.findingKey)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(
                        this.isQuantumReadinessCheck, other.isQuantumReadinessCheck)
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
                        + (this.cryptoAssessmentId == null
                                ? 43
                                : this.cryptoAssessmentId.hashCode());
        result = (result * PRIME) + (this.findingKey == null ? 43 : this.findingKey.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.isQuantumReadinessCheck == null
                                ? 43
                                : this.isQuantumReadinessCheck.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
