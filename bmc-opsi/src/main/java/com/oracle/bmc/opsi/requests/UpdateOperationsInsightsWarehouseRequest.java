/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateOperationsInsightsWarehouseExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateOperationsInsightsWarehouseRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class UpdateOperationsInsightsWarehouseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model.UpdateOperationsInsightsWarehouseDetails> {

    /** Unique Ops Insights Warehouse identifier */
    private String operationsInsightsWarehouseId;

    /** Unique Ops Insights Warehouse identifier */
    public String getOperationsInsightsWarehouseId() {
        return operationsInsightsWarehouseId;
    }
    /** The configuration to be updated. */
    private com.oracle.bmc.opsi.model.UpdateOperationsInsightsWarehouseDetails
            updateOperationsInsightsWarehouseDetails;

    /** The configuration to be updated. */
    public com.oracle.bmc.opsi.model.UpdateOperationsInsightsWarehouseDetails
            getUpdateOperationsInsightsWarehouseDetails() {
        return updateOperationsInsightsWarehouseDetails;
    }
    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.opsi.model.UpdateOperationsInsightsWarehouseDetails getBody$() {
        return updateOperationsInsightsWarehouseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOperationsInsightsWarehouseRequest,
                    com.oracle.bmc.opsi.model.UpdateOperationsInsightsWarehouseDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Ops Insights Warehouse identifier */
        private String operationsInsightsWarehouseId = null;

        /**
         * Unique Ops Insights Warehouse identifier
         *
         * @param operationsInsightsWarehouseId the value to set
         * @return this builder instance
         */
        public Builder operationsInsightsWarehouseId(String operationsInsightsWarehouseId) {
            this.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
            return this;
        }

        /** The configuration to be updated. */
        private com.oracle.bmc.opsi.model.UpdateOperationsInsightsWarehouseDetails
                updateOperationsInsightsWarehouseDetails = null;

        /**
         * The configuration to be updated.
         *
         * @param updateOperationsInsightsWarehouseDetails the value to set
         * @return this builder instance
         */
        public Builder updateOperationsInsightsWarehouseDetails(
                com.oracle.bmc.opsi.model.UpdateOperationsInsightsWarehouseDetails
                        updateOperationsInsightsWarehouseDetails) {
            this.updateOperationsInsightsWarehouseDetails =
                    updateOperationsInsightsWarehouseDetails;
            return this;
        }

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
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
        public Builder copy(UpdateOperationsInsightsWarehouseRequest o) {
            operationsInsightsWarehouseId(o.getOperationsInsightsWarehouseId());
            updateOperationsInsightsWarehouseDetails(
                    o.getUpdateOperationsInsightsWarehouseDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOperationsInsightsWarehouseRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOperationsInsightsWarehouseRequest
         */
        public UpdateOperationsInsightsWarehouseRequest build() {
            UpdateOperationsInsightsWarehouseRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.opsi.model.UpdateOperationsInsightsWarehouseDetails body) {
            updateOperationsInsightsWarehouseDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOperationsInsightsWarehouseRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOperationsInsightsWarehouseRequest
         */
        public UpdateOperationsInsightsWarehouseRequest buildWithoutInvocationCallback() {
            UpdateOperationsInsightsWarehouseRequest request =
                    new UpdateOperationsInsightsWarehouseRequest();
            request.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
            request.updateOperationsInsightsWarehouseDetails =
                    updateOperationsInsightsWarehouseDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOperationsInsightsWarehouseRequest(operationsInsightsWarehouseId,
            // updateOperationsInsightsWarehouseDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .operationsInsightsWarehouseId(operationsInsightsWarehouseId)
                .updateOperationsInsightsWarehouseDetails(updateOperationsInsightsWarehouseDetails)
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
        sb.append(",operationsInsightsWarehouseId=")
                .append(String.valueOf(this.operationsInsightsWarehouseId));
        sb.append(",updateOperationsInsightsWarehouseDetails=")
                .append(String.valueOf(this.updateOperationsInsightsWarehouseDetails));
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
        if (!(o instanceof UpdateOperationsInsightsWarehouseRequest)) {
            return false;
        }

        UpdateOperationsInsightsWarehouseRequest other =
                (UpdateOperationsInsightsWarehouseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.operationsInsightsWarehouseId, other.operationsInsightsWarehouseId)
                && java.util.Objects.equals(
                        this.updateOperationsInsightsWarehouseDetails,
                        other.updateOperationsInsightsWarehouseDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.operationsInsightsWarehouseId == null
                                ? 43
                                : this.operationsInsightsWarehouseId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOperationsInsightsWarehouseDetails == null
                                ? 43
                                : this.updateOperationsInsightsWarehouseDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
