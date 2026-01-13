/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetAlertPolicyRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetAlertPolicyRuleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetAlertPolicyRuleRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the alert policy. */
    private String alertPolicyId;

    /** The OCID of the alert policy. */
    public String getAlertPolicyId() {
        return alertPolicyId;
    }
    /** The key of the alert policy rule. */
    private String ruleKey;

    /** The key of the alert policy rule. */
    public String getRuleKey() {
        return ruleKey;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetAlertPolicyRuleRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the alert policy. */
        private String alertPolicyId = null;

        /**
         * The OCID of the alert policy.
         *
         * @param alertPolicyId the value to set
         * @return this builder instance
         */
        public Builder alertPolicyId(String alertPolicyId) {
            this.alertPolicyId = alertPolicyId;
            return this;
        }

        /** The key of the alert policy rule. */
        private String ruleKey = null;

        /**
         * The key of the alert policy rule.
         *
         * @param ruleKey the value to set
         * @return this builder instance
         */
        public Builder ruleKey(String ruleKey) {
            this.ruleKey = ruleKey;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(GetAlertPolicyRuleRequest o) {
            alertPolicyId(o.getAlertPolicyId());
            ruleKey(o.getRuleKey());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAlertPolicyRuleRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetAlertPolicyRuleRequest
         */
        public GetAlertPolicyRuleRequest build() {
            GetAlertPolicyRuleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetAlertPolicyRuleRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetAlertPolicyRuleRequest
         */
        public GetAlertPolicyRuleRequest buildWithoutInvocationCallback() {
            GetAlertPolicyRuleRequest request = new GetAlertPolicyRuleRequest();
            request.alertPolicyId = alertPolicyId;
            request.ruleKey = ruleKey;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetAlertPolicyRuleRequest(alertPolicyId, ruleKey, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .alertPolicyId(alertPolicyId)
                .ruleKey(ruleKey)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",alertPolicyId=").append(String.valueOf(this.alertPolicyId));
        sb.append(",ruleKey=").append(String.valueOf(this.ruleKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAlertPolicyRuleRequest)) {
            return false;
        }

        GetAlertPolicyRuleRequest other = (GetAlertPolicyRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.alertPolicyId, other.alertPolicyId)
                && java.util.Objects.equals(this.ruleKey, other.ruleKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.alertPolicyId == null ? 43 : this.alertPolicyId.hashCode());
        result = (result * PRIME) + (this.ruleKey == null ? 43 : this.ruleKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
