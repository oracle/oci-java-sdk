/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.requests;

import com.oracle.bmc.optimizer.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/optimizer/UpdateResourceActionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateResourceActionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
public class UpdateResourceActionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.optimizer.model.UpdateResourceActionDetails> {

    /** The unique OCID associated with the resource action. */
    private String resourceActionId;

    /** The unique OCID associated with the resource action. */
    public String getResourceActionId() {
        return resourceActionId;
    }
    /** The resource action information to be updated. */
    private com.oracle.bmc.optimizer.model.UpdateResourceActionDetails updateResourceActionDetails;

    /** The resource action information to be updated. */
    public com.oracle.bmc.optimizer.model.UpdateResourceActionDetails
            getUpdateResourceActionDetails() {
        return updateResourceActionDetails;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.optimizer.model.UpdateResourceActionDetails getBody$() {
        return updateResourceActionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateResourceActionRequest,
                    com.oracle.bmc.optimizer.model.UpdateResourceActionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique OCID associated with the resource action. */
        private String resourceActionId = null;

        /**
         * The unique OCID associated with the resource action.
         *
         * @param resourceActionId the value to set
         * @return this builder instance
         */
        public Builder resourceActionId(String resourceActionId) {
            this.resourceActionId = resourceActionId;
            return this;
        }

        /** The resource action information to be updated. */
        private com.oracle.bmc.optimizer.model.UpdateResourceActionDetails
                updateResourceActionDetails = null;

        /**
         * The resource action information to be updated.
         *
         * @param updateResourceActionDetails the value to set
         * @return this builder instance
         */
        public Builder updateResourceActionDetails(
                com.oracle.bmc.optimizer.model.UpdateResourceActionDetails
                        updateResourceActionDetails) {
            this.updateResourceActionDetails = updateResourceActionDetails;
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
        public Builder copy(UpdateResourceActionRequest o) {
            resourceActionId(o.getResourceActionId());
            updateResourceActionDetails(o.getUpdateResourceActionDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateResourceActionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateResourceActionRequest
         */
        public UpdateResourceActionRequest build() {
            UpdateResourceActionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.optimizer.model.UpdateResourceActionDetails body) {
            updateResourceActionDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateResourceActionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateResourceActionRequest
         */
        public UpdateResourceActionRequest buildWithoutInvocationCallback() {
            UpdateResourceActionRequest request = new UpdateResourceActionRequest();
            request.resourceActionId = resourceActionId;
            request.updateResourceActionDetails = updateResourceActionDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateResourceActionRequest(resourceActionId, updateResourceActionDetails,
            // opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .resourceActionId(resourceActionId)
                .updateResourceActionDetails(updateResourceActionDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",resourceActionId=").append(String.valueOf(this.resourceActionId));
        sb.append(",updateResourceActionDetails=")
                .append(String.valueOf(this.updateResourceActionDetails));
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
        if (!(o instanceof UpdateResourceActionRequest)) {
            return false;
        }

        UpdateResourceActionRequest other = (UpdateResourceActionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.resourceActionId, other.resourceActionId)
                && java.util.Objects.equals(
                        this.updateResourceActionDetails, other.updateResourceActionDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.resourceActionId == null ? 43 : this.resourceActionId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateResourceActionDetails == null
                                ? 43
                                : this.updateResourceActionDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
