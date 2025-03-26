/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute.requests;

import com.oracle.bmc.securityattribute.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/securityattribute/BulkEditSecurityAttributesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use BulkEditSecurityAttributesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
public class BulkEditSecurityAttributesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.securityattribute.model.BulkEditSecurityAttributeDetails> {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and removed from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and removed from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The request object for bulk editing security attributes on resources in the compartment.
     */
    private com.oracle.bmc.securityattribute.model.BulkEditSecurityAttributeDetails
            bulkEditSecurityAttributeDetails;

    /**
     * The request object for bulk editing security attributes on resources in the compartment.
     */
    public com.oracle.bmc.securityattribute.model.BulkEditSecurityAttributeDetails
            getBulkEditSecurityAttributeDetails() {
        return bulkEditSecurityAttributeDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.securityattribute.model.BulkEditSecurityAttributeDetails getBody$() {
        return bulkEditSecurityAttributeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BulkEditSecurityAttributesRequest,
                    com.oracle.bmc.securityattribute.model.BulkEditSecurityAttributeDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
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
         * server error without risk of running that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and removed from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of running that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and removed from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * The request object for bulk editing security attributes on resources in the compartment.
         */
        private com.oracle.bmc.securityattribute.model.BulkEditSecurityAttributeDetails
                bulkEditSecurityAttributeDetails = null;

        /**
         * The request object for bulk editing security attributes on resources in the compartment.
         * @param bulkEditSecurityAttributeDetails the value to set
         * @return this builder instance
         */
        public Builder bulkEditSecurityAttributeDetails(
                com.oracle.bmc.securityattribute.model.BulkEditSecurityAttributeDetails
                        bulkEditSecurityAttributeDetails) {
            this.bulkEditSecurityAttributeDetails = bulkEditSecurityAttributeDetails;
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
        public Builder copy(BulkEditSecurityAttributesRequest o) {
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            bulkEditSecurityAttributeDetails(o.getBulkEditSecurityAttributeDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BulkEditSecurityAttributesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of BulkEditSecurityAttributesRequest
         */
        public BulkEditSecurityAttributesRequest build() {
            BulkEditSecurityAttributesRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.securityattribute.model.BulkEditSecurityAttributeDetails body) {
            bulkEditSecurityAttributeDetails(body);
            return this;
        }

        /**
         * Build the instance of BulkEditSecurityAttributesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BulkEditSecurityAttributesRequest
         */
        public BulkEditSecurityAttributesRequest buildWithoutInvocationCallback() {
            BulkEditSecurityAttributesRequest request = new BulkEditSecurityAttributesRequest();
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.bulkEditSecurityAttributeDetails = bulkEditSecurityAttributeDetails;
            return request;
            // new BulkEditSecurityAttributesRequest(opcRequestId, opcRetryToken, bulkEditSecurityAttributeDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .bulkEditSecurityAttributeDetails(bulkEditSecurityAttributeDetails);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",bulkEditSecurityAttributeDetails=")
                .append(String.valueOf(this.bulkEditSecurityAttributeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkEditSecurityAttributesRequest)) {
            return false;
        }

        BulkEditSecurityAttributesRequest other = (BulkEditSecurityAttributesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(
                        this.bulkEditSecurityAttributeDetails,
                        other.bulkEditSecurityAttributeDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkEditSecurityAttributeDetails == null
                                ? 43
                                : this.bulkEditSecurityAttributeDetails.hashCode());
        return result;
    }
}
