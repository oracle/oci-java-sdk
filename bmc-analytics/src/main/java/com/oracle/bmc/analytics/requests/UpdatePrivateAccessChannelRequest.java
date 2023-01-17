/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.requests;

import com.oracle.bmc.analytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/UpdatePrivateAccessChannelExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdatePrivateAccessChannelRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public class UpdatePrivateAccessChannelRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.analytics.model.UpdatePrivateAccessChannelDetails> {

    /**
     * The unique identifier key of the Private Access Channel.
     *
     */
    private String privateAccessChannelKey;

    /**
     * The unique identifier key of the Private Access Channel.
     *
     */
    public String getPrivateAccessChannelKey() {
        return privateAccessChannelKey;
    }
    /**
     * The OCID of the AnalyticsInstance.
     *
     */
    private String analyticsInstanceId;

    /**
     * The OCID of the AnalyticsInstance.
     *
     */
    public String getAnalyticsInstanceId() {
        return analyticsInstanceId;
    }
    /**
     * Update the Private Access Channel with the given unique identifier key in the specified Analytics Instance.
     *
     */
    private com.oracle.bmc.analytics.model.UpdatePrivateAccessChannelDetails
            updatePrivateAccessChannelDetails;

    /**
     * Update the Private Access Channel with the given unique identifier key in the specified Analytics Instance.
     *
     */
    public com.oracle.bmc.analytics.model.UpdatePrivateAccessChannelDetails
            getUpdatePrivateAccessChannelDetails() {
        return updatePrivateAccessChannelDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.analytics.model.UpdatePrivateAccessChannelDetails getBody$() {
        return updatePrivateAccessChannelDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePrivateAccessChannelRequest,
                    com.oracle.bmc.analytics.model.UpdatePrivateAccessChannelDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The unique identifier key of the Private Access Channel.
         *
         */
        private String privateAccessChannelKey = null;

        /**
         * The unique identifier key of the Private Access Channel.
         *
         * @param privateAccessChannelKey the value to set
         * @return this builder instance
         */
        public Builder privateAccessChannelKey(String privateAccessChannelKey) {
            this.privateAccessChannelKey = privateAccessChannelKey;
            return this;
        }

        /**
         * The OCID of the AnalyticsInstance.
         *
         */
        private String analyticsInstanceId = null;

        /**
         * The OCID of the AnalyticsInstance.
         *
         * @param analyticsInstanceId the value to set
         * @return this builder instance
         */
        public Builder analyticsInstanceId(String analyticsInstanceId) {
            this.analyticsInstanceId = analyticsInstanceId;
            return this;
        }

        /**
         * Update the Private Access Channel with the given unique identifier key in the specified Analytics Instance.
         *
         */
        private com.oracle.bmc.analytics.model.UpdatePrivateAccessChannelDetails
                updatePrivateAccessChannelDetails = null;

        /**
         * Update the Private Access Channel with the given unique identifier key in the specified Analytics Instance.
         *
         * @param updatePrivateAccessChannelDetails the value to set
         * @return this builder instance
         */
        public Builder updatePrivateAccessChannelDetails(
                com.oracle.bmc.analytics.model.UpdatePrivateAccessChannelDetails
                        updatePrivateAccessChannelDetails) {
            this.updatePrivateAccessChannelDetails = updatePrivateAccessChannelDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
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
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
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
        public Builder copy(UpdatePrivateAccessChannelRequest o) {
            privateAccessChannelKey(o.getPrivateAccessChannelKey());
            analyticsInstanceId(o.getAnalyticsInstanceId());
            updatePrivateAccessChannelDetails(o.getUpdatePrivateAccessChannelDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePrivateAccessChannelRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdatePrivateAccessChannelRequest
         */
        public UpdatePrivateAccessChannelRequest build() {
            UpdatePrivateAccessChannelRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.analytics.model.UpdatePrivateAccessChannelDetails body) {
            updatePrivateAccessChannelDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePrivateAccessChannelRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePrivateAccessChannelRequest
         */
        public UpdatePrivateAccessChannelRequest buildWithoutInvocationCallback() {
            UpdatePrivateAccessChannelRequest request = new UpdatePrivateAccessChannelRequest();
            request.privateAccessChannelKey = privateAccessChannelKey;
            request.analyticsInstanceId = analyticsInstanceId;
            request.updatePrivateAccessChannelDetails = updatePrivateAccessChannelDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new UpdatePrivateAccessChannelRequest(privateAccessChannelKey, analyticsInstanceId, updatePrivateAccessChannelDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .privateAccessChannelKey(privateAccessChannelKey)
                .analyticsInstanceId(analyticsInstanceId)
                .updatePrivateAccessChannelDetails(updatePrivateAccessChannelDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
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
        sb.append(",privateAccessChannelKey=").append(String.valueOf(this.privateAccessChannelKey));
        sb.append(",analyticsInstanceId=").append(String.valueOf(this.analyticsInstanceId));
        sb.append(",updatePrivateAccessChannelDetails=")
                .append(String.valueOf(this.updatePrivateAccessChannelDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
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
        if (!(o instanceof UpdatePrivateAccessChannelRequest)) {
            return false;
        }

        UpdatePrivateAccessChannelRequest other = (UpdatePrivateAccessChannelRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.privateAccessChannelKey, other.privateAccessChannelKey)
                && java.util.Objects.equals(this.analyticsInstanceId, other.analyticsInstanceId)
                && java.util.Objects.equals(
                        this.updatePrivateAccessChannelDetails,
                        other.updatePrivateAccessChannelDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.privateAccessChannelKey == null
                                ? 43
                                : this.privateAccessChannelKey.hashCode());
        result =
                (result * PRIME)
                        + (this.analyticsInstanceId == null
                                ? 43
                                : this.analyticsInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePrivateAccessChannelDetails == null
                                ? 43
                                : this.updatePrivateAccessChannelDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
