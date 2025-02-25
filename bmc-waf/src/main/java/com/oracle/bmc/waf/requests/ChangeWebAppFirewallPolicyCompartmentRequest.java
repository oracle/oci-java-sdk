/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.requests;

import com.oracle.bmc.waf.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waf/ChangeWebAppFirewallPolicyCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeWebAppFirewallPolicyCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public class ChangeWebAppFirewallPolicyCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.waf.model.ChangeWebAppFirewallPolicyCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WebAppFirewallPolicy.
     */
    private String webAppFirewallPolicyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WebAppFirewallPolicy.
     */
    public String getWebAppFirewallPolicyId() {
        return webAppFirewallPolicyId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.waf.model.ChangeWebAppFirewallPolicyCompartmentDetails
            changeWebAppFirewallPolicyCompartmentDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.waf.model.ChangeWebAppFirewallPolicyCompartmentDetails
            getChangeWebAppFirewallPolicyCompartmentDetails() {
        return changeWebAppFirewallPolicyCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
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
    public com.oracle.bmc.waf.model.ChangeWebAppFirewallPolicyCompartmentDetails getBody$() {
        return changeWebAppFirewallPolicyCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeWebAppFirewallPolicyCompartmentRequest,
                    com.oracle.bmc.waf.model.ChangeWebAppFirewallPolicyCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WebAppFirewallPolicy.
         */
        private String webAppFirewallPolicyId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WebAppFirewallPolicy.
         * @param webAppFirewallPolicyId the value to set
         * @return this builder instance
         */
        public Builder webAppFirewallPolicyId(String webAppFirewallPolicyId) {
            this.webAppFirewallPolicyId = webAppFirewallPolicyId;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.waf.model.ChangeWebAppFirewallPolicyCompartmentDetails
                changeWebAppFirewallPolicyCompartmentDetails = null;

        /**
         * The information to be updated.
         * @param changeWebAppFirewallPolicyCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeWebAppFirewallPolicyCompartmentDetails(
                com.oracle.bmc.waf.model.ChangeWebAppFirewallPolicyCompartmentDetails
                        changeWebAppFirewallPolicyCompartmentDetails) {
            this.changeWebAppFirewallPolicyCompartmentDetails =
                    changeWebAppFirewallPolicyCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource,
         * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource,
         * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(ChangeWebAppFirewallPolicyCompartmentRequest o) {
            webAppFirewallPolicyId(o.getWebAppFirewallPolicyId());
            changeWebAppFirewallPolicyCompartmentDetails(
                    o.getChangeWebAppFirewallPolicyCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeWebAppFirewallPolicyCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeWebAppFirewallPolicyCompartmentRequest
         */
        public ChangeWebAppFirewallPolicyCompartmentRequest build() {
            ChangeWebAppFirewallPolicyCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.waf.model.ChangeWebAppFirewallPolicyCompartmentDetails body) {
            changeWebAppFirewallPolicyCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeWebAppFirewallPolicyCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeWebAppFirewallPolicyCompartmentRequest
         */
        public ChangeWebAppFirewallPolicyCompartmentRequest buildWithoutInvocationCallback() {
            ChangeWebAppFirewallPolicyCompartmentRequest request =
                    new ChangeWebAppFirewallPolicyCompartmentRequest();
            request.webAppFirewallPolicyId = webAppFirewallPolicyId;
            request.changeWebAppFirewallPolicyCompartmentDetails =
                    changeWebAppFirewallPolicyCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeWebAppFirewallPolicyCompartmentRequest(webAppFirewallPolicyId, changeWebAppFirewallPolicyCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .webAppFirewallPolicyId(webAppFirewallPolicyId)
                .changeWebAppFirewallPolicyCompartmentDetails(
                        changeWebAppFirewallPolicyCompartmentDetails)
                .ifMatch(ifMatch)
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
        sb.append(",webAppFirewallPolicyId=").append(String.valueOf(this.webAppFirewallPolicyId));
        sb.append(",changeWebAppFirewallPolicyCompartmentDetails=")
                .append(String.valueOf(this.changeWebAppFirewallPolicyCompartmentDetails));
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
        if (!(o instanceof ChangeWebAppFirewallPolicyCompartmentRequest)) {
            return false;
        }

        ChangeWebAppFirewallPolicyCompartmentRequest other =
                (ChangeWebAppFirewallPolicyCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.webAppFirewallPolicyId, other.webAppFirewallPolicyId)
                && java.util.Objects.equals(
                        this.changeWebAppFirewallPolicyCompartmentDetails,
                        other.changeWebAppFirewallPolicyCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.webAppFirewallPolicyId == null
                                ? 43
                                : this.webAppFirewallPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeWebAppFirewallPolicyCompartmentDetails == null
                                ? 43
                                : this.changeWebAppFirewallPolicyCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
