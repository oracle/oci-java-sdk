/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/UpdateMlApplicationImplementationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateMlApplicationImplementationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class UpdateMlApplicationImplementationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationDetails> {

    /** unique MlApplicationImplementation identifier */
    private String mlApplicationImplementationId;

    /** unique MlApplicationImplementation identifier */
    public String getMlApplicationImplementationId() {
        return mlApplicationImplementationId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationDetails
            updateMlApplicationImplementationDetails;

    /** The information to be updated. */
    public com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationDetails
            getUpdateMlApplicationImplementationDetails() {
        return updateMlApplicationImplementationDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
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
    public com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationDetails getBody$() {
        return updateMlApplicationImplementationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMlApplicationImplementationRequest,
                    com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique MlApplicationImplementation identifier */
        private String mlApplicationImplementationId = null;

        /**
         * unique MlApplicationImplementation identifier
         *
         * @param mlApplicationImplementationId the value to set
         * @return this builder instance
         */
        public Builder mlApplicationImplementationId(String mlApplicationImplementationId) {
            this.mlApplicationImplementationId = mlApplicationImplementationId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationDetails
                updateMlApplicationImplementationDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateMlApplicationImplementationDetails the value to set
         * @return this builder instance
         */
        public Builder updateMlApplicationImplementationDetails(
                com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationDetails
                        updateMlApplicationImplementationDetails) {
            this.updateMlApplicationImplementationDetails =
                    updateMlApplicationImplementationDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
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
        public Builder copy(UpdateMlApplicationImplementationRequest o) {
            mlApplicationImplementationId(o.getMlApplicationImplementationId());
            updateMlApplicationImplementationDetails(
                    o.getUpdateMlApplicationImplementationDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMlApplicationImplementationRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateMlApplicationImplementationRequest
         */
        public UpdateMlApplicationImplementationRequest build() {
            UpdateMlApplicationImplementationRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationDetails body) {
            updateMlApplicationImplementationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMlApplicationImplementationRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMlApplicationImplementationRequest
         */
        public UpdateMlApplicationImplementationRequest buildWithoutInvocationCallback() {
            UpdateMlApplicationImplementationRequest request =
                    new UpdateMlApplicationImplementationRequest();
            request.mlApplicationImplementationId = mlApplicationImplementationId;
            request.updateMlApplicationImplementationDetails =
                    updateMlApplicationImplementationDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateMlApplicationImplementationRequest(mlApplicationImplementationId,
            // updateMlApplicationImplementationDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .mlApplicationImplementationId(mlApplicationImplementationId)
                .updateMlApplicationImplementationDetails(updateMlApplicationImplementationDetails)
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
        sb.append(",mlApplicationImplementationId=")
                .append(String.valueOf(this.mlApplicationImplementationId));
        sb.append(",updateMlApplicationImplementationDetails=")
                .append(String.valueOf(this.updateMlApplicationImplementationDetails));
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
        if (!(o instanceof UpdateMlApplicationImplementationRequest)) {
            return false;
        }

        UpdateMlApplicationImplementationRequest other =
                (UpdateMlApplicationImplementationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.mlApplicationImplementationId, other.mlApplicationImplementationId)
                && java.util.Objects.equals(
                        this.updateMlApplicationImplementationDetails,
                        other.updateMlApplicationImplementationDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.mlApplicationImplementationId == null
                                ? 43
                                : this.mlApplicationImplementationId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMlApplicationImplementationDetails == null
                                ? 43
                                : this.updateMlApplicationImplementationDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
