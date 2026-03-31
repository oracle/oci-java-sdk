/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease.requests;

import com.oracle.bmc.limitsincrease.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/UpdateLimitsIncreaseRequestExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateLimitsIncreaseRequestRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class UpdateLimitsIncreaseRequestRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.limitsincrease.model.UpdateLimitsIncreaseRequestDetails> {

    /**
     * Details for updating Limits Increase request
     */
    private com.oracle.bmc.limitsincrease.model.UpdateLimitsIncreaseRequestDetails
            updateLimitsIncreaseRequestDetails;

    /**
     * Details for updating Limits Increase request
     */
    public com.oracle.bmc.limitsincrease.model.UpdateLimitsIncreaseRequestDetails
            getUpdateLimitsIncreaseRequestDetails() {
        return updateLimitsIncreaseRequestDetails;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase request.
     */
    private String limitsIncreaseRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase request.
     */
    public String getLimitsIncreaseRequestId() {
        return limitsIncreaseRequestId;
    }
    /**
     * Override request id for request tracking purposes.
     */
    private String opcRequestId;

    /**
     * Override request id for request tracking purposes.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * This value (etag) should be passed when you want to ensure that no-one else has changed the value while you're making
     * an update. To get the current etag, make a GET call and read the current etag header.
     * If GET returns 404, and you still want to ensure that noone else has executed a SET operation, pass the following
     * header instead: {@code if-none-match: *}
     *
     */
    private String ifMatch;

    /**
     * This value (etag) should be passed when you want to ensure that no-one else has changed the value while you're making
     * an update. To get the current etag, make a GET call and read the current etag header.
     * If GET returns 404, and you still want to ensure that noone else has executed a SET operation, pass the following
     * header instead: {@code if-none-match: *}
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
    public com.oracle.bmc.limitsincrease.model.UpdateLimitsIncreaseRequestDetails getBody$() {
        return updateLimitsIncreaseRequestDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateLimitsIncreaseRequestRequest,
                    com.oracle.bmc.limitsincrease.model.UpdateLimitsIncreaseRequestDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details for updating Limits Increase request
         */
        private com.oracle.bmc.limitsincrease.model.UpdateLimitsIncreaseRequestDetails
                updateLimitsIncreaseRequestDetails = null;

        /**
         * Details for updating Limits Increase request
         * @param updateLimitsIncreaseRequestDetails the value to set
         * @return this builder instance
         */
        public Builder updateLimitsIncreaseRequestDetails(
                com.oracle.bmc.limitsincrease.model.UpdateLimitsIncreaseRequestDetails
                        updateLimitsIncreaseRequestDetails) {
            this.updateLimitsIncreaseRequestDetails = updateLimitsIncreaseRequestDetails;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase request.
         */
        private String limitsIncreaseRequestId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase request.
         * @param limitsIncreaseRequestId the value to set
         * @return this builder instance
         */
        public Builder limitsIncreaseRequestId(String limitsIncreaseRequestId) {
            this.limitsIncreaseRequestId = limitsIncreaseRequestId;
            return this;
        }

        /**
         * Override request id for request tracking purposes.
         */
        private String opcRequestId = null;

        /**
         * Override request id for request tracking purposes.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * This value (etag) should be passed when you want to ensure that no-one else has changed the value while you're making
         * an update. To get the current etag, make a GET call and read the current etag header.
         * If GET returns 404, and you still want to ensure that noone else has executed a SET operation, pass the following
         * header instead: {@code if-none-match: *}
         *
         */
        private String ifMatch = null;

        /**
         * This value (etag) should be passed when you want to ensure that no-one else has changed the value while you're making
         * an update. To get the current etag, make a GET call and read the current etag header.
         * If GET returns 404, and you still want to ensure that noone else has executed a SET operation, pass the following
         * header instead: {@code if-none-match: *}
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
        public Builder copy(UpdateLimitsIncreaseRequestRequest o) {
            updateLimitsIncreaseRequestDetails(o.getUpdateLimitsIncreaseRequestDetails());
            limitsIncreaseRequestId(o.getLimitsIncreaseRequestId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateLimitsIncreaseRequestRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateLimitsIncreaseRequestRequest
         */
        public UpdateLimitsIncreaseRequestRequest build() {
            UpdateLimitsIncreaseRequestRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.limitsincrease.model.UpdateLimitsIncreaseRequestDetails body) {
            updateLimitsIncreaseRequestDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateLimitsIncreaseRequestRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateLimitsIncreaseRequestRequest
         */
        public UpdateLimitsIncreaseRequestRequest buildWithoutInvocationCallback() {
            UpdateLimitsIncreaseRequestRequest request = new UpdateLimitsIncreaseRequestRequest();
            request.updateLimitsIncreaseRequestDetails = updateLimitsIncreaseRequestDetails;
            request.limitsIncreaseRequestId = limitsIncreaseRequestId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateLimitsIncreaseRequestRequest(updateLimitsIncreaseRequestDetails, limitsIncreaseRequestId, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateLimitsIncreaseRequestDetails(updateLimitsIncreaseRequestDetails)
                .limitsIncreaseRequestId(limitsIncreaseRequestId)
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
        sb.append(",updateLimitsIncreaseRequestDetails=")
                .append(String.valueOf(this.updateLimitsIncreaseRequestDetails));
        sb.append(",limitsIncreaseRequestId=").append(String.valueOf(this.limitsIncreaseRequestId));
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
        if (!(o instanceof UpdateLimitsIncreaseRequestRequest)) {
            return false;
        }

        UpdateLimitsIncreaseRequestRequest other = (UpdateLimitsIncreaseRequestRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateLimitsIncreaseRequestDetails,
                        other.updateLimitsIncreaseRequestDetails)
                && java.util.Objects.equals(
                        this.limitsIncreaseRequestId, other.limitsIncreaseRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateLimitsIncreaseRequestDetails == null
                                ? 43
                                : this.updateLimitsIncreaseRequestDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.limitsIncreaseRequestId == null
                                ? 43
                                : this.limitsIncreaseRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
