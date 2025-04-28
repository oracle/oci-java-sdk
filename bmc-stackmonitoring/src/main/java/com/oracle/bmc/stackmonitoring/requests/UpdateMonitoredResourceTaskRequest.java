/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/UpdateMonitoredResourceTaskExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateMonitoredResourceTaskRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class UpdateMonitoredResourceTaskRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceTaskDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of stack
     * monitoring resource task.
     */
    private String monitoredResourceTaskId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of stack
     * monitoring resource task.
     */
    public String getMonitoredResourceTaskId() {
        return monitoredResourceTaskId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceTaskDetails
            updateMonitoredResourceTaskDetails;

    /** The information to be updated. */
    public com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceTaskDetails
            getUpdateMonitoredResourceTaskDetails() {
        return updateMonitoredResourceTaskDetails;
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
    public com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceTaskDetails getBody$() {
        return updateMonitoredResourceTaskDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMonitoredResourceTaskRequest,
                    com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceTaskDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * stack monitoring resource task.
         */
        private String monitoredResourceTaskId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * stack monitoring resource task.
         *
         * @param monitoredResourceTaskId the value to set
         * @return this builder instance
         */
        public Builder monitoredResourceTaskId(String monitoredResourceTaskId) {
            this.monitoredResourceTaskId = monitoredResourceTaskId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceTaskDetails
                updateMonitoredResourceTaskDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateMonitoredResourceTaskDetails the value to set
         * @return this builder instance
         */
        public Builder updateMonitoredResourceTaskDetails(
                com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceTaskDetails
                        updateMonitoredResourceTaskDetails) {
            this.updateMonitoredResourceTaskDetails = updateMonitoredResourceTaskDetails;
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
        public Builder copy(UpdateMonitoredResourceTaskRequest o) {
            monitoredResourceTaskId(o.getMonitoredResourceTaskId());
            updateMonitoredResourceTaskDetails(o.getUpdateMonitoredResourceTaskDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMonitoredResourceTaskRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateMonitoredResourceTaskRequest
         */
        public UpdateMonitoredResourceTaskRequest build() {
            UpdateMonitoredResourceTaskRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceTaskDetails body) {
            updateMonitoredResourceTaskDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMonitoredResourceTaskRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMonitoredResourceTaskRequest
         */
        public UpdateMonitoredResourceTaskRequest buildWithoutInvocationCallback() {
            UpdateMonitoredResourceTaskRequest request = new UpdateMonitoredResourceTaskRequest();
            request.monitoredResourceTaskId = monitoredResourceTaskId;
            request.updateMonitoredResourceTaskDetails = updateMonitoredResourceTaskDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateMonitoredResourceTaskRequest(monitoredResourceTaskId,
            // updateMonitoredResourceTaskDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .monitoredResourceTaskId(monitoredResourceTaskId)
                .updateMonitoredResourceTaskDetails(updateMonitoredResourceTaskDetails)
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
        sb.append(",monitoredResourceTaskId=").append(String.valueOf(this.monitoredResourceTaskId));
        sb.append(",updateMonitoredResourceTaskDetails=")
                .append(String.valueOf(this.updateMonitoredResourceTaskDetails));
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
        if (!(o instanceof UpdateMonitoredResourceTaskRequest)) {
            return false;
        }

        UpdateMonitoredResourceTaskRequest other = (UpdateMonitoredResourceTaskRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.monitoredResourceTaskId, other.monitoredResourceTaskId)
                && java.util.Objects.equals(
                        this.updateMonitoredResourceTaskDetails,
                        other.updateMonitoredResourceTaskDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.monitoredResourceTaskId == null
                                ? 43
                                : this.monitoredResourceTaskId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMonitoredResourceTaskDetails == null
                                ? 43
                                : this.updateMonitoredResourceTaskDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
