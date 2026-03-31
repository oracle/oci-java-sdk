/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease.requests;

import com.oracle.bmc.limitsincrease.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/CancelLimitsIncreaseRequestExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CancelLimitsIncreaseRequestRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class CancelLimitsIncreaseRequestRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * Idempotency token to make sure that a second create operation won't fail if the first one succeeded.
     * This can be any random string.
     *
     */
    private String opcRetryToken;

    /**
     * Idempotency token to make sure that a second create operation won't fail if the first one succeeded.
     * This can be any random string.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CancelLimitsIncreaseRequestRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
         * Idempotency token to make sure that a second create operation won't fail if the first one succeeded.
         * This can be any random string.
         *
         */
        private String opcRetryToken = null;

        /**
         * Idempotency token to make sure that a second create operation won't fail if the first one succeeded.
         * This can be any random string.
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
        public Builder copy(CancelLimitsIncreaseRequestRequest o) {
            limitsIncreaseRequestId(o.getLimitsIncreaseRequestId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CancelLimitsIncreaseRequestRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CancelLimitsIncreaseRequestRequest
         */
        public CancelLimitsIncreaseRequestRequest build() {
            CancelLimitsIncreaseRequestRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of CancelLimitsIncreaseRequestRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CancelLimitsIncreaseRequestRequest
         */
        public CancelLimitsIncreaseRequestRequest buildWithoutInvocationCallback() {
            CancelLimitsIncreaseRequestRequest request = new CancelLimitsIncreaseRequestRequest();
            request.limitsIncreaseRequestId = limitsIncreaseRequestId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CancelLimitsIncreaseRequestRequest(limitsIncreaseRequestId, opcRequestId, ifMatch, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .limitsIncreaseRequestId(limitsIncreaseRequestId)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",limitsIncreaseRequestId=").append(String.valueOf(this.limitsIncreaseRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CancelLimitsIncreaseRequestRequest)) {
            return false;
        }

        CancelLimitsIncreaseRequestRequest other = (CancelLimitsIncreaseRequestRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.limitsIncreaseRequestId, other.limitsIncreaseRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.limitsIncreaseRequestId == null
                                ? 43
                                : this.limitsIncreaseRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
