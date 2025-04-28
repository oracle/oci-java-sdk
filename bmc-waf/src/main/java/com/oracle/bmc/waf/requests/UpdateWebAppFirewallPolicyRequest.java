/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.requests;

import com.oracle.bmc.waf.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waf/UpdateWebAppFirewallPolicyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateWebAppFirewallPolicyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public class UpdateWebAppFirewallPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.waf.model.UpdateWebAppFirewallPolicyDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * WebAppFirewallPolicy.
     */
    private String webAppFirewallPolicyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * WebAppFirewallPolicy.
     */
    public String getWebAppFirewallPolicyId() {
        return webAppFirewallPolicyId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.waf.model.UpdateWebAppFirewallPolicyDetails
            updateWebAppFirewallPolicyDetails;

    /** The information to be updated. */
    public com.oracle.bmc.waf.model.UpdateWebAppFirewallPolicyDetails
            getUpdateWebAppFirewallPolicyDetails() {
        return updateWebAppFirewallPolicyDetails;
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
    public com.oracle.bmc.waf.model.UpdateWebAppFirewallPolicyDetails getBody$() {
        return updateWebAppFirewallPolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateWebAppFirewallPolicyRequest,
                    com.oracle.bmc.waf.model.UpdateWebAppFirewallPolicyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * WebAppFirewallPolicy.
         */
        private String webAppFirewallPolicyId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * WebAppFirewallPolicy.
         *
         * @param webAppFirewallPolicyId the value to set
         * @return this builder instance
         */
        public Builder webAppFirewallPolicyId(String webAppFirewallPolicyId) {
            this.webAppFirewallPolicyId = webAppFirewallPolicyId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.waf.model.UpdateWebAppFirewallPolicyDetails
                updateWebAppFirewallPolicyDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateWebAppFirewallPolicyDetails the value to set
         * @return this builder instance
         */
        public Builder updateWebAppFirewallPolicyDetails(
                com.oracle.bmc.waf.model.UpdateWebAppFirewallPolicyDetails
                        updateWebAppFirewallPolicyDetails) {
            this.updateWebAppFirewallPolicyDetails = updateWebAppFirewallPolicyDetails;
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
        public Builder copy(UpdateWebAppFirewallPolicyRequest o) {
            webAppFirewallPolicyId(o.getWebAppFirewallPolicyId());
            updateWebAppFirewallPolicyDetails(o.getUpdateWebAppFirewallPolicyDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateWebAppFirewallPolicyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateWebAppFirewallPolicyRequest
         */
        public UpdateWebAppFirewallPolicyRequest build() {
            UpdateWebAppFirewallPolicyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.waf.model.UpdateWebAppFirewallPolicyDetails body) {
            updateWebAppFirewallPolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateWebAppFirewallPolicyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateWebAppFirewallPolicyRequest
         */
        public UpdateWebAppFirewallPolicyRequest buildWithoutInvocationCallback() {
            UpdateWebAppFirewallPolicyRequest request = new UpdateWebAppFirewallPolicyRequest();
            request.webAppFirewallPolicyId = webAppFirewallPolicyId;
            request.updateWebAppFirewallPolicyDetails = updateWebAppFirewallPolicyDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateWebAppFirewallPolicyRequest(webAppFirewallPolicyId,
            // updateWebAppFirewallPolicyDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .webAppFirewallPolicyId(webAppFirewallPolicyId)
                .updateWebAppFirewallPolicyDetails(updateWebAppFirewallPolicyDetails)
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
        sb.append(",webAppFirewallPolicyId=").append(String.valueOf(this.webAppFirewallPolicyId));
        sb.append(",updateWebAppFirewallPolicyDetails=")
                .append(String.valueOf(this.updateWebAppFirewallPolicyDetails));
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
        if (!(o instanceof UpdateWebAppFirewallPolicyRequest)) {
            return false;
        }

        UpdateWebAppFirewallPolicyRequest other = (UpdateWebAppFirewallPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.webAppFirewallPolicyId, other.webAppFirewallPolicyId)
                && java.util.Objects.equals(
                        this.updateWebAppFirewallPolicyDetails,
                        other.updateWebAppFirewallPolicyDetails)
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
                        + (this.updateWebAppFirewallPolicyDetails == null
                                ? 43
                                : this.updateWebAppFirewallPolicyDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
