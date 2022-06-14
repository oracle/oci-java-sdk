/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.requests;

import com.oracle.bmc.loadbalancer.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateRuleSetExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateRuleSetRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class UpdateRuleSetRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loadbalancer.model.UpdateRuleSetDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the specified load balancer.
     */
    private String loadBalancerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the specified load balancer.
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }
    /**
     * The name of the rule set to update.
     * <p>
     * Example: {@code example_rule_set}
     *
     */
    private String ruleSetName;

    /**
     * The name of the rule set to update.
     * <p>
     * Example: {@code example_rule_set}
     *
     */
    public String getRuleSetName() {
        return ruleSetName;
    }
    /**
     * The configuration details to update a set of rules.
     */
    private com.oracle.bmc.loadbalancer.model.UpdateRuleSetDetails updateRuleSetDetails;

    /**
     * The configuration details to update a set of rules.
     */
    public com.oracle.bmc.loadbalancer.model.UpdateRuleSetDetails getUpdateRuleSetDetails() {
        return updateRuleSetDetails;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.loadbalancer.model.UpdateRuleSetDetails getBody$() {
        return updateRuleSetDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateRuleSetRequest, com.oracle.bmc.loadbalancer.model.UpdateRuleSetDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the specified load balancer.
         */
        private String loadBalancerId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the specified load balancer.
         * @param loadBalancerId the value to set
         * @return this builder instance
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The name of the rule set to update.
         * <p>
         * Example: {@code example_rule_set}
         *
         */
        private String ruleSetName = null;

        /**
         * The name of the rule set to update.
         * <p>
         * Example: {@code example_rule_set}
         *
         * @param ruleSetName the value to set
         * @return this builder instance
         */
        public Builder ruleSetName(String ruleSetName) {
            this.ruleSetName = ruleSetName;
            return this;
        }

        /**
         * The configuration details to update a set of rules.
         */
        private com.oracle.bmc.loadbalancer.model.UpdateRuleSetDetails updateRuleSetDetails = null;

        /**
         * The configuration details to update a set of rules.
         * @param updateRuleSetDetails the value to set
         * @return this builder instance
         */
        public Builder updateRuleSetDetails(
                com.oracle.bmc.loadbalancer.model.UpdateRuleSetDetails updateRuleSetDetails) {
            this.updateRuleSetDetails = updateRuleSetDetails;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(UpdateRuleSetRequest o) {
            loadBalancerId(o.getLoadBalancerId());
            ruleSetName(o.getRuleSetName());
            updateRuleSetDetails(o.getUpdateRuleSetDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateRuleSetRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateRuleSetRequest
         */
        public UpdateRuleSetRequest build() {
            UpdateRuleSetRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.loadbalancer.model.UpdateRuleSetDetails body) {
            updateRuleSetDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateRuleSetRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateRuleSetRequest
         */
        public UpdateRuleSetRequest buildWithoutInvocationCallback() {
            UpdateRuleSetRequest request = new UpdateRuleSetRequest();
            request.loadBalancerId = loadBalancerId;
            request.ruleSetName = ruleSetName;
            request.updateRuleSetDetails = updateRuleSetDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateRuleSetRequest(loadBalancerId, ruleSetName, updateRuleSetDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .loadBalancerId(loadBalancerId)
                .ruleSetName(ruleSetName)
                .updateRuleSetDetails(updateRuleSetDetails)
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
        sb.append(",loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(",ruleSetName=").append(String.valueOf(this.ruleSetName));
        sb.append(",updateRuleSetDetails=").append(String.valueOf(this.updateRuleSetDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRuleSetRequest)) {
            return false;
        }

        UpdateRuleSetRequest other = (UpdateRuleSetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.ruleSetName, other.ruleSetName)
                && java.util.Objects.equals(this.updateRuleSetDetails, other.updateRuleSetDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.loadBalancerId == null ? 43 : this.loadBalancerId.hashCode());
        result = (result * PRIME) + (this.ruleSetName == null ? 43 : this.ruleSetName.hashCode());
        result =
                (result * PRIME)
                        + (this.updateRuleSetDetails == null
                                ? 43
                                : this.updateRuleSetDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
