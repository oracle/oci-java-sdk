/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetUserAssessmentComparisonExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetUserAssessmentComparisonRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetUserAssessmentComparisonRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the user assessment.
     */
    private String userAssessmentId;

    /**
     * The OCID of the user assessment.
     */
    public String getUserAssessmentId() {
        return userAssessmentId;
    }
    /**
     * The OCID of the baseline user assessment.
     */
    private String comparisonUserAssessmentId;

    /**
     * The OCID of the baseline user assessment.
     */
    public String getComparisonUserAssessmentId() {
        return comparisonUserAssessmentId;
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
                    GetUserAssessmentComparisonRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the user assessment.
         */
        private String userAssessmentId = null;

        /**
         * The OCID of the user assessment.
         * @param userAssessmentId the value to set
         * @return this builder instance
         */
        public Builder userAssessmentId(String userAssessmentId) {
            this.userAssessmentId = userAssessmentId;
            return this;
        }

        /**
         * The OCID of the baseline user assessment.
         */
        private String comparisonUserAssessmentId = null;

        /**
         * The OCID of the baseline user assessment.
         * @param comparisonUserAssessmentId the value to set
         * @return this builder instance
         */
        public Builder comparisonUserAssessmentId(String comparisonUserAssessmentId) {
            this.comparisonUserAssessmentId = comparisonUserAssessmentId;
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
        public Builder copy(GetUserAssessmentComparisonRequest o) {
            userAssessmentId(o.getUserAssessmentId());
            comparisonUserAssessmentId(o.getComparisonUserAssessmentId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetUserAssessmentComparisonRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetUserAssessmentComparisonRequest
         */
        public GetUserAssessmentComparisonRequest build() {
            GetUserAssessmentComparisonRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetUserAssessmentComparisonRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetUserAssessmentComparisonRequest
         */
        public GetUserAssessmentComparisonRequest buildWithoutInvocationCallback() {
            GetUserAssessmentComparisonRequest request = new GetUserAssessmentComparisonRequest();
            request.userAssessmentId = userAssessmentId;
            request.comparisonUserAssessmentId = comparisonUserAssessmentId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetUserAssessmentComparisonRequest(userAssessmentId, comparisonUserAssessmentId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .userAssessmentId(userAssessmentId)
                .comparisonUserAssessmentId(comparisonUserAssessmentId)
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
        sb.append(",userAssessmentId=").append(String.valueOf(this.userAssessmentId));
        sb.append(",comparisonUserAssessmentId=")
                .append(String.valueOf(this.comparisonUserAssessmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetUserAssessmentComparisonRequest)) {
            return false;
        }

        GetUserAssessmentComparisonRequest other = (GetUserAssessmentComparisonRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.userAssessmentId, other.userAssessmentId)
                && java.util.Objects.equals(
                        this.comparisonUserAssessmentId, other.comparisonUserAssessmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.userAssessmentId == null ? 43 : this.userAssessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.comparisonUserAssessmentId == null
                                ? 43
                                : this.comparisonUserAssessmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
