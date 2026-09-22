/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.requests;

import com.oracle.bmc.generativeai.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/UpdateRoutingProfileExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateRoutingProfileRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class UpdateRoutingProfileRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.generativeai.model.UpdateRoutingProfileDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * routing profile.
     */
    private String routingProfileId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * routing profile.
     */
    public String getRoutingProfileId() {
        return routingProfileId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.generativeai.model.UpdateRoutingProfileDetails
            updateRoutingProfileDetails;

    /** The information to be updated. */
    public com.oracle.bmc.generativeai.model.UpdateRoutingProfileDetails
            getUpdateRoutingProfileDetails() {
        return updateRoutingProfileDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
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
    public com.oracle.bmc.generativeai.model.UpdateRoutingProfileDetails getBody$() {
        return updateRoutingProfileDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateRoutingProfileRequest,
                    com.oracle.bmc.generativeai.model.UpdateRoutingProfileDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * routing profile.
         */
        private String routingProfileId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * routing profile.
         *
         * @param routingProfileId the value to set
         * @return this builder instance
         */
        public Builder routingProfileId(String routingProfileId) {
            this.routingProfileId = routingProfileId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.generativeai.model.UpdateRoutingProfileDetails
                updateRoutingProfileDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateRoutingProfileDetails the value to set
         * @return this builder instance
         */
        public Builder updateRoutingProfileDetails(
                com.oracle.bmc.generativeai.model.UpdateRoutingProfileDetails
                        updateRoutingProfileDetails) {
            this.updateRoutingProfileDetails = updateRoutingProfileDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
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
        public Builder copy(UpdateRoutingProfileRequest o) {
            routingProfileId(o.getRoutingProfileId());
            updateRoutingProfileDetails(o.getUpdateRoutingProfileDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateRoutingProfileRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateRoutingProfileRequest
         */
        public UpdateRoutingProfileRequest build() {
            UpdateRoutingProfileRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.generativeai.model.UpdateRoutingProfileDetails body) {
            updateRoutingProfileDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateRoutingProfileRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateRoutingProfileRequest
         */
        public UpdateRoutingProfileRequest buildWithoutInvocationCallback() {
            UpdateRoutingProfileRequest request = new UpdateRoutingProfileRequest();
            request.routingProfileId = routingProfileId;
            request.updateRoutingProfileDetails = updateRoutingProfileDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateRoutingProfileRequest(routingProfileId, updateRoutingProfileDetails,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .routingProfileId(routingProfileId)
                .updateRoutingProfileDetails(updateRoutingProfileDetails)
                .ifMatch(ifMatch)
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
        sb.append(",routingProfileId=").append(String.valueOf(this.routingProfileId));
        sb.append(",updateRoutingProfileDetails=")
                .append(String.valueOf(this.updateRoutingProfileDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRoutingProfileRequest)) {
            return false;
        }

        UpdateRoutingProfileRequest other = (UpdateRoutingProfileRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.routingProfileId, other.routingProfileId)
                && java.util.Objects.equals(
                        this.updateRoutingProfileDetails, other.updateRoutingProfileDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.routingProfileId == null ? 43 : this.routingProfileId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateRoutingProfileDetails == null
                                ? 43
                                : this.updateRoutingProfileDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
