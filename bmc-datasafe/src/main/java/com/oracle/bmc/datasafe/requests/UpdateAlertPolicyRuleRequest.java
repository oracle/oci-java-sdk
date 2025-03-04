/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateAlertPolicyRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateAlertPolicyRuleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateAlertPolicyRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.UpdateAlertPolicyRuleDetails> {

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
    /** The details used to update the alert policy rule. */
    private com.oracle.bmc.datasafe.model.UpdateAlertPolicyRuleDetails updateAlertPolicyRuleDetails;

    /** The details used to update the alert policy rule. */
    public com.oracle.bmc.datasafe.model.UpdateAlertPolicyRuleDetails
            getUpdateAlertPolicyRuleDetails() {
        return updateAlertPolicyRuleDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.UpdateAlertPolicyRuleDetails getBody$() {
        return updateAlertPolicyRuleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAlertPolicyRuleRequest,
                    com.oracle.bmc.datasafe.model.UpdateAlertPolicyRuleDetails> {
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

        /** The details used to update the alert policy rule. */
        private com.oracle.bmc.datasafe.model.UpdateAlertPolicyRuleDetails
                updateAlertPolicyRuleDetails = null;

        /**
         * The details used to update the alert policy rule.
         *
         * @param updateAlertPolicyRuleDetails the value to set
         * @return this builder instance
         */
        public Builder updateAlertPolicyRuleDetails(
                com.oracle.bmc.datasafe.model.UpdateAlertPolicyRuleDetails
                        updateAlertPolicyRuleDetails) {
            this.updateAlertPolicyRuleDetails = updateAlertPolicyRuleDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the etag from a previous GET or POST response for that
         * resource. The resource will be updated or deleted only if the etag you provide matches
         * the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the etag from a previous GET or POST response for that
         * resource. The resource will be updated or deleted only if the etag you provide matches
         * the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateAlertPolicyRuleRequest o) {
            alertPolicyId(o.getAlertPolicyId());
            ruleKey(o.getRuleKey());
            updateAlertPolicyRuleDetails(o.getUpdateAlertPolicyRuleDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAlertPolicyRuleRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateAlertPolicyRuleRequest
         */
        public UpdateAlertPolicyRuleRequest build() {
            UpdateAlertPolicyRuleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.datasafe.model.UpdateAlertPolicyRuleDetails body) {
            updateAlertPolicyRuleDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAlertPolicyRuleRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAlertPolicyRuleRequest
         */
        public UpdateAlertPolicyRuleRequest buildWithoutInvocationCallback() {
            UpdateAlertPolicyRuleRequest request = new UpdateAlertPolicyRuleRequest();
            request.alertPolicyId = alertPolicyId;
            request.ruleKey = ruleKey;
            request.updateAlertPolicyRuleDetails = updateAlertPolicyRuleDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAlertPolicyRuleRequest(alertPolicyId, ruleKey,
            // updateAlertPolicyRuleDetails, ifMatch, opcRequestId);
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
                .updateAlertPolicyRuleDetails(updateAlertPolicyRuleDetails)
                .ifMatch(ifMatch)
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
        sb.append(",updateAlertPolicyRuleDetails=")
                .append(String.valueOf(this.updateAlertPolicyRuleDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAlertPolicyRuleRequest)) {
            return false;
        }

        UpdateAlertPolicyRuleRequest other = (UpdateAlertPolicyRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.alertPolicyId, other.alertPolicyId)
                && java.util.Objects.equals(this.ruleKey, other.ruleKey)
                && java.util.Objects.equals(
                        this.updateAlertPolicyRuleDetails, other.updateAlertPolicyRuleDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
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
        result =
                (result * PRIME)
                        + (this.updateAlertPolicyRuleDetails == null
                                ? 43
                                : this.updateAlertPolicyRuleDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
