/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.requests;

import com.oracle.bmc.servicecatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/servicecatalog/UpdatePrivateApplicationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdatePrivateApplicationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public class UpdatePrivateApplicationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.servicecatalog.model.UpdatePrivateApplicationDetails> {

    /** The unique identifier for the private application. */
    private String privateApplicationId;

    /** The unique identifier for the private application. */
    public String getPrivateApplicationId() {
        return privateApplicationId;
    }
    /** The details for updating the private application. */
    private com.oracle.bmc.servicecatalog.model.UpdatePrivateApplicationDetails
            updatePrivateApplicationDetails;

    /** The details for updating the private application. */
    public com.oracle.bmc.servicecatalog.model.UpdatePrivateApplicationDetails
            getUpdatePrivateApplicationDetails() {
        return updatePrivateApplicationDetails;
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
    public com.oracle.bmc.servicecatalog.model.UpdatePrivateApplicationDetails getBody$() {
        return updatePrivateApplicationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePrivateApplicationRequest,
                    com.oracle.bmc.servicecatalog.model.UpdatePrivateApplicationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique identifier for the private application. */
        private String privateApplicationId = null;

        /**
         * The unique identifier for the private application.
         *
         * @param privateApplicationId the value to set
         * @return this builder instance
         */
        public Builder privateApplicationId(String privateApplicationId) {
            this.privateApplicationId = privateApplicationId;
            return this;
        }

        /** The details for updating the private application. */
        private com.oracle.bmc.servicecatalog.model.UpdatePrivateApplicationDetails
                updatePrivateApplicationDetails = null;

        /**
         * The details for updating the private application.
         *
         * @param updatePrivateApplicationDetails the value to set
         * @return this builder instance
         */
        public Builder updatePrivateApplicationDetails(
                com.oracle.bmc.servicecatalog.model.UpdatePrivateApplicationDetails
                        updatePrivateApplicationDetails) {
            this.updatePrivateApplicationDetails = updatePrivateApplicationDetails;
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
        public Builder copy(UpdatePrivateApplicationRequest o) {
            privateApplicationId(o.getPrivateApplicationId());
            updatePrivateApplicationDetails(o.getUpdatePrivateApplicationDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePrivateApplicationRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdatePrivateApplicationRequest
         */
        public UpdatePrivateApplicationRequest build() {
            UpdatePrivateApplicationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.servicecatalog.model.UpdatePrivateApplicationDetails body) {
            updatePrivateApplicationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePrivateApplicationRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePrivateApplicationRequest
         */
        public UpdatePrivateApplicationRequest buildWithoutInvocationCallback() {
            UpdatePrivateApplicationRequest request = new UpdatePrivateApplicationRequest();
            request.privateApplicationId = privateApplicationId;
            request.updatePrivateApplicationDetails = updatePrivateApplicationDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdatePrivateApplicationRequest(privateApplicationId,
            // updatePrivateApplicationDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .privateApplicationId(privateApplicationId)
                .updatePrivateApplicationDetails(updatePrivateApplicationDetails)
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
        sb.append(",privateApplicationId=").append(String.valueOf(this.privateApplicationId));
        sb.append(",updatePrivateApplicationDetails=")
                .append(String.valueOf(this.updatePrivateApplicationDetails));
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
        if (!(o instanceof UpdatePrivateApplicationRequest)) {
            return false;
        }

        UpdatePrivateApplicationRequest other = (UpdatePrivateApplicationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.privateApplicationId, other.privateApplicationId)
                && java.util.Objects.equals(
                        this.updatePrivateApplicationDetails, other.updatePrivateApplicationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.privateApplicationId == null
                                ? 43
                                : this.privateApplicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePrivateApplicationDetails == null
                                ? 43
                                : this.updatePrivateApplicationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
