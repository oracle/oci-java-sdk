/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.requests;

import com.oracle.bmc.waf.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waf/CreateWebAppFirewallPolicyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateWebAppFirewallPolicyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public class CreateWebAppFirewallPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.waf.model.CreateWebAppFirewallPolicyDetails> {

    /**
     * Details for the new WebAppFirewallPolicy.
     */
    private com.oracle.bmc.waf.model.CreateWebAppFirewallPolicyDetails
            createWebAppFirewallPolicyDetails;

    /**
     * Details for the new WebAppFirewallPolicy.
     */
    public com.oracle.bmc.waf.model.CreateWebAppFirewallPolicyDetails
            getCreateWebAppFirewallPolicyDetails() {
        return createWebAppFirewallPolicyDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
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
    public com.oracle.bmc.waf.model.CreateWebAppFirewallPolicyDetails getBody$() {
        return createWebAppFirewallPolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateWebAppFirewallPolicyRequest,
                    com.oracle.bmc.waf.model.CreateWebAppFirewallPolicyDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details for the new WebAppFirewallPolicy.
         */
        private com.oracle.bmc.waf.model.CreateWebAppFirewallPolicyDetails
                createWebAppFirewallPolicyDetails = null;

        /**
         * Details for the new WebAppFirewallPolicy.
         * @param createWebAppFirewallPolicyDetails the value to set
         * @return this builder instance
         */
        public Builder createWebAppFirewallPolicyDetails(
                com.oracle.bmc.waf.model.CreateWebAppFirewallPolicyDetails
                        createWebAppFirewallPolicyDetails) {
            this.createWebAppFirewallPolicyDetails = createWebAppFirewallPolicyDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(CreateWebAppFirewallPolicyRequest o) {
            createWebAppFirewallPolicyDetails(o.getCreateWebAppFirewallPolicyDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateWebAppFirewallPolicyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateWebAppFirewallPolicyRequest
         */
        public CreateWebAppFirewallPolicyRequest build() {
            CreateWebAppFirewallPolicyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.waf.model.CreateWebAppFirewallPolicyDetails body) {
            createWebAppFirewallPolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateWebAppFirewallPolicyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateWebAppFirewallPolicyRequest
         */
        public CreateWebAppFirewallPolicyRequest buildWithoutInvocationCallback() {
            CreateWebAppFirewallPolicyRequest request = new CreateWebAppFirewallPolicyRequest();
            request.createWebAppFirewallPolicyDetails = createWebAppFirewallPolicyDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateWebAppFirewallPolicyRequest(createWebAppFirewallPolicyDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createWebAppFirewallPolicyDetails(createWebAppFirewallPolicyDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createWebAppFirewallPolicyDetails=")
                .append(String.valueOf(this.createWebAppFirewallPolicyDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateWebAppFirewallPolicyRequest)) {
            return false;
        }

        CreateWebAppFirewallPolicyRequest other = (CreateWebAppFirewallPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createWebAppFirewallPolicyDetails,
                        other.createWebAppFirewallPolicyDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createWebAppFirewallPolicyDetails == null
                                ? 43
                                : this.createWebAppFirewallPolicyDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
