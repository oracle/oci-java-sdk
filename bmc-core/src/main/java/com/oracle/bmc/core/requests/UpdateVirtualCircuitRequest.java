/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVirtualCircuitExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateVirtualCircuitRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateVirtualCircuitRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateVirtualCircuitDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * virtual circuit.
     */
    private String virtualCircuitId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * virtual circuit.
     */
    public String getVirtualCircuitId() {
        return virtualCircuitId;
    }
    /** Update VirtualCircuit fields. */
    private com.oracle.bmc.core.model.UpdateVirtualCircuitDetails updateVirtualCircuitDetails;

    /** Update VirtualCircuit fields. */
    public com.oracle.bmc.core.model.UpdateVirtualCircuitDetails getUpdateVirtualCircuitDetails() {
        return updateVirtualCircuitDetails;
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
    public com.oracle.bmc.core.model.UpdateVirtualCircuitDetails getBody$() {
        return updateVirtualCircuitDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateVirtualCircuitRequest,
                    com.oracle.bmc.core.model.UpdateVirtualCircuitDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * virtual circuit.
         */
        private String virtualCircuitId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * virtual circuit.
         *
         * @param virtualCircuitId the value to set
         * @return this builder instance
         */
        public Builder virtualCircuitId(String virtualCircuitId) {
            this.virtualCircuitId = virtualCircuitId;
            return this;
        }

        /** Update VirtualCircuit fields. */
        private com.oracle.bmc.core.model.UpdateVirtualCircuitDetails updateVirtualCircuitDetails =
                null;

        /**
         * Update VirtualCircuit fields.
         *
         * @param updateVirtualCircuitDetails the value to set
         * @return this builder instance
         */
        public Builder updateVirtualCircuitDetails(
                com.oracle.bmc.core.model.UpdateVirtualCircuitDetails updateVirtualCircuitDetails) {
            this.updateVirtualCircuitDetails = updateVirtualCircuitDetails;
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
        public Builder copy(UpdateVirtualCircuitRequest o) {
            virtualCircuitId(o.getVirtualCircuitId());
            updateVirtualCircuitDetails(o.getUpdateVirtualCircuitDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateVirtualCircuitRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateVirtualCircuitRequest
         */
        public UpdateVirtualCircuitRequest build() {
            UpdateVirtualCircuitRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateVirtualCircuitDetails body) {
            updateVirtualCircuitDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateVirtualCircuitRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateVirtualCircuitRequest
         */
        public UpdateVirtualCircuitRequest buildWithoutInvocationCallback() {
            UpdateVirtualCircuitRequest request = new UpdateVirtualCircuitRequest();
            request.virtualCircuitId = virtualCircuitId;
            request.updateVirtualCircuitDetails = updateVirtualCircuitDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateVirtualCircuitRequest(virtualCircuitId, updateVirtualCircuitDetails,
            // ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .virtualCircuitId(virtualCircuitId)
                .updateVirtualCircuitDetails(updateVirtualCircuitDetails)
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
        sb.append(",virtualCircuitId=").append(String.valueOf(this.virtualCircuitId));
        sb.append(",updateVirtualCircuitDetails=")
                .append(String.valueOf(this.updateVirtualCircuitDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVirtualCircuitRequest)) {
            return false;
        }

        UpdateVirtualCircuitRequest other = (UpdateVirtualCircuitRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.virtualCircuitId, other.virtualCircuitId)
                && java.util.Objects.equals(
                        this.updateVirtualCircuitDetails, other.updateVirtualCircuitDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.virtualCircuitId == null ? 43 : this.virtualCircuitId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateVirtualCircuitDetails == null
                                ? 43
                                : this.updateVirtualCircuitDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
