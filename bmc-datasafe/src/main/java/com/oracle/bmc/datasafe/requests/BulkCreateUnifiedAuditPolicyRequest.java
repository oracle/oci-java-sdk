/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/BulkCreateUnifiedAuditPolicyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * BulkCreateUnifiedAuditPolicyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class BulkCreateUnifiedAuditPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.BulkCreateUnifiedAuditPolicyDetails> {

    /** Details for the compartment move. */
    private com.oracle.bmc.datasafe.model.BulkCreateUnifiedAuditPolicyDetails
            bulkCreateUnifiedAuditPolicyDetails;

    /** Details for the compartment move. */
    public com.oracle.bmc.datasafe.model.BulkCreateUnifiedAuditPolicyDetails
            getBulkCreateUnifiedAuditPolicyDetails() {
        return bulkCreateUnifiedAuditPolicyDetails;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.BulkCreateUnifiedAuditPolicyDetails getBody$() {
        return bulkCreateUnifiedAuditPolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BulkCreateUnifiedAuditPolicyRequest,
                    com.oracle.bmc.datasafe.model.BulkCreateUnifiedAuditPolicyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for the compartment move. */
        private com.oracle.bmc.datasafe.model.BulkCreateUnifiedAuditPolicyDetails
                bulkCreateUnifiedAuditPolicyDetails = null;

        /**
         * Details for the compartment move.
         *
         * @param bulkCreateUnifiedAuditPolicyDetails the value to set
         * @return this builder instance
         */
        public Builder bulkCreateUnifiedAuditPolicyDetails(
                com.oracle.bmc.datasafe.model.BulkCreateUnifiedAuditPolicyDetails
                        bulkCreateUnifiedAuditPolicyDetails) {
            this.bulkCreateUnifiedAuditPolicyDetails = bulkCreateUnifiedAuditPolicyDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(BulkCreateUnifiedAuditPolicyRequest o) {
            bulkCreateUnifiedAuditPolicyDetails(o.getBulkCreateUnifiedAuditPolicyDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BulkCreateUnifiedAuditPolicyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of BulkCreateUnifiedAuditPolicyRequest
         */
        public BulkCreateUnifiedAuditPolicyRequest build() {
            BulkCreateUnifiedAuditPolicyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.datasafe.model.BulkCreateUnifiedAuditPolicyDetails body) {
            bulkCreateUnifiedAuditPolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of BulkCreateUnifiedAuditPolicyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BulkCreateUnifiedAuditPolicyRequest
         */
        public BulkCreateUnifiedAuditPolicyRequest buildWithoutInvocationCallback() {
            BulkCreateUnifiedAuditPolicyRequest request = new BulkCreateUnifiedAuditPolicyRequest();
            request.bulkCreateUnifiedAuditPolicyDetails = bulkCreateUnifiedAuditPolicyDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new BulkCreateUnifiedAuditPolicyRequest(bulkCreateUnifiedAuditPolicyDetails,
            // opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bulkCreateUnifiedAuditPolicyDetails(bulkCreateUnifiedAuditPolicyDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",bulkCreateUnifiedAuditPolicyDetails=")
                .append(String.valueOf(this.bulkCreateUnifiedAuditPolicyDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkCreateUnifiedAuditPolicyRequest)) {
            return false;
        }

        BulkCreateUnifiedAuditPolicyRequest other = (BulkCreateUnifiedAuditPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.bulkCreateUnifiedAuditPolicyDetails,
                        other.bulkCreateUnifiedAuditPolicyDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bulkCreateUnifiedAuditPolicyDetails == null
                                ? 43
                                : this.bulkCreateUnifiedAuditPolicyDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
