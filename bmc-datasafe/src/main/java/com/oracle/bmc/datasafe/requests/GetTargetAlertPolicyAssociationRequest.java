/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetTargetAlertPolicyAssociationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetTargetAlertPolicyAssociationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetTargetAlertPolicyAssociationRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the target-alert policy association.
     */
    private String targetAlertPolicyAssociationId;

    /**
     * The OCID of the target-alert policy association.
     */
    public String getTargetAlertPolicyAssociationId() {
        return targetAlertPolicyAssociationId;
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
                    GetTargetAlertPolicyAssociationRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the target-alert policy association.
         */
        private String targetAlertPolicyAssociationId = null;

        /**
         * The OCID of the target-alert policy association.
         * @param targetAlertPolicyAssociationId the value to set
         * @return this builder instance
         */
        public Builder targetAlertPolicyAssociationId(String targetAlertPolicyAssociationId) {
            this.targetAlertPolicyAssociationId = targetAlertPolicyAssociationId;
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
        public Builder copy(GetTargetAlertPolicyAssociationRequest o) {
            targetAlertPolicyAssociationId(o.getTargetAlertPolicyAssociationId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetTargetAlertPolicyAssociationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetTargetAlertPolicyAssociationRequest
         */
        public GetTargetAlertPolicyAssociationRequest build() {
            GetTargetAlertPolicyAssociationRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetTargetAlertPolicyAssociationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetTargetAlertPolicyAssociationRequest
         */
        public GetTargetAlertPolicyAssociationRequest buildWithoutInvocationCallback() {
            GetTargetAlertPolicyAssociationRequest request =
                    new GetTargetAlertPolicyAssociationRequest();
            request.targetAlertPolicyAssociationId = targetAlertPolicyAssociationId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetTargetAlertPolicyAssociationRequest(targetAlertPolicyAssociationId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .targetAlertPolicyAssociationId(targetAlertPolicyAssociationId)
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
        sb.append(",targetAlertPolicyAssociationId=")
                .append(String.valueOf(this.targetAlertPolicyAssociationId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTargetAlertPolicyAssociationRequest)) {
            return false;
        }

        GetTargetAlertPolicyAssociationRequest other = (GetTargetAlertPolicyAssociationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.targetAlertPolicyAssociationId, other.targetAlertPolicyAssociationId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.targetAlertPolicyAssociationId == null
                                ? 43
                                : this.targetAlertPolicyAssociationId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
