/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.requests;

import com.oracle.bmc.generativeaiagent.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/UpdateProvisionedCapacityExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateProvisionedCapacityRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
public class UpdateProvisionedCapacityRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.generativeaiagent.model.UpdateProvisionedCapacityDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * provisioned capacity.
     */
    private String provisionedCapacityId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * provisioned capacity.
     */
    public String getProvisionedCapacityId() {
        return provisionedCapacityId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.generativeaiagent.model.UpdateProvisionedCapacityDetails
            updateProvisionedCapacityDetails;

    /** The information to be updated. */
    public com.oracle.bmc.generativeaiagent.model.UpdateProvisionedCapacityDetails
            getUpdateProvisionedCapacityDetails() {
        return updateProvisionedCapacityDetails;
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
    public com.oracle.bmc.generativeaiagent.model.UpdateProvisionedCapacityDetails getBody$() {
        return updateProvisionedCapacityDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateProvisionedCapacityRequest,
                    com.oracle.bmc.generativeaiagent.model.UpdateProvisionedCapacityDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * provisioned capacity.
         */
        private String provisionedCapacityId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * provisioned capacity.
         *
         * @param provisionedCapacityId the value to set
         * @return this builder instance
         */
        public Builder provisionedCapacityId(String provisionedCapacityId) {
            this.provisionedCapacityId = provisionedCapacityId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.generativeaiagent.model.UpdateProvisionedCapacityDetails
                updateProvisionedCapacityDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateProvisionedCapacityDetails the value to set
         * @return this builder instance
         */
        public Builder updateProvisionedCapacityDetails(
                com.oracle.bmc.generativeaiagent.model.UpdateProvisionedCapacityDetails
                        updateProvisionedCapacityDetails) {
            this.updateProvisionedCapacityDetails = updateProvisionedCapacityDetails;
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
        public Builder copy(UpdateProvisionedCapacityRequest o) {
            provisionedCapacityId(o.getProvisionedCapacityId());
            updateProvisionedCapacityDetails(o.getUpdateProvisionedCapacityDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateProvisionedCapacityRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateProvisionedCapacityRequest
         */
        public UpdateProvisionedCapacityRequest build() {
            UpdateProvisionedCapacityRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.generativeaiagent.model.UpdateProvisionedCapacityDetails body) {
            updateProvisionedCapacityDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateProvisionedCapacityRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateProvisionedCapacityRequest
         */
        public UpdateProvisionedCapacityRequest buildWithoutInvocationCallback() {
            UpdateProvisionedCapacityRequest request = new UpdateProvisionedCapacityRequest();
            request.provisionedCapacityId = provisionedCapacityId;
            request.updateProvisionedCapacityDetails = updateProvisionedCapacityDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateProvisionedCapacityRequest(provisionedCapacityId,
            // updateProvisionedCapacityDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .provisionedCapacityId(provisionedCapacityId)
                .updateProvisionedCapacityDetails(updateProvisionedCapacityDetails)
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
        sb.append(",provisionedCapacityId=").append(String.valueOf(this.provisionedCapacityId));
        sb.append(",updateProvisionedCapacityDetails=")
                .append(String.valueOf(this.updateProvisionedCapacityDetails));
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
        if (!(o instanceof UpdateProvisionedCapacityRequest)) {
            return false;
        }

        UpdateProvisionedCapacityRequest other = (UpdateProvisionedCapacityRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.provisionedCapacityId, other.provisionedCapacityId)
                && java.util.Objects.equals(
                        this.updateProvisionedCapacityDetails,
                        other.updateProvisionedCapacityDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.provisionedCapacityId == null
                                ? 43
                                : this.provisionedCapacityId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateProvisionedCapacityDetails == null
                                ? 43
                                : this.updateProvisionedCapacityDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
