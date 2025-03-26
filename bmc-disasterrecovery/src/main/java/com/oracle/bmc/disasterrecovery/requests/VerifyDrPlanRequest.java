/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.requests;

import com.oracle.bmc.disasterrecovery.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/VerifyDrPlanExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use VerifyDrPlanRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class VerifyDrPlanRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.disasterrecovery.model.VerifyDrPlanDetails> {

    /**
     * Details for verifying a DR plan.
     */
    private com.oracle.bmc.disasterrecovery.model.VerifyDrPlanDetails verifyDrPlanDetails;

    /**
     * Details for verifying a DR plan.
     */
    public com.oracle.bmc.disasterrecovery.model.VerifyDrPlanDetails getVerifyDrPlanDetails() {
        return verifyDrPlanDetails;
    }
    /**
     * The OCID of the DR plan.
     * <p>
     * Example: {@code ocid1.drplan.oc1..uniqueID}
     *
     */
    private String drPlanId;

    /**
     * The OCID of the DR plan.
     * <p>
     * Example: {@code ocid1.drplan.oc1..uniqueID}
     *
     */
    public String getDrPlanId() {
        return drPlanId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The client request ID for tracing.
     *
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
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
    public com.oracle.bmc.disasterrecovery.model.VerifyDrPlanDetails getBody$() {
        return verifyDrPlanDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    VerifyDrPlanRequest,
                    com.oracle.bmc.disasterrecovery.model.VerifyDrPlanDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details for verifying a DR plan.
         */
        private com.oracle.bmc.disasterrecovery.model.VerifyDrPlanDetails verifyDrPlanDetails =
                null;

        /**
         * Details for verifying a DR plan.
         * @param verifyDrPlanDetails the value to set
         * @return this builder instance
         */
        public Builder verifyDrPlanDetails(
                com.oracle.bmc.disasterrecovery.model.VerifyDrPlanDetails verifyDrPlanDetails) {
            this.verifyDrPlanDetails = verifyDrPlanDetails;
            return this;
        }

        /**
         * The OCID of the DR plan.
         * <p>
         * Example: {@code ocid1.drplan.oc1..uniqueID}
         *
         */
        private String drPlanId = null;

        /**
         * The OCID of the DR plan.
         * <p>
         * Example: {@code ocid1.drplan.oc1..uniqueID}
         *
         * @param drPlanId the value to set
         * @return this builder instance
         */
        public Builder drPlanId(String drPlanId) {
            this.drPlanId = drPlanId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
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
         * The client request ID for tracing.
         *
         */
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
        public Builder copy(VerifyDrPlanRequest o) {
            verifyDrPlanDetails(o.getVerifyDrPlanDetails());
            drPlanId(o.getDrPlanId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of VerifyDrPlanRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of VerifyDrPlanRequest
         */
        public VerifyDrPlanRequest build() {
            VerifyDrPlanRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.disasterrecovery.model.VerifyDrPlanDetails body) {
            verifyDrPlanDetails(body);
            return this;
        }

        /**
         * Build the instance of VerifyDrPlanRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of VerifyDrPlanRequest
         */
        public VerifyDrPlanRequest buildWithoutInvocationCallback() {
            VerifyDrPlanRequest request = new VerifyDrPlanRequest();
            request.verifyDrPlanDetails = verifyDrPlanDetails;
            request.drPlanId = drPlanId;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new VerifyDrPlanRequest(verifyDrPlanDetails, drPlanId, ifMatch, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .verifyDrPlanDetails(verifyDrPlanDetails)
                .drPlanId(drPlanId)
                .ifMatch(ifMatch)
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
        sb.append(",verifyDrPlanDetails=").append(String.valueOf(this.verifyDrPlanDetails));
        sb.append(",drPlanId=").append(String.valueOf(this.drPlanId));
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
        if (!(o instanceof VerifyDrPlanRequest)) {
            return false;
        }

        VerifyDrPlanRequest other = (VerifyDrPlanRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.verifyDrPlanDetails, other.verifyDrPlanDetails)
                && java.util.Objects.equals(this.drPlanId, other.drPlanId)
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
                        + (this.verifyDrPlanDetails == null
                                ? 43
                                : this.verifyDrPlanDetails.hashCode());
        result = (result * PRIME) + (this.drPlanId == null ? 43 : this.drPlanId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
