/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.requests;

import com.oracle.bmc.apigateway.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apigateway/UpdateSdkExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateSdkRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class UpdateSdkRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apigateway.model.UpdateSdkDetails> {

    /**
     * The ocid of the SDK.
     */
    private String sdkId;

    /**
     * The ocid of the SDK.
     */
    public String getSdkId() {
        return sdkId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.apigateway.model.UpdateSdkDetails updateSdkDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.apigateway.model.UpdateSdkDetails getUpdateSdkDetails() {
        return updateSdkDetails;
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
     * The client request id for tracing.
     */
    private String opcRequestId;

    /**
     * The client request id for tracing.
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
    public com.oracle.bmc.apigateway.model.UpdateSdkDetails getBody$() {
        return updateSdkDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSdkRequest, com.oracle.bmc.apigateway.model.UpdateSdkDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ocid of the SDK.
         */
        private String sdkId = null;

        /**
         * The ocid of the SDK.
         * @param sdkId the value to set
         * @return this builder instance
         */
        public Builder sdkId(String sdkId) {
            this.sdkId = sdkId;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.apigateway.model.UpdateSdkDetails updateSdkDetails = null;

        /**
         * The information to be updated.
         * @param updateSdkDetails the value to set
         * @return this builder instance
         */
        public Builder updateSdkDetails(
                com.oracle.bmc.apigateway.model.UpdateSdkDetails updateSdkDetails) {
            this.updateSdkDetails = updateSdkDetails;
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
         * The client request id for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request id for tracing.
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
        public Builder copy(UpdateSdkRequest o) {
            sdkId(o.getSdkId());
            updateSdkDetails(o.getUpdateSdkDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSdkRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateSdkRequest
         */
        public UpdateSdkRequest build() {
            UpdateSdkRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.apigateway.model.UpdateSdkDetails body) {
            updateSdkDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSdkRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSdkRequest
         */
        public UpdateSdkRequest buildWithoutInvocationCallback() {
            UpdateSdkRequest request = new UpdateSdkRequest();
            request.sdkId = sdkId;
            request.updateSdkDetails = updateSdkDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateSdkRequest(sdkId, updateSdkDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sdkId(sdkId)
                .updateSdkDetails(updateSdkDetails)
                .ifMatch(ifMatch)
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
        sb.append(",sdkId=").append(String.valueOf(this.sdkId));
        sb.append(",updateSdkDetails=").append(String.valueOf(this.updateSdkDetails));
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
        if (!(o instanceof UpdateSdkRequest)) {
            return false;
        }

        UpdateSdkRequest other = (UpdateSdkRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sdkId, other.sdkId)
                && java.util.Objects.equals(this.updateSdkDetails, other.updateSdkDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sdkId == null ? 43 : this.sdkId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSdkDetails == null ? 43 : this.updateSdkDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
