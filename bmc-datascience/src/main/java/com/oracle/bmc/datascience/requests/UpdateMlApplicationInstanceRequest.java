/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/UpdateMlApplicationInstanceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateMlApplicationInstanceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class UpdateMlApplicationInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datascience.model.UpdateMlApplicationInstanceDetails> {

    /** unique MlApplicationInstance identifier */
    private String mlApplicationInstanceId;

    /** unique MlApplicationInstance identifier */
    public String getMlApplicationInstanceId() {
        return mlApplicationInstanceId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.datascience.model.UpdateMlApplicationInstanceDetails
            updateMlApplicationInstanceDetails;

    /** The information to be updated. */
    public com.oracle.bmc.datascience.model.UpdateMlApplicationInstanceDetails
            getUpdateMlApplicationInstanceDetails() {
        return updateMlApplicationInstanceDetails;
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
    public com.oracle.bmc.datascience.model.UpdateMlApplicationInstanceDetails getBody$() {
        return updateMlApplicationInstanceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMlApplicationInstanceRequest,
                    com.oracle.bmc.datascience.model.UpdateMlApplicationInstanceDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique MlApplicationInstance identifier */
        private String mlApplicationInstanceId = null;

        /**
         * unique MlApplicationInstance identifier
         *
         * @param mlApplicationInstanceId the value to set
         * @return this builder instance
         */
        public Builder mlApplicationInstanceId(String mlApplicationInstanceId) {
            this.mlApplicationInstanceId = mlApplicationInstanceId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.datascience.model.UpdateMlApplicationInstanceDetails
                updateMlApplicationInstanceDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateMlApplicationInstanceDetails the value to set
         * @return this builder instance
         */
        public Builder updateMlApplicationInstanceDetails(
                com.oracle.bmc.datascience.model.UpdateMlApplicationInstanceDetails
                        updateMlApplicationInstanceDetails) {
            this.updateMlApplicationInstanceDetails = updateMlApplicationInstanceDetails;
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
        public Builder copy(UpdateMlApplicationInstanceRequest o) {
            mlApplicationInstanceId(o.getMlApplicationInstanceId());
            updateMlApplicationInstanceDetails(o.getUpdateMlApplicationInstanceDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMlApplicationInstanceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateMlApplicationInstanceRequest
         */
        public UpdateMlApplicationInstanceRequest build() {
            UpdateMlApplicationInstanceRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.datascience.model.UpdateMlApplicationInstanceDetails body) {
            updateMlApplicationInstanceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMlApplicationInstanceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMlApplicationInstanceRequest
         */
        public UpdateMlApplicationInstanceRequest buildWithoutInvocationCallback() {
            UpdateMlApplicationInstanceRequest request = new UpdateMlApplicationInstanceRequest();
            request.mlApplicationInstanceId = mlApplicationInstanceId;
            request.updateMlApplicationInstanceDetails = updateMlApplicationInstanceDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateMlApplicationInstanceRequest(mlApplicationInstanceId,
            // updateMlApplicationInstanceDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .mlApplicationInstanceId(mlApplicationInstanceId)
                .updateMlApplicationInstanceDetails(updateMlApplicationInstanceDetails)
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
        sb.append(",mlApplicationInstanceId=").append(String.valueOf(this.mlApplicationInstanceId));
        sb.append(",updateMlApplicationInstanceDetails=")
                .append(String.valueOf(this.updateMlApplicationInstanceDetails));
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
        if (!(o instanceof UpdateMlApplicationInstanceRequest)) {
            return false;
        }

        UpdateMlApplicationInstanceRequest other = (UpdateMlApplicationInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.mlApplicationInstanceId, other.mlApplicationInstanceId)
                && java.util.Objects.equals(
                        this.updateMlApplicationInstanceDetails,
                        other.updateMlApplicationInstanceDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.mlApplicationInstanceId == null
                                ? 43
                                : this.mlApplicationInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMlApplicationInstanceDetails == null
                                ? 43
                                : this.updateMlApplicationInstanceDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
