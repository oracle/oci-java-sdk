/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emwarehouse.requests;

import com.oracle.bmc.emwarehouse.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/emwarehouse/UpdateEmWarehouseExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateEmWarehouseRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class UpdateEmWarehouseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.emwarehouse.model.UpdateEmWarehouseDetails> {

    /**
     * unique EmWarehouse identifier
     */
    private String emWarehouseId;

    /**
     * unique EmWarehouse identifier
     */
    public String getEmWarehouseId() {
        return emWarehouseId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.emwarehouse.model.UpdateEmWarehouseDetails updateEmWarehouseDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.emwarehouse.model.UpdateEmWarehouseDetails getUpdateEmWarehouseDetails() {
        return updateEmWarehouseDetails;
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
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
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
    public com.oracle.bmc.emwarehouse.model.UpdateEmWarehouseDetails getBody$() {
        return updateEmWarehouseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateEmWarehouseRequest,
                    com.oracle.bmc.emwarehouse.model.UpdateEmWarehouseDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * unique EmWarehouse identifier
         */
        private String emWarehouseId = null;

        /**
         * unique EmWarehouse identifier
         * @param emWarehouseId the value to set
         * @return this builder instance
         */
        public Builder emWarehouseId(String emWarehouseId) {
            this.emWarehouseId = emWarehouseId;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.emwarehouse.model.UpdateEmWarehouseDetails updateEmWarehouseDetails =
                null;

        /**
         * The information to be updated.
         * @param updateEmWarehouseDetails the value to set
         * @return this builder instance
         */
        public Builder updateEmWarehouseDetails(
                com.oracle.bmc.emwarehouse.model.UpdateEmWarehouseDetails
                        updateEmWarehouseDetails) {
            this.updateEmWarehouseDetails = updateEmWarehouseDetails;
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
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateEmWarehouseRequest o) {
            emWarehouseId(o.getEmWarehouseId());
            updateEmWarehouseDetails(o.getUpdateEmWarehouseDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateEmWarehouseRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateEmWarehouseRequest
         */
        public UpdateEmWarehouseRequest build() {
            UpdateEmWarehouseRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.emwarehouse.model.UpdateEmWarehouseDetails body) {
            updateEmWarehouseDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateEmWarehouseRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateEmWarehouseRequest
         */
        public UpdateEmWarehouseRequest buildWithoutInvocationCallback() {
            UpdateEmWarehouseRequest request = new UpdateEmWarehouseRequest();
            request.emWarehouseId = emWarehouseId;
            request.updateEmWarehouseDetails = updateEmWarehouseDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateEmWarehouseRequest(emWarehouseId, updateEmWarehouseDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .emWarehouseId(emWarehouseId)
                .updateEmWarehouseDetails(updateEmWarehouseDetails)
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
        sb.append(",emWarehouseId=").append(String.valueOf(this.emWarehouseId));
        sb.append(",updateEmWarehouseDetails=")
                .append(String.valueOf(this.updateEmWarehouseDetails));
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
        if (!(o instanceof UpdateEmWarehouseRequest)) {
            return false;
        }

        UpdateEmWarehouseRequest other = (UpdateEmWarehouseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.emWarehouseId, other.emWarehouseId)
                && java.util.Objects.equals(
                        this.updateEmWarehouseDetails, other.updateEmWarehouseDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.emWarehouseId == null ? 43 : this.emWarehouseId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateEmWarehouseDetails == null
                                ? 43
                                : this.updateEmWarehouseDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
