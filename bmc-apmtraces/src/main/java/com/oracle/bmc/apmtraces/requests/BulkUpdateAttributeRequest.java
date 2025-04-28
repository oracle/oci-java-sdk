/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.requests;

import com.oracle.bmc.apmtraces.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/BulkUpdateAttributeExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use BulkUpdateAttributeRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class BulkUpdateAttributeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apmtraces.model.BulkUpdateAttributeDetails> {

    /** The APM Domain ID for the intended request. */
    private String apmDomainId;

    /** The APM Domain ID for the intended request. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /**
     * Request body containing the details about the set of attributes for which properties are to
     * be updated.
     */
    private com.oracle.bmc.apmtraces.model.BulkUpdateAttributeDetails bulkUpdateAttributeDetails;

    /**
     * Request body containing the details about the set of attributes for which properties are to
     * be updated.
     */
    public com.oracle.bmc.apmtraces.model.BulkUpdateAttributeDetails
            getBulkUpdateAttributeDetails() {
        return bulkUpdateAttributeDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
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
    public com.oracle.bmc.apmtraces.model.BulkUpdateAttributeDetails getBody$() {
        return bulkUpdateAttributeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BulkUpdateAttributeRequest,
                    com.oracle.bmc.apmtraces.model.BulkUpdateAttributeDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The APM Domain ID for the intended request. */
        private String apmDomainId = null;

        /**
         * The APM Domain ID for the intended request.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /**
         * Request body containing the details about the set of attributes for which properties are
         * to be updated.
         */
        private com.oracle.bmc.apmtraces.model.BulkUpdateAttributeDetails
                bulkUpdateAttributeDetails = null;

        /**
         * Request body containing the details about the set of attributes for which properties are
         * to be updated.
         *
         * @param bulkUpdateAttributeDetails the value to set
         * @return this builder instance
         */
        public Builder bulkUpdateAttributeDetails(
                com.oracle.bmc.apmtraces.model.BulkUpdateAttributeDetails
                        bulkUpdateAttributeDetails) {
            this.bulkUpdateAttributeDetails = bulkUpdateAttributeDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
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
        public Builder copy(BulkUpdateAttributeRequest o) {
            apmDomainId(o.getApmDomainId());
            bulkUpdateAttributeDetails(o.getBulkUpdateAttributeDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BulkUpdateAttributeRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of BulkUpdateAttributeRequest
         */
        public BulkUpdateAttributeRequest build() {
            BulkUpdateAttributeRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.apmtraces.model.BulkUpdateAttributeDetails body) {
            bulkUpdateAttributeDetails(body);
            return this;
        }

        /**
         * Build the instance of BulkUpdateAttributeRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BulkUpdateAttributeRequest
         */
        public BulkUpdateAttributeRequest buildWithoutInvocationCallback() {
            BulkUpdateAttributeRequest request = new BulkUpdateAttributeRequest();
            request.apmDomainId = apmDomainId;
            request.bulkUpdateAttributeDetails = bulkUpdateAttributeDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new BulkUpdateAttributeRequest(apmDomainId, bulkUpdateAttributeDetails,
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
                .apmDomainId(apmDomainId)
                .bulkUpdateAttributeDetails(bulkUpdateAttributeDetails)
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",bulkUpdateAttributeDetails=")
                .append(String.valueOf(this.bulkUpdateAttributeDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUpdateAttributeRequest)) {
            return false;
        }

        BulkUpdateAttributeRequest other = (BulkUpdateAttributeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(
                        this.bulkUpdateAttributeDetails, other.bulkUpdateAttributeDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkUpdateAttributeDetails == null
                                ? 43
                                : this.bulkUpdateAttributeDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
