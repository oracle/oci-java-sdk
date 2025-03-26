/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/PatchSqlFirewallAllowedSqlExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PatchSqlFirewallAllowedSqlRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class PatchSqlFirewallAllowedSqlRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.PatchSqlFirewallAllowedSqlDetails> {

    /**
     * The details used to patch the allowed sqls.
     */
    private com.oracle.bmc.datasafe.model.PatchSqlFirewallAllowedSqlDetails
            patchSqlFirewallAllowedSqlDetails;

    /**
     * The details used to patch the allowed sqls.
     */
    public com.oracle.bmc.datasafe.model.PatchSqlFirewallAllowedSqlDetails
            getPatchSqlFirewallAllowedSqlDetails() {
        return patchSqlFirewallAllowedSqlDetails;
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
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.PatchSqlFirewallAllowedSqlDetails getBody$() {
        return patchSqlFirewallAllowedSqlDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PatchSqlFirewallAllowedSqlRequest,
                    com.oracle.bmc.datasafe.model.PatchSqlFirewallAllowedSqlDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The details used to patch the allowed sqls.
         */
        private com.oracle.bmc.datasafe.model.PatchSqlFirewallAllowedSqlDetails
                patchSqlFirewallAllowedSqlDetails = null;

        /**
         * The details used to patch the allowed sqls.
         * @param patchSqlFirewallAllowedSqlDetails the value to set
         * @return this builder instance
         */
        public Builder patchSqlFirewallAllowedSqlDetails(
                com.oracle.bmc.datasafe.model.PatchSqlFirewallAllowedSqlDetails
                        patchSqlFirewallAllowedSqlDetails) {
            this.patchSqlFirewallAllowedSqlDetails = patchSqlFirewallAllowedSqlDetails;
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
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(PatchSqlFirewallAllowedSqlRequest o) {
            patchSqlFirewallAllowedSqlDetails(o.getPatchSqlFirewallAllowedSqlDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PatchSqlFirewallAllowedSqlRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PatchSqlFirewallAllowedSqlRequest
         */
        public PatchSqlFirewallAllowedSqlRequest build() {
            PatchSqlFirewallAllowedSqlRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.PatchSqlFirewallAllowedSqlDetails body) {
            patchSqlFirewallAllowedSqlDetails(body);
            return this;
        }

        /**
         * Build the instance of PatchSqlFirewallAllowedSqlRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PatchSqlFirewallAllowedSqlRequest
         */
        public PatchSqlFirewallAllowedSqlRequest buildWithoutInvocationCallback() {
            PatchSqlFirewallAllowedSqlRequest request = new PatchSqlFirewallAllowedSqlRequest();
            request.patchSqlFirewallAllowedSqlDetails = patchSqlFirewallAllowedSqlDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new PatchSqlFirewallAllowedSqlRequest(patchSqlFirewallAllowedSqlDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .patchSqlFirewallAllowedSqlDetails(patchSqlFirewallAllowedSqlDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",patchSqlFirewallAllowedSqlDetails=")
                .append(String.valueOf(this.patchSqlFirewallAllowedSqlDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchSqlFirewallAllowedSqlRequest)) {
            return false;
        }

        PatchSqlFirewallAllowedSqlRequest other = (PatchSqlFirewallAllowedSqlRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.patchSqlFirewallAllowedSqlDetails,
                        other.patchSqlFirewallAllowedSqlDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.patchSqlFirewallAllowedSqlDetails == null
                                ? 43
                                : this.patchSqlFirewallAllowedSqlDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
