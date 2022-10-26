/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.requests;

import com.oracle.bmc.budget.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/budget/UpdateAlertRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAlertRuleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class UpdateAlertRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.budget.model.UpdateAlertRuleDetails> {

    /** The unique budget OCID. */
    private String budgetId;

    /** The unique budget OCID. */
    public String getBudgetId() {
        return budgetId;
    }
    /** The unique Alert Rule OCID. */
    private String alertRuleId;

    /** The unique Alert Rule OCID. */
    public String getAlertRuleId() {
        return alertRuleId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.budget.model.UpdateAlertRuleDetails updateAlertRuleDetails;

    /** The information to be updated. */
    public com.oracle.bmc.budget.model.UpdateAlertRuleDetails getUpdateAlertRuleDetails() {
        return updateAlertRuleDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public com.oracle.bmc.budget.model.UpdateAlertRuleDetails getBody$() {
        return updateAlertRuleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAlertRuleRequest, com.oracle.bmc.budget.model.UpdateAlertRuleDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique budget OCID. */
        private String budgetId = null;

        /**
         * The unique budget OCID.
         *
         * @param budgetId the value to set
         * @return this builder instance
         */
        public Builder budgetId(String budgetId) {
            this.budgetId = budgetId;
            return this;
        }

        /** The unique Alert Rule OCID. */
        private String alertRuleId = null;

        /**
         * The unique Alert Rule OCID.
         *
         * @param alertRuleId the value to set
         * @return this builder instance
         */
        public Builder alertRuleId(String alertRuleId) {
            this.alertRuleId = alertRuleId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.budget.model.UpdateAlertRuleDetails updateAlertRuleDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateAlertRuleDetails the value to set
         * @return this builder instance
         */
        public Builder updateAlertRuleDetails(
                com.oracle.bmc.budget.model.UpdateAlertRuleDetails updateAlertRuleDetails) {
            this.updateAlertRuleDetails = updateAlertRuleDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateAlertRuleRequest o) {
            budgetId(o.getBudgetId());
            alertRuleId(o.getAlertRuleId());
            updateAlertRuleDetails(o.getUpdateAlertRuleDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAlertRuleRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateAlertRuleRequest
         */
        public UpdateAlertRuleRequest build() {
            UpdateAlertRuleRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.budget.model.UpdateAlertRuleDetails body) {
            updateAlertRuleDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAlertRuleRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAlertRuleRequest
         */
        public UpdateAlertRuleRequest buildWithoutInvocationCallback() {
            UpdateAlertRuleRequest request = new UpdateAlertRuleRequest();
            request.budgetId = budgetId;
            request.alertRuleId = alertRuleId;
            request.updateAlertRuleDetails = updateAlertRuleDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAlertRuleRequest(budgetId, alertRuleId, updateAlertRuleDetails, ifMatch,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .budgetId(budgetId)
                .alertRuleId(alertRuleId)
                .updateAlertRuleDetails(updateAlertRuleDetails)
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
        sb.append(",budgetId=").append(String.valueOf(this.budgetId));
        sb.append(",alertRuleId=").append(String.valueOf(this.alertRuleId));
        sb.append(",updateAlertRuleDetails=").append(String.valueOf(this.updateAlertRuleDetails));
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
        if (!(o instanceof UpdateAlertRuleRequest)) {
            return false;
        }

        UpdateAlertRuleRequest other = (UpdateAlertRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.budgetId, other.budgetId)
                && java.util.Objects.equals(this.alertRuleId, other.alertRuleId)
                && java.util.Objects.equals(
                        this.updateAlertRuleDetails, other.updateAlertRuleDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.budgetId == null ? 43 : this.budgetId.hashCode());
        result = (result * PRIME) + (this.alertRuleId == null ? 43 : this.alertRuleId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAlertRuleDetails == null
                                ? 43
                                : this.updateAlertRuleDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
