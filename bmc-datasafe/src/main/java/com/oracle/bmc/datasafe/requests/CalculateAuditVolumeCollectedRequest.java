/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CalculateAuditVolumeCollectedExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CalculateAuditVolumeCollectedRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class CalculateAuditVolumeCollectedRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.CalculateAuditVolumeCollectedDetails> {

    /**
     * The OCID of the audit.
     */
    private String auditProfileId;

    public String getAuditProfileId() {
        return auditProfileId;
    }
    /**
     * Details for the calculation of audit volume collected by data safe.
     */
    private com.oracle.bmc.datasafe.model.CalculateAuditVolumeCollectedDetails
            calculateAuditVolumeCollectedDetails;

    public com.oracle.bmc.datasafe.model.CalculateAuditVolumeCollectedDetails
            getCalculateAuditVolumeCollectedDetails() {
        return calculateAuditVolumeCollectedDetails;
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

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.CalculateAuditVolumeCollectedDetails getBody$() {
        return calculateAuditVolumeCollectedDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CalculateAuditVolumeCollectedRequest,
                    com.oracle.bmc.datasafe.model.CalculateAuditVolumeCollectedDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String auditProfileId = null;

        /**
         * The OCID of the audit.
         * @return this builder instance
         */
        public Builder auditProfileId(String auditProfileId) {
            this.auditProfileId = auditProfileId;
            return this;
        }

        private com.oracle.bmc.datasafe.model.CalculateAuditVolumeCollectedDetails
                calculateAuditVolumeCollectedDetails = null;

        /**
         * Details for the calculation of audit volume collected by data safe.
         * @return this builder instance
         */
        public Builder calculateAuditVolumeCollectedDetails(
                com.oracle.bmc.datasafe.model.CalculateAuditVolumeCollectedDetails
                        calculateAuditVolumeCollectedDetails) {
            this.calculateAuditVolumeCollectedDetails = calculateAuditVolumeCollectedDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(CalculateAuditVolumeCollectedRequest o) {
            auditProfileId(o.getAuditProfileId());
            calculateAuditVolumeCollectedDetails(o.getCalculateAuditVolumeCollectedDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CalculateAuditVolumeCollectedRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CalculateAuditVolumeCollectedRequest
         */
        public CalculateAuditVolumeCollectedRequest build() {
            CalculateAuditVolumeCollectedRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.datasafe.model.CalculateAuditVolumeCollectedDetails body) {
            calculateAuditVolumeCollectedDetails(body);
            return this;
        }

        /**
         * Build the instance of CalculateAuditVolumeCollectedRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CalculateAuditVolumeCollectedRequest
         */
        public CalculateAuditVolumeCollectedRequest buildWithoutInvocationCallback() {
            CalculateAuditVolumeCollectedRequest request =
                    new CalculateAuditVolumeCollectedRequest();
            request.auditProfileId = auditProfileId;
            request.calculateAuditVolumeCollectedDetails = calculateAuditVolumeCollectedDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CalculateAuditVolumeCollectedRequest(auditProfileId, calculateAuditVolumeCollectedDetails, ifMatch, opcRetryToken, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .auditProfileId(auditProfileId)
                .calculateAuditVolumeCollectedDetails(calculateAuditVolumeCollectedDetails)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",auditProfileId=").append(String.valueOf(this.auditProfileId));
        sb.append(",calculateAuditVolumeCollectedDetails=")
                .append(String.valueOf(this.calculateAuditVolumeCollectedDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
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
        if (!(o instanceof CalculateAuditVolumeCollectedRequest)) {
            return false;
        }

        CalculateAuditVolumeCollectedRequest other = (CalculateAuditVolumeCollectedRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.auditProfileId, other.auditProfileId)
                && java.util.Objects.equals(
                        this.calculateAuditVolumeCollectedDetails,
                        other.calculateAuditVolumeCollectedDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.auditProfileId == null ? 43 : this.auditProfileId.hashCode());
        result =
                (result * PRIME)
                        + (this.calculateAuditVolumeCollectedDetails == null
                                ? 43
                                : this.calculateAuditVolumeCollectedDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
