/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.requests;

import com.oracle.bmc.healthchecks.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/UpdateHttpMonitorExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateHttpMonitorRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public class UpdateHttpMonitorRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.healthchecks.model.UpdateHttpMonitorDetails> {

    /**
     * The OCID of a monitor.
     */
    private String monitorId;

    public String getMonitorId() {
        return monitorId;
    }
    /**
     * The configuration details to update for the HTTP monitor.
     */
    private com.oracle.bmc.healthchecks.model.UpdateHttpMonitorDetails updateHttpMonitorDetails;

    public com.oracle.bmc.healthchecks.model.UpdateHttpMonitorDetails
            getUpdateHttpMonitorDetails() {
        return updateHttpMonitorDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous GET
     * or POST response for that resource.  The resource will be updated or deleted
     * only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.healthchecks.model.UpdateHttpMonitorDetails getBody$() {
        return updateHttpMonitorDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateHttpMonitorRequest,
                    com.oracle.bmc.healthchecks.model.UpdateHttpMonitorDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String monitorId = null;

        /**
         * The OCID of a monitor.
         * @return this builder instance
         */
        public Builder monitorId(String monitorId) {
            this.monitorId = monitorId;
            return this;
        }

        private com.oracle.bmc.healthchecks.model.UpdateHttpMonitorDetails
                updateHttpMonitorDetails = null;

        /**
         * The configuration details to update for the HTTP monitor.
         * @return this builder instance
         */
        public Builder updateHttpMonitorDetails(
                com.oracle.bmc.healthchecks.model.UpdateHttpMonitorDetails
                        updateHttpMonitorDetails) {
            this.updateHttpMonitorDetails = updateHttpMonitorDetails;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource,
         * set the {@code if-match} parameter to the value of the etag from a previous GET
         * or POST response for that resource.  The resource will be updated or deleted
         * only if the etag you provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateHttpMonitorRequest o) {
            monitorId(o.getMonitorId());
            updateHttpMonitorDetails(o.getUpdateHttpMonitorDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateHttpMonitorRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateHttpMonitorRequest
         */
        public UpdateHttpMonitorRequest build() {
            UpdateHttpMonitorRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.healthchecks.model.UpdateHttpMonitorDetails body) {
            updateHttpMonitorDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateHttpMonitorRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateHttpMonitorRequest
         */
        public UpdateHttpMonitorRequest buildWithoutInvocationCallback() {
            UpdateHttpMonitorRequest request = new UpdateHttpMonitorRequest();
            request.monitorId = monitorId;
            request.updateHttpMonitorDetails = updateHttpMonitorDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateHttpMonitorRequest(monitorId, updateHttpMonitorDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .monitorId(monitorId)
                .updateHttpMonitorDetails(updateHttpMonitorDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",monitorId=").append(String.valueOf(this.monitorId));
        sb.append(",updateHttpMonitorDetails=")
                .append(String.valueOf(this.updateHttpMonitorDetails));
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
        if (!(o instanceof UpdateHttpMonitorRequest)) {
            return false;
        }

        UpdateHttpMonitorRequest other = (UpdateHttpMonitorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.monitorId, other.monitorId)
                && java.util.Objects.equals(
                        this.updateHttpMonitorDetails, other.updateHttpMonitorDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.monitorId == null ? 43 : this.monitorId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateHttpMonitorDetails == null
                                ? 43
                                : this.updateHttpMonitorDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
