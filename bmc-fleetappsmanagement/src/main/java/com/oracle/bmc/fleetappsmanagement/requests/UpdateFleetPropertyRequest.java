/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/UpdateFleetPropertyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateFleetPropertyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class UpdateFleetPropertyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.fleetappsmanagement.model.UpdateFleetPropertyDetails> {

    /** Unique fleetProperty identifier. */
    private String fleetPropertyId;

    /** Unique fleetProperty identifier. */
    public String getFleetPropertyId() {
        return fleetPropertyId;
    }
    /** Unique Fleet identifier. */
    private String fleetId;

    /** Unique Fleet identifier. */
    public String getFleetId() {
        return fleetId;
    }
    /** Attributes to update a fleet property. */
    private com.oracle.bmc.fleetappsmanagement.model.UpdateFleetPropertyDetails
            updateFleetPropertyDetails;

    /** Attributes to update a fleet property. */
    public com.oracle.bmc.fleetappsmanagement.model.UpdateFleetPropertyDetails
            getUpdateFleetPropertyDetails() {
        return updateFleetPropertyDetails;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public com.oracle.bmc.fleetappsmanagement.model.UpdateFleetPropertyDetails getBody$() {
        return updateFleetPropertyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateFleetPropertyRequest,
                    com.oracle.bmc.fleetappsmanagement.model.UpdateFleetPropertyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique fleetProperty identifier. */
        private String fleetPropertyId = null;

        /**
         * Unique fleetProperty identifier.
         *
         * @param fleetPropertyId the value to set
         * @return this builder instance
         */
        public Builder fleetPropertyId(String fleetPropertyId) {
            this.fleetPropertyId = fleetPropertyId;
            return this;
        }

        /** Unique Fleet identifier. */
        private String fleetId = null;

        /**
         * Unique Fleet identifier.
         *
         * @param fleetId the value to set
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        /** Attributes to update a fleet property. */
        private com.oracle.bmc.fleetappsmanagement.model.UpdateFleetPropertyDetails
                updateFleetPropertyDetails = null;

        /**
         * Attributes to update a fleet property.
         *
         * @param updateFleetPropertyDetails the value to set
         * @return this builder instance
         */
        public Builder updateFleetPropertyDetails(
                com.oracle.bmc.fleetappsmanagement.model.UpdateFleetPropertyDetails
                        updateFleetPropertyDetails) {
            this.updateFleetPropertyDetails = updateFleetPropertyDetails;
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

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateFleetPropertyRequest o) {
            fleetPropertyId(o.getFleetPropertyId());
            fleetId(o.getFleetId());
            updateFleetPropertyDetails(o.getUpdateFleetPropertyDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateFleetPropertyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateFleetPropertyRequest
         */
        public UpdateFleetPropertyRequest build() {
            UpdateFleetPropertyRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.fleetappsmanagement.model.UpdateFleetPropertyDetails body) {
            updateFleetPropertyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateFleetPropertyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateFleetPropertyRequest
         */
        public UpdateFleetPropertyRequest buildWithoutInvocationCallback() {
            UpdateFleetPropertyRequest request = new UpdateFleetPropertyRequest();
            request.fleetPropertyId = fleetPropertyId;
            request.fleetId = fleetId;
            request.updateFleetPropertyDetails = updateFleetPropertyDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateFleetPropertyRequest(fleetPropertyId, fleetId, updateFleetPropertyDetails,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fleetPropertyId(fleetPropertyId)
                .fleetId(fleetId)
                .updateFleetPropertyDetails(updateFleetPropertyDetails)
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
        sb.append(",fleetPropertyId=").append(String.valueOf(this.fleetPropertyId));
        sb.append(",fleetId=").append(String.valueOf(this.fleetId));
        sb.append(",updateFleetPropertyDetails=")
                .append(String.valueOf(this.updateFleetPropertyDetails));
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
        if (!(o instanceof UpdateFleetPropertyRequest)) {
            return false;
        }

        UpdateFleetPropertyRequest other = (UpdateFleetPropertyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fleetPropertyId, other.fleetPropertyId)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(
                        this.updateFleetPropertyDetails, other.updateFleetPropertyDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.fleetPropertyId == null ? 43 : this.fleetPropertyId.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateFleetPropertyDetails == null
                                ? 43
                                : this.updateFleetPropertyDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
