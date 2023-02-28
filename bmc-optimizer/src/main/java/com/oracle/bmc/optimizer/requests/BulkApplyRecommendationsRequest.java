/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.requests;

import com.oracle.bmc.optimizer.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/optimizer/BulkApplyRecommendationsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * BulkApplyRecommendationsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
public class BulkApplyRecommendationsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.optimizer.model.BulkApplyRecommendationsDetails> {

    /** The unique OCID associated with the recommendation. */
    private String recommendationId;

    /** The unique OCID associated with the recommendation. */
    public String getRecommendationId() {
        return recommendationId;
    }
    /** Details about bulk recommendation actions. */
    private com.oracle.bmc.optimizer.model.BulkApplyRecommendationsDetails
            bulkApplyRecommendationsDetails;

    /** Details about bulk recommendation actions. */
    public com.oracle.bmc.optimizer.model.BulkApplyRecommendationsDetails
            getBulkApplyRecommendationsDetails() {
        return bulkApplyRecommendationsDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
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
    public com.oracle.bmc.optimizer.model.BulkApplyRecommendationsDetails getBody$() {
        return bulkApplyRecommendationsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BulkApplyRecommendationsRequest,
                    com.oracle.bmc.optimizer.model.BulkApplyRecommendationsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique OCID associated with the recommendation. */
        private String recommendationId = null;

        /**
         * The unique OCID associated with the recommendation.
         *
         * @param recommendationId the value to set
         * @return this builder instance
         */
        public Builder recommendationId(String recommendationId) {
            this.recommendationId = recommendationId;
            return this;
        }

        /** Details about bulk recommendation actions. */
        private com.oracle.bmc.optimizer.model.BulkApplyRecommendationsDetails
                bulkApplyRecommendationsDetails = null;

        /**
         * Details about bulk recommendation actions.
         *
         * @param bulkApplyRecommendationsDetails the value to set
         * @return this builder instance
         */
        public Builder bulkApplyRecommendationsDetails(
                com.oracle.bmc.optimizer.model.BulkApplyRecommendationsDetails
                        bulkApplyRecommendationsDetails) {
            this.bulkApplyRecommendationsDetails = bulkApplyRecommendationsDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
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
        public Builder copy(BulkApplyRecommendationsRequest o) {
            recommendationId(o.getRecommendationId());
            bulkApplyRecommendationsDetails(o.getBulkApplyRecommendationsDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BulkApplyRecommendationsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of BulkApplyRecommendationsRequest
         */
        public BulkApplyRecommendationsRequest build() {
            BulkApplyRecommendationsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.optimizer.model.BulkApplyRecommendationsDetails body) {
            bulkApplyRecommendationsDetails(body);
            return this;
        }

        /**
         * Build the instance of BulkApplyRecommendationsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BulkApplyRecommendationsRequest
         */
        public BulkApplyRecommendationsRequest buildWithoutInvocationCallback() {
            BulkApplyRecommendationsRequest request = new BulkApplyRecommendationsRequest();
            request.recommendationId = recommendationId;
            request.bulkApplyRecommendationsDetails = bulkApplyRecommendationsDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new BulkApplyRecommendationsRequest(recommendationId,
            // bulkApplyRecommendationsDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .recommendationId(recommendationId)
                .bulkApplyRecommendationsDetails(bulkApplyRecommendationsDetails)
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
        sb.append(",recommendationId=").append(String.valueOf(this.recommendationId));
        sb.append(",bulkApplyRecommendationsDetails=")
                .append(String.valueOf(this.bulkApplyRecommendationsDetails));
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
        if (!(o instanceof BulkApplyRecommendationsRequest)) {
            return false;
        }

        BulkApplyRecommendationsRequest other = (BulkApplyRecommendationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.recommendationId, other.recommendationId)
                && java.util.Objects.equals(
                        this.bulkApplyRecommendationsDetails, other.bulkApplyRecommendationsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.recommendationId == null ? 43 : this.recommendationId.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkApplyRecommendationsDetails == null
                                ? 43
                                : this.bulkApplyRecommendationsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
