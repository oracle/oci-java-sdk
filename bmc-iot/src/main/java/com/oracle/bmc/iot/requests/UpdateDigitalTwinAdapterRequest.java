/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.requests;

import com.oracle.bmc.iot.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/iot/UpdateDigitalTwinAdapterExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateDigitalTwinAdapterRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public class UpdateDigitalTwinAdapterRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.iot.model.UpdateDigitalTwinAdapterDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * digital twin adapter.
     */
    private String digitalTwinAdapterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * digital twin adapter.
     */
    public String getDigitalTwinAdapterId() {
        return digitalTwinAdapterId;
    }
    /** The digital twin adapter details to be updated. */
    private com.oracle.bmc.iot.model.UpdateDigitalTwinAdapterDetails
            updateDigitalTwinAdapterDetails;

    /** The digital twin adapter details to be updated. */
    public com.oracle.bmc.iot.model.UpdateDigitalTwinAdapterDetails
            getUpdateDigitalTwinAdapterDetails() {
        return updateDigitalTwinAdapterDetails;
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
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
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
    public com.oracle.bmc.iot.model.UpdateDigitalTwinAdapterDetails getBody$() {
        return updateDigitalTwinAdapterDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDigitalTwinAdapterRequest,
                    com.oracle.bmc.iot.model.UpdateDigitalTwinAdapterDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * digital twin adapter.
         */
        private String digitalTwinAdapterId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * digital twin adapter.
         *
         * @param digitalTwinAdapterId the value to set
         * @return this builder instance
         */
        public Builder digitalTwinAdapterId(String digitalTwinAdapterId) {
            this.digitalTwinAdapterId = digitalTwinAdapterId;
            return this;
        }

        /** The digital twin adapter details to be updated. */
        private com.oracle.bmc.iot.model.UpdateDigitalTwinAdapterDetails
                updateDigitalTwinAdapterDetails = null;

        /**
         * The digital twin adapter details to be updated.
         *
         * @param updateDigitalTwinAdapterDetails the value to set
         * @return this builder instance
         */
        public Builder updateDigitalTwinAdapterDetails(
                com.oracle.bmc.iot.model.UpdateDigitalTwinAdapterDetails
                        updateDigitalTwinAdapterDetails) {
            this.updateDigitalTwinAdapterDetails = updateDigitalTwinAdapterDetails;
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
         * particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
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
        public Builder copy(UpdateDigitalTwinAdapterRequest o) {
            digitalTwinAdapterId(o.getDigitalTwinAdapterId());
            updateDigitalTwinAdapterDetails(o.getUpdateDigitalTwinAdapterDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDigitalTwinAdapterRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateDigitalTwinAdapterRequest
         */
        public UpdateDigitalTwinAdapterRequest build() {
            UpdateDigitalTwinAdapterRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.iot.model.UpdateDigitalTwinAdapterDetails body) {
            updateDigitalTwinAdapterDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDigitalTwinAdapterRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDigitalTwinAdapterRequest
         */
        public UpdateDigitalTwinAdapterRequest buildWithoutInvocationCallback() {
            UpdateDigitalTwinAdapterRequest request = new UpdateDigitalTwinAdapterRequest();
            request.digitalTwinAdapterId = digitalTwinAdapterId;
            request.updateDigitalTwinAdapterDetails = updateDigitalTwinAdapterDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateDigitalTwinAdapterRequest(digitalTwinAdapterId,
            // updateDigitalTwinAdapterDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .digitalTwinAdapterId(digitalTwinAdapterId)
                .updateDigitalTwinAdapterDetails(updateDigitalTwinAdapterDetails)
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
        sb.append(",digitalTwinAdapterId=").append(String.valueOf(this.digitalTwinAdapterId));
        sb.append(",updateDigitalTwinAdapterDetails=")
                .append(String.valueOf(this.updateDigitalTwinAdapterDetails));
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
        if (!(o instanceof UpdateDigitalTwinAdapterRequest)) {
            return false;
        }

        UpdateDigitalTwinAdapterRequest other = (UpdateDigitalTwinAdapterRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.digitalTwinAdapterId, other.digitalTwinAdapterId)
                && java.util.Objects.equals(
                        this.updateDigitalTwinAdapterDetails, other.updateDigitalTwinAdapterDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.digitalTwinAdapterId == null
                                ? 43
                                : this.digitalTwinAdapterId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDigitalTwinAdapterDetails == null
                                ? 43
                                : this.updateDigitalTwinAdapterDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
